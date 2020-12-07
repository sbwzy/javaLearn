import javax.swing.*;
import java.awt.*;

public class Button3 {
    public static void main(String[] args){
        Button3 gui = new Button3();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}