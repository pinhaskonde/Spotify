package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class LoginTestPositive extends TestBase {

    PageBase pageBase = new PageBase();
    HomePage homePage;
//    LoginPage loginPage;
    UserAccountPage userAccountPage;
    LikedSongsPage likedSongsPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
        likedSongsPage = PageFactory.initElements(wd, LikedSongsPage.class);

    }

    @Test
    public void login(){
        homePage.openLoginPage();
        pageBase.pause(3000);
        loginPage.inputEmailOrUsername("31rfoxcjjiqeil3rdj5jhlevna4e")
                                        .inputPassword("Albertovich1988")
                                                            .clickLogin();
//        pageBase.pause(3000);
        Assert.assertTrue(userAccountPage.userAccountWidgetElement.isDisplayed());
    }


}
