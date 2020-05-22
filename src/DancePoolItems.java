import java.awt.*;

public class DancePoolItems extends Container {
    private String lightMusic;
    private String song;
    private String time;

    public DancePoolItems(String lightMusic, String song, String time) {
        this.lightMusic = lightMusic;
        this.song = song;
        this.time = time;
    }

    public String getLightMusic() {
        return lightMusic;
    }

    public void setLightMusic(String lightMusic) {
        this.lightMusic = lightMusic;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DancePoolItems() {
    }
    public String toString(){return " Light Music: " + lightMusic + " " + " Type Of Song: " + song + " How many hours: " + time;  }
}
