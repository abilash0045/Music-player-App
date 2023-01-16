public class Song {
    private String title;
    private double duration;
    private String artist;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Song(String title, double duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public Song(String title, double duration, String artist, String genre) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;
    }
}
