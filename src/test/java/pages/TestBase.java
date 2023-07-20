package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver wd;

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected UserAccountPage userAccountPage;
    LikedSongsPage likedSongsPage;

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

    @AfterMethod
    public void tearDown(){

        wd.quit();
    }
}
