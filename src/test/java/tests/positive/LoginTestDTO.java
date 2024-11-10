package tests.positive;

import DTO.CSVReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

import java.io.IOException;

public class LoginTestDTO extends TestBase {

    protected CSVReader csvReader = new CSVReader();
    protected PageBase pageBase = new PageBase();
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected UserAccountPage userAccountPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
    }

    @Test
    public void login() throws IOException {
        homePage.openLoginPage();
        pageBase.pause(3000);
        loginPage.inputEmailOrUsername(csvReader.getUserName())
                .inputPassword(csvReader.getUserPass().trim());
        logger.info("User logged in with username: " + csvReader.getUserName());
        pageBase.pause(3000);
        loginPage.clickLogin();
        pageBase.pause(10000);
        Assert.assertTrue(userAccountPage.userAccountWidgetElement.isDisplayed());
    }



}
