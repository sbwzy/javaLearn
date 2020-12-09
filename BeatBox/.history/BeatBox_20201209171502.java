import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.sound.midi.*;
import javax.swing.*;

public class BeatBox {
    JPanel mainPanel;
    ArrayList<JCheckBox> checkboxlist;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat",
        "Acoustic Snare", "Crash Cymbal", "Hand clap", "High Tom", "Maracas",
        "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
        "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main (String[] args) {
        
    }
}