import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
 
public class QuizCardPlayer {
 
   private JTextArea display;
   private JTextArea answer;
   private ArrayList<QuizCard> cardList;
   private QuizCard currentCard;
   private int currentCardIndex;
   private JFrame frame;
   private JButton nextButton;
   private boolean isShowAnswer;

   public static void main (String[] args) {
       QuizCardPlayer reader = new QuizCardPlayer();
       reader.go();
   }

   public void go() {
    frame = new JFrame("Quiz Card Player");
    JPanel mainPanel = new JPanel();
    Font bigFont = new Font("sanserif", Font.BOLD, 24);

    display = new JTextArea(9,20);
      display.setFont(bigFont);
      display.setLineWrap(true);
   }
}