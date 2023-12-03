import java.util.ArrayList;
public class Album {
    private String title;
    private Artist artist;
    private ArrayList<Song> songs;

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
        } else {
            System.out.println("Song not found in the album.");
        }
    }

    public void listSongs() {
        System.out.println("Songs in the album " + title + ":");
        for (Song song : songs) {
            System.out.println("   * " + song.getTitle() + " (" + song.getLength() + " seconds)");
        }
    }
    public String getTitle(){
        return this.title;
    }
}
