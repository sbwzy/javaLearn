import javax.swing.*;


public class SimpleGui1{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 在windows关闭时结束掉程序

        frame.getContentPane().add(button);

        frame.setSize(300,300);

        frame.setVisible(true); // 显示frame
    }
}