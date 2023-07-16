package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='login-username']")
    WebElement inputUsernameElement;

    @FindBy(xpath = "//*[@id='login-password']")
    WebElement inputPasswordElement;

    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButtonElement;

    public LoginPage inputEmailOrUsername(String username) {
        inputUsernameElement.sendKeys(username);
        return this;
    }

    public LoginPage inputPassword(String password) {
        inputPasswordElement.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        loginButtonElement.click();
    }
}






































