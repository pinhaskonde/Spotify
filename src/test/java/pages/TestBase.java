package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.navigate().to("https://open.spotify.com/");
        wd.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){

        wd.quit();
    }
}
