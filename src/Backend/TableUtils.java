/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/*
 * Imports
 */
import static Backend.Utils.formatQuantity;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * This class contains some util functions that work with a table model
 * ensuring that the correct format is providen.
 * 
 * Changes in the tables model must be done ONLY in this class.
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
    
    public static void cleanTable(JTable table) {
        
        DefaultTableModel model = 
                (DefaultTableModel) table.getModel();
        
        while(model.getRowCount() != 0)
            model.removeRow(0);
    }
    
    public static double getTableTotal(JTable table) {
        
        DefaultTableModel model = 
                (DefaultTableModel) table.getModel();
        
        if(model.getRowCount() == 0) return 0;
        
        return getTotalForIndex(model, 0);
    }
    
    private static double getTotalForIndex(DefaultTableModel model, int index) {
        
        try {
            return Double.parseDouble((String) model.getValueAt(index, COLUMN_TOTAL));
        } catch(NumberFormatException e) {
            System.err.print(
                    "Error converting the total of entry [" 
                    + index + "] to double: "
                    + model.getValueAt(index, COLUMN_TOTAL) + "\n"
            );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.print(
                    "Error. Invalid index: "+ index +"\n"
            );
        }
            
        return 0;
    }
    
    public static void addEntryToTable(JTable table, double quantity, String tag) {
        
        Object[] tmp = new Object[3];
        tmp[COLUMN_TOTAL] = formatQuantity(getTableTotal(table) + quantity);
        tmp[COLUMN_QUANTITY] = formatQuantity(quantity);
        tmp[COLUMN_TAG] = tag;
        
        ((DefaultTableModel) table.getModel()).insertRow(0, tmp);
    }
    
    public static void removeEntryFromTable(JTable table, int row) {
        DefaultTableModel model = 
                (DefaultTableModel) table.getModel();
        
        model.removeRow(row);
    }
    
    public static void recalculateTotal(JTable table) {
        
        DefaultTableModel model = 
                (DefaultTableModel) table.getModel();
        
        for(int i = model.getRowCount() - 1; i > -1; i--)
        {
            model.setValueAt(
                    getTotalForIndex(model, i),
                    i, 
                    COLUMN_TOTAL);
        }
    }
}
