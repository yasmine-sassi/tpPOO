public class MusicPlat {
    public static void main(String[] args) {
        Artist artistA = new Artist("Samara");
        Artist artistB = new Artist("Nicki");
        Song song1 = new Song("Song 1", artistA, 300);
        Song song2 = new Song("Song 2", artistA, 200);
        Album album1 = new Album("Album 1", artistA);
        Album album2 = new Album("Album 2", artistB);
        album1.addSong(song1);
        album1.addSong(song2);
        album1.listSongs();
        artistA.addAlbum(album1);
        artistA.addAlbum(album2);
        artistA.listAlbums();
        album2.removeSong(song2);
        album1.listSongs();
        artistA.removeAlbum(album1);
        artistA.listAlbums();
        artistB.listAlbums();
    }
}
