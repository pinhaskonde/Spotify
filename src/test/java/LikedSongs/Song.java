package LikedSongs;

public class Song {
    String title;
    String songName;
    String artist;
    String album;
    String dateAdded;
    String duration;

    public Song(String title, String songName, String artist,
                String album, String dateAdded, String duration) {
        this.title = title;
        this.songName = songName;
        this.artist = artist;
        this.album = album;
        this.dateAdded = dateAdded;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }



}
