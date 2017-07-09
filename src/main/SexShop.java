
package main;

import gui.Login;
import gui.menu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ccp
 */
public class SexShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) { 
        }
        Login ui = new Login();
        ui.setLocationRelativeTo(null);
        ui.setTitle("Inicia Sesion..");
        ui.setVisible(true);
    }
    
}
