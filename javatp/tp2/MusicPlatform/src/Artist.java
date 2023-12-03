import java.util.ArrayList;
public class Artist {
    private String name;
    private ArrayList<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }
    public String getName(){return this.name;}

    public void removeAlbum(Album album) {
        if (albums.contains(album)) {
            albums.remove(album);
        } else {
            System.out.println("Album not found in the artist's collection.");
        }
    }
    public void listAlbums() {
        System.out.println("Albums by " + name + ":");
        for (Album album : albums) {
            System.out.println("  - " + album.getTitle());
        }
    }
}
