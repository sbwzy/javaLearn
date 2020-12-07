import javax.swing.*;
import java.awt.*;

public class Button3 {
    public static void main(String[] args){
        Button3 gui = new Button3();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton east = new JButton("east");
        JButton west = new JButton("west");
        JButton north = new JButton("north");
        JButton south = new JButton("south");
        JButton center = new JButton("center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}