import javax.sound.midi.*;

public class MiniMusicPlayer1 {
    public static void main(String[] args){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            
        }
    }
}