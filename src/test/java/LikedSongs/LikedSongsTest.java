package LikedSongs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import tests.positive.LikedSongsListTestDTO;

public class LikedSongsTest extends TestBase {
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected PageBase pageBase = new PageBase();
    protected UserAccountPage userAccountPage;
    protected LikedSongsPage likedSongsPage;
    protected LikedSongsListTestDTO likedSongsListTestDTO;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
        likedSongsPage = PageFactory.initElements(wd, LikedSongsPage.class);
    }

//    public void loginUser() {
//        homePage.openLoginPage();
//        pageBase.pause(3000);
//        loginPage.inputEmailOrUsername("31rfoxcjjiqeil3rdj5jhlevna4e")
//                .inputPassword("Albertovich1988").clickLogin();
//        pageBase.pause(5000);
//        Assert.assertTrue(userAccountPage.userAccountWidgetElement.isDisplayed());
//    }



//    public void scroll() {
////        JavascriptExecutor j = (JavascriptExecutor) driver;
////        j.executeScript("window.scrollBy(0,500)");
//        ((JavascriptExecutor) wd).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    }

}
