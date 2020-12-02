import javax.swing.*;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public  void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        labelButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        myDrawPanel = new MydrawPanel();
    }
}