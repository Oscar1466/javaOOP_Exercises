import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    private ArrayList<String> songs;
    private Random random;

    
     public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

     public void addSong(String song) {
        songs.add(song);
        System.out.println("🎶 Added: " + song);
    }

     public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("🗑️ Removed: " + song);
        } else {
            System.out.println("❌ Song not found in library!");
        }
    }

     public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("😢 No songs to play! Please add some music first.");
        } else {
            int index = random.nextInt(songs.size());
            String song = songs.get(index);
            System.out.println("🎧 Now Playing: " + song);
        }
    }

    public void showSongs() {
        System.out.println("🎵 Music Library: " + songs);
    }

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

      library.addSong("Santeria");
        library.addSong("Blinding Lights");
         library.addSong("Montagem Xodana");

      library.showSongs();
        library.playRandomSong();

      library.removeSong("Montagem Xodana");
        library.showSongs();
        library.playRandomSong();
    }
}