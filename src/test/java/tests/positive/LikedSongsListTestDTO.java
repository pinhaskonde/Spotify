package tests.positive;

import DTO.CSVReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

import java.io.IOException;

public class LikedSongsListTestDTO extends TestBase {

    protected CSVReader csvReader = new CSVReader();
    protected PageBase pageBase = new PageBase();
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected UserAccountPage userAccountPage;
    protected LikedSongsPage likedSongsPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        loginPage = PageFactory.initElements(wd, LoginPage.class);
        userAccountPage = PageFactory.initElements(wd, UserAccountPage.class);
        likedSongsPage = PageFactory.initElements(wd,LikedSongsPage.class);
    }

    @Test
    public void testik() throws IOException {
        homePage.openLoginPage().
                inputEmailOrUsername(csvReader.getUserName()).
                inputPassword(csvReader.getUserPass());

        pageBase.pause(7000);


    }

}
