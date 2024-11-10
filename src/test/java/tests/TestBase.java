package tests;

import DTO.CSVReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.io.IOException;
import java.lang.reflect.Method;

public class TestBase {
    public WebDriver wd;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected UserAccountPage userAccountPage;
    LikedSongsPage likedSongsPage;
    protected Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected PageBase pageBase;
    protected CSVReader csvReader;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.navigate().to("https://open.spotify.com/");
        wd.manage().window().maximize();
    }

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
        likedSongsPage = PageFactory.initElements(wd, LikedSongsPage.class);

    }

    @AfterMethod(alwaysRun = true)
    public void stopTest(Method method, ITestResult result) {
        if (result.isSuccess())
            logger.info("Test result --> PASSED");
        else
            logger.info("Test result --> FAILED");
        logger.info("Stop test ---> " + method.getName());
        logger.info("=========================================================================");
    }

//    public void loginUser(String userName, String userPass) throws IOException {
//        pageBase.pause(3000);
//        homePage.openLoginPage();
//        loginPage.inputEmailOrUsername(csvReader.getUserName())
//                .inputPassword(csvReader.getUserPass().trim())
//                .clickLogin();
//    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        wd.quit();
    }
}
