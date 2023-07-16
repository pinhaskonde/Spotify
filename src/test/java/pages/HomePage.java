package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.LoginPage;

public class HomePage extends TestBase {

    @FindBy(xpath = "//button[@data-testid='login-button']")
    WebElement loginButtonElement;

    public LoginPage openLoginPage(){
        loginButtonElement.click();
        return new LoginPage();
    }





}
