package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestBase;

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

    public UserAccountPage inputPassword(String password) {
        inputPasswordElement.sendKeys(password);
        return new UserAccountPage();
    }

    public UserAccountPage clickLogin() {
        loginButtonElement.click();
        return new UserAccountPage();
    }
}






































