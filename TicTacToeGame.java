import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * TicTacToe game using GUI.
 * 
 * @author Haseeb Khan
 * @version December 5, 2016
 */

public class TicTacToeGame 
{ 
    
    public static int a = 2;
   
    private JLabel labelBlank1;
    private JLabel labelBlank2;
    private Container contentPane;
    private JLabel status;
    private JFrame frame;
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JButton but5;
    private JButton but6;
    private JButton but7;
    private JButton but8;
    private JButton but9;
    private ButtonHandler buttonHandler1;
    private ButtonHandler buttonHandler2;
    private ButtonHandler buttonHandler3;
    private ButtonHandler buttonHandler4;
    private ButtonHandler buttonHandler5;
    private ButtonHandler buttonHandler6;
    private ButtonHandler buttonHandler7;
    private ButtonHandler buttonHandler8;
    private ButtonHandler buttonHandler9;
    private NewGameListener newGameListener;
    private QuitterListener quitterListener;
    private String[] board;
    private JMenuBar menuBar;
    private JMenuItem newGame;
    private JMenuItem quit;
    private JLabel waste;
    
   /** 
    * Setup the game.
    */
   public TicTacToeGame()
   { 
       
       this.playGame();
       
   }
   
   /** 
    * Starts the game that the user can play.
    */
   public void playGame() {
       
       board = new String[9];
       
       for(int a = 0; a < 9; a++) {
           
           board[a] = "N";
           
       }
       
       frame = new JFrame("TicTacToe Game");
       
       contentPane = frame.getContentPane();
       contentPane.setLayout(new GridLayout(4,3));
       
       but1 = new JButton("1");
       but2 = new JButton("2");
       but3 = new JButton("3");
       but4 = new JButton("4");
       but5 = new JButton("5");
       but6 = new JButton("6");
       but7 = new JButton("7");
       but8 = new JButton("8");
       but9 = new JButton("9");
       
       labelBlank1 = new JLabel("   Type 'CTRL + N' for New");
       labelBlank2 = new JLabel("       Type 'CTRL + Q' to Quit");
       status = new JLabel("        It is Player 1's turn!");
       
       menuBar = new JMenuBar();
       newGame = new JMenuItem("New Game");
       quit = new JMenuItem("Quit");
       waste = new JLabel("                                                                                                               ");
       
       menuBar.add(newGame);
       menuBar.add(waste);
       menuBar.add(quit);
       
       contentPane.add(labelBlank1);
       contentPane.add(status);
       contentPane.add(labelBlank2);
       contentPane.add(but1);
       contentPane.add(but2);
       contentPane.add(but3);
       contentPane.add(but4);
       contentPane.add(but5);
       contentPane.add(but6);
       contentPane.add(but7);
       contentPane.add(but8);
       contentPane.add(but9);
       
       frame.setJMenuBar(menuBar);
       frame.pack();
       frame.setSize(500,500);
       frame.setVisible(true);
       
       buttonHandler1 = new ButtonHandler(but1, board, 1, status, this);
       buttonHandler2 = new ButtonHandler(but2, board, 2, status, this);
       buttonHandler3 = new ButtonHandler(but3, board, 3, status, this);
       buttonHandler4 = new ButtonHandler(but4, board, 4, status, this);
       buttonHandler5 = new ButtonHandler(but5, board, 5, status, this);
       buttonHandler6 = new ButtonHandler(but6, board, 6, status, this);
       buttonHandler7 = new ButtonHandler(but7, board, 7, status, this);
       buttonHandler8 = new ButtonHandler(but8, board, 8, status, this);
       buttonHandler9 = new ButtonHandler(but9, board, 9, status, this);
       
       newGameListener = new NewGameListener(this);
       quitterListener = new QuitterListener();
       
       but1.addActionListener(buttonHandler1);
       but2.addActionListener(buttonHandler2);
       but3.addActionListener(buttonHandler3);
       but4.addActionListener(buttonHandler4);
       but5.addActionListener(buttonHandler5);
       but6.addActionListener(buttonHandler6);
       but7.addActionListener(buttonHandler7);
       but8.addActionListener(buttonHandler8);
       but9.addActionListener(buttonHandler9);
       
       newGame.addActionListener(newGameListener);
       newGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
       
       quit.addActionListener(quitterListener);
       quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
       
       
    }
    
    /** 
    * Restart the game when the user wants a new game, or there is a winner or tie.
    */
   public void restart() {
        
        but1.setText("1");
        but2.setText("2");
        but3.setText("3");
        but4.setText("4");
        but5.setText("5");
        but6.setText("6");
        but7.setText("7");
        but8.setText("8");
        but9.setText("9");
        
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        but4.setEnabled(true);
        but5.setEnabled(true);
        but6.setEnabled(true);
        but7.setEnabled(true);
        but8.setEnabled(true);
        but9.setEnabled(true);
        
        for(int a = 0; a < 9; a++) {
           
           board[a] = "N";
           
       }

       a = 2;
       
       status.setText("        It is Player 1's turn!");

    }
   


}