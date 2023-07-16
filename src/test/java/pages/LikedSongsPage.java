package pages;

import LikedSongs.Song;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LikedSongsPage extends PageBase {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[4]/div[1]/div[2]/div[2]/div/div/div[2]/main/section/div[4]/div/div[2]/div[2]/div")
    List<WebElement> listOfLikedSongsElement;


    @Test
    public void getListStr() {
        pause(1000);
        List<String> listSongsTxt = new ArrayList<>();

        for (WebElement element : listOfLikedSongsElement) {
            String songTxt = element.getText();
            listSongsTxt.add(songTxt);
        }
        for (String song : listSongsTxt) {
            System.out.println(song);
            System.out.println("---     ---     ---");
        }
    }

    public void splitTxtSong() {
        List<Song> songList = new ArrayList<>();

    }

}
