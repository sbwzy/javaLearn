import java.util.*;
import java.io.*;

public class Jukebox5 {
    Arraylist<Song> songlist = new Arraylist<Song>();
    public static void main (String[] args) {
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go() {
        getSongs();
        System.out.println(songlist);
        Collections.sort(songList);
        System.out.println(songlist);

        ArtistCompare artistCompare = new ArtistCompare();

        System.out.println(songlist);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close();
        } catch (Exception ex) {ex.printStackTrace();}
    }

    void addSong(String lineToParse) {
        
    }
}