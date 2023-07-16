package login;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class LoginPositiveTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    PageBase pageBase = new PageBase();
    UserAccountPage userAccountPage;

    @BeforeMethod
    private void init(){
        homePage = PageFactory.initElements(wd,HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
    }

    @Test
    public void login(){
        homePage.openLoginPage();
        pageBase.pause(3300);
        loginPage.inputEmailOrUsername("31rfoxcjjiqeil3rdj5jhlevna4e")
                        .inputPassword("Albertovich1988").clickLogin();
        pageBase.pause(3300);
        Assert.assertTrue(userAccountPage.userAccountWidgetElement.isDisplayed());
    }


}
