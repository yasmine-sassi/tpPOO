public class Song {
    private String title;
    private Artist artist;
    private int length;

    public Song(String title, Artist artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public void playSong() {
        System.out.println("Playing: " + title + " by " + artist.getName());
    }
}
