package LikedSongs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LikedSongsTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    PageBase pageBase = new PageBase();
    UserAccountPage userAccountPage;
    LikedSongsPage likedSongsPage;
    Song song;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
        likedSongsPage = PageFactory.initElements(wd, LikedSongsPage.class);

    }

    @Test
    public void getListLikedSongs() throws IOException {
        loginUser();
        pageBase.pause(1500);
        userAccountPage.clickLikedSongsElement();
//  ___________________________________________________  //

        likedSongsPage.getListStr();







    }


    public void loginUser() {
        homePage.openLoginPage();
        pageBase.pause(3000);
        loginPage.inputEmailOrUsername("31rfoxcjjiqeil3rdj5jhlevna4e")
                .inputPassword("Albertovich1988").clickLogin();
        pageBase.pause(5000);

        Assert.assertTrue(userAccountPage.userAccountWidgetElement.isDisplayed());
    }

    public void scroll() {
//        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("window.scrollBy(0,500)");
        ((JavascriptExecutor) wd).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
