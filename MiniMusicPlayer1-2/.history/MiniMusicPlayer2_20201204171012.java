import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main(String[] args){
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i=5; i<60; i+=4) {
                
            }
        }
    }
}