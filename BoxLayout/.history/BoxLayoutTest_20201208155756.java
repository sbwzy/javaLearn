import javax.swing.*;
import javax.swing.BoxLayout;

import java.awt.*;

public class BoxLayout {
    public static void main(String[] args){
        BoxLayout gui = new BoxLayout();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("芜湖");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}