/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/*
 * Imports
 */
import static Backend.Utils.formatQuantity;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uo294319
 */
public class TableUtils {
    
    public static final int  COLUMN_QUANTITY = 1;
    public static final int  COLUMN_TOTAL = 0;
    public static final int  COLUMN_TAG = 2;
    
    
    public static void configTable(javax.swing.JTable table) {
        
        String[] tmp = new String[3];
        tmp[COLUMN_QUANTITY] = "Quantity";
        tmp[COLUMN_TOTAL] = "Total";
        tmp[COLUMN_TAG] = "Tag";
        
        table.setModel(new DefaultTableModel(tmp, 0));
    }
    
    public static void cleanTable(javax.swing.JTable table) {
        
        DefaultTableModel model = 
                (DefaultTableModel) table.getModel();
        
        while(model.getRowCount() != 0)
            model.removeRow(0);
    }
    
    public static double getRelativeTotal(javax.swing.JTable table) {
        
        DefaultTableModel model = 
                (DefaultTableModel) table.getModel();
        
        if(model.getRowCount() == 0)
            return 0;
        
        try {
            return Double.parseDouble((String) model.getValueAt(0, COLUMN_TOTAL));
        } catch(NumberFormatException e) {
            System.err.print(
                    "Error converting the total of first entry to double: "
                    + model.getValueAt(0, COLUMN_TOTAL)
                    + "\n"
            );
            return 0;
        }
    }
    
    public static void addEntryToTable(javax.swing.JTable table, double quantity, String tag) {
        
        Object[] tmp = new Object[3];
        tmp[COLUMN_TOTAL] = formatQuantity(getRelativeTotal(table) + quantity);
        tmp[COLUMN_QUANTITY] = formatQuantity(quantity);
        tmp[COLUMN_TAG] = tag;
        
        ((DefaultTableModel) table.getModel()).insertRow(0, tmp);
    }    
}
