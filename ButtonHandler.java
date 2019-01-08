import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Control what happens when a button is clicked.
 * 
 * @author Haseeb Khan
 * @version December 5, 2016
 */
public class ButtonHandler implements ActionListener
{
    
    private JButton button;
    private String[] board;
    private int iD;
    private JLabel status;
    private TicTacToeGame game;

    /**
     * Constructor for objects of class ButtonHandler
     */
    public ButtonHandler(JButton button, String[] board, int iD, JLabel status, TicTacToeGame game)
    {
        
       this.button = button;
       this.board = board;
       this.iD = iD;
       this.status = status;
       this.game = game;
        
    }

    /**
     * Method saying what happens when a button is clicked
     * 
     * @param  ActionEvent ev   Event which is the button being clicked
     */
    public void actionPerformed(ActionEvent ev){
        
        
        if((TicTacToeGame.a % 2) == 0) {
            
            status.setText("        It is Player 2's turn!");
            button.setText("X");
            button.setEnabled(false);
            board[(iD - 1)] = "X";
            
        }else {
            
            status.setText("        It is Player 1's turn!");
            button.setText("O");
            button.setEnabled(false);
            board[(iD - 1)] = "O";
            
        }
        
        TicTacToeGame.a++;
        
        this.checkIfWinner();
        
    }
    
    /**
     * Method used to check if there is a winner or tie
     * 
     */
    public void checkIfWinner() {
        
        if(board[0] == "X" && board[1] == "X" && board[2] == "X") {
            
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[3] == "X" && board[4] == "X" && board[5] == "X") {
             
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[6] == "X" && board[7] == "X" && board[8] == "X") {
            
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[0] == "X" && board[3] == "X" && board[6] == "X") {
            
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[1] == "X" && board[4] == "X" && board[7] == "X") {
             
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[2] == "X" && board[5] == "X" && board[8] == "X") {
            
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[2] == "X" && board[4] == "X" && board[6] == "X") {
             
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[0] == "X" && board[4] == "X" && board[8] == "X") {
            
            JOptionPane.showMessageDialog(null, "Player 1 won the game!");
            
            game.restart();
            
            
            
        }else if(board[0] == "O" && board[1] == "O" && board[2] == "O") {
            
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[3] == "O" && board[4] == "O" && board[5] == "O") {
             
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[6] == "O" && board[7] == "O" && board[8] == "O") {
            
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[0] == "O" && board[3] == "O" && board[6] == "O") {
            
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[1] == "O" && board[4] == "O" && board[7] == "O") {
             
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[2] == "O" && board[5] == "O" && board[8] == "O") {
            
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[2] == "O" && board[4] == "O" && board[6] == "O") {
             
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if(board[0] == "O" && board[4] == "O" && board[8] == "O") {
            
            JOptionPane.showMessageDialog(null, "Player 2 won the game!");
            
            game.restart();
            
            
            
        }else if (board[0] != "N" && board[1] != "N" && board[2] != "N" && board[3] != "N" && board[4] != "N" && board[5] != "N" && board[6] != "N" && board[7] != "N" && board[8] != "N"  ) {
            
            JOptionPane.showMessageDialog(null, "Tie!");
            
            game.restart();
            
        }
           
    }
        
}
    


