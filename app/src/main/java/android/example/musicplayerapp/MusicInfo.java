package android.example.musicplayerapp;

public class MusicInfo {

    /** Music Title */
    private String title;

    /** Music Artist */
    private String artist;

    /** Image resource ID for the music */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this music */
    private static final int NO_IMAGE_PROVIDED = -1;

    public MusicInfo(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
