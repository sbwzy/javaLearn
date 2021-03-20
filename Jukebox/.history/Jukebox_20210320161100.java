import java.util.*;
import java.io.*;

public class Jukebox {
    Arraylist<String> songList = new ArrayList<String>();
    
    public static void main (String[] args) {
        new Jukebox().go();
    }

    void go() {
        getSongs();
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            While ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {ex.printStackTrace();}
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}