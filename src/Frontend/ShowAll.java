/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

/**
 *
 * @author uo294319
 */
public class ShowAll extends javax.swing.JFrame {

    /**
     * Creates new form ShowAll
     */
    public ShowAll() {
        initComponents();
    }
    
    public ShowAll(Main main) {
        initComponents();
        this.main = main;
        syncTables();
    }
    
    private void syncTables() {
        this.tabbedPane_total_table
                .setModel(main.wallet_total_table.getModel());
        
        this.tabbedPane_income_table
                .setModel(main.wallet_income_table.getModel());
        
        this.tabbedPane_expenses_table
                .setModel(main.wallet_expenses_table.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        tabbedPane_total_scroll = new javax.swing.JScrollPane();
        tabbedPane_total_table = new javax.swing.JTable();
        tabbedPane_income_scroll = new javax.swing.JScrollPane();
        tabbedPane_income_table = new javax.swing.JTable();
        tabbedPane_expenses_scroll = new javax.swing.JScrollPane();
        tabbedPane_expenses_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.setBackground(new java.awt.Color(187, 195, 164));
        tabbedPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabbedPane.setOpaque(true);
        tabbedPane.setPreferredSize(new java.awt.Dimension(250, 300));
        tabbedPane.setRequestFocusEnabled(false);

        tabbedPane_total_scroll.setBackground(new java.awt.Color(187, 195, 164));

        tabbedPane_total_table.setBackground(new java.awt.Color(187, 195, 164));
        tabbedPane_total_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Total", "Tag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabbedPane_total_table.setDoubleBuffered(true);
        tabbedPane_total_table.setRowSelectionAllowed(false);
        tabbedPane_total_table.getTableHeader().setReorderingAllowed(false);
        tabbedPane_total_scroll.setViewportView(tabbedPane_total_table);

        tabbedPane.addTab("Total", tabbedPane_total_scroll);

        tabbedPane_income_scroll.setBackground(new java.awt.Color(187, 195, 164));

        tabbedPane_income_table.setBackground(new java.awt.Color(187, 195, 164));
        tabbedPane_income_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Total", "Tag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabbedPane_income_table.setDoubleBuffered(true);
        tabbedPane_income_table.setRowSelectionAllowed(false);
        tabbedPane_income_table.getTableHeader().setReorderingAllowed(false);
        tabbedPane_income_scroll.setViewportView(tabbedPane_income_table);

        tabbedPane.addTab("Income", tabbedPane_income_scroll);

        tabbedPane_expenses_table.setBackground(new java.awt.Color(187, 195, 164));
        tabbedPane_expenses_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Total", "Tag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabbedPane_expenses_table.setDoubleBuffered(true);
        tabbedPane_expenses_table.setRowSelectionAllowed(false);
        tabbedPane_expenses_table.getTableHeader().setReorderingAllowed(false);
        tabbedPane_expenses_scroll.setViewportView(tabbedPane_expenses_table);

        tabbedPane.addTab("Expenses", tabbedPane_expenses_scroll);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAll().setVisible(true);
            }
        });
    }
    
    
    private Main main;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JScrollPane tabbedPane_expenses_scroll;
    private javax.swing.JTable tabbedPane_expenses_table;
    private javax.swing.JScrollPane tabbedPane_income_scroll;
    private javax.swing.JTable tabbedPane_income_table;
    private javax.swing.JScrollPane tabbedPane_total_scroll;
    private javax.swing.JTable tabbedPane_total_table;
    // End of variables declaration//GEN-END:variables
}
