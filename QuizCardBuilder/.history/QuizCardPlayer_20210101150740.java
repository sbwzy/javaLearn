import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
 
public class QuizCardPlayer {
 
   private JTextArea display;
   private JTextArea answer;
   private ArrayList cardList;
   private QuizCard currentCard;
   private Iterator cardIterator;
   private JFrame frame;
   private JButton nextButton;
   private boolean isShowAnswer;
}