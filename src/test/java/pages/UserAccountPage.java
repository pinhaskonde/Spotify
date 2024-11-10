package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestBase;

public class UserAccountPage extends TestBase {

    @FindBy(xpath = "//button[@data-testid='user-widget-link']")
    public
    WebElement userAccountWidgetElement;



}
