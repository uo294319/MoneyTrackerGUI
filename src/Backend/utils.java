/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import javax.swing.JOptionPane;

/**
 *
 * @author uo294319
 */
public class Utils {
    public static String formatQuantity(double quantity) {
        String sign = (quantity >= 0) ? "+" : "-";
        quantity = Math.abs(quantity);
        return sign + String.valueOf(quantity);
    }
    
    public static void showErrorUnimplemented() {
        JOptionPane.showMessageDialog(
                    null,
                    "Error. Functionality not implemented yet.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
    }
}