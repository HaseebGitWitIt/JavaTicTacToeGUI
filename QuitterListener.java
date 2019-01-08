import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Control what happens when the Quit menu button is clicked.
 * 
 * @author Haseeb Khan
 * @version December 5, 2016
 */
public class QuitterListener implements ActionListener
{
    
    

    /**
     * Constructor for objects of class QuitterListener
     */
    public QuitterListener()
    {
        
        
        
    }

    /**
     * Method saying what happens when a button is clicked
     * 
     * @param  ActionEvent ev   Event which is the button being clicked
     */
    public void actionPerformed(ActionEvent ev){
        
        JOptionPane.showMessageDialog(null, "Quitter!");
        
        System.exit(0);
        
    }
        
}
    


