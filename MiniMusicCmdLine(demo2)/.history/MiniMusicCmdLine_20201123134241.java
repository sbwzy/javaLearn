import javax.sound.midi.*;

public class MiniMusicCmdLine{
    public static void main(String[] args){
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2){
            System.out.println("Don't forget the instrument and note args");
        }else{
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            
        }
    }
}