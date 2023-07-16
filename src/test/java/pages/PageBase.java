package pages;

import org.openqa.selenium.WebElement;

public class PageBase {


    public void pause(int millise){
        try {
            Thread.sleep(millise);
        }catch (InterruptedException e){

        }
    }




}
