/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author uo294319
 */
public class Utils {
    
    private final static String REPO_URL = "https://github.com/uo294319/MoneyTrackerGUI";
    
    public static String formatQuantity(double quantity) {
        String sign = (quantity >= 0) ? "+" : "-";
        quantity = Math.abs(quantity);
        return sign + String.valueOf(quantity);
    }
    
    public static void showWarningUnimplemented() {
        JOptionPane.showMessageDialog(
                    null,
                    "Functionality not implemented yet.", 
                    "WARNING", 
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public static void openRepo() {
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(new URI(REPO_URL));
            } catch (IOException | URISyntaxException e) {
                System.err.println(e);
            }
        } else {
             System.err.println("Desktop not supported.");
        }
    }
}