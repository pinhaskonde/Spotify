package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserAccountPage {

    @FindBy(xpath = "//button[@data-testid='user-widget-link']")
    public
    WebElement userAccountWidgetElement;

    @FindBy(xpath = " //*[@id='main']/div/div[2]/div[4]/div[1]/div[2]/div[2]/div/div/div[2]/main/section/div/div/section[1]/div[2]/div[1]/div/div[3]")
    WebElement likedSongsElement;

    public void clickLikedSongsElement() {
            likedSongsElement.click();
    }

    public WebElement getLikedSongsElement() {
        return likedSongsElement;
    }
}
