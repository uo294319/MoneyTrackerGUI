package Frontend;

import Backend.TableUtils;
import Backend.Utils;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author angel
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainWindow() {
        
        this.initComponents();
        this.setLocationRelativeTo(null);
        
        TableUtils.configTable(this.wallet_total_table);
        TableUtils.configTable(this.wallet_income_table);
        TableUtils.configTable(this.wallet_expenses_table);
        
        this.welcomeWindow = new WelcomeWindow(this);
        this.welcomeWindow.setVisible(true);
        
        this.showAllWindow = new ShowAllWindow(this);
        this.customViewWindow = new CustomViewWindow(this);
        this.addEntryDialog = new AddEntryDialog(this, true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        period = new javax.swing.ButtonGroup();
        wallet = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        main_tabbedPanel_wallet = new javax.swing.JTabbedPane();
        wallet_total_scroll = new javax.swing.JScrollPane();
        wallet_total_table = new javax.swing.JTable();
        wallet_income_scroll = new javax.swing.JScrollPane();
        wallet_income_table = new javax.swing.JTable();
        wallet_expenses_scroll = new javax.swing.JScrollPane();
        wallet_expenses_table = new javax.swing.JTable();
        main_showAll = new javax.swing.JButton();
        main_eurSymbol = new javax.swing.JLabel();
        main_total = new javax.swing.JLabel();
        mainPanel_disclaimer = new javax.swing.JTextArea();
        main_addEntries = new javax.swing.JButton();
        main_deleteEntry = new javax.swing.JButton();
        main_modEntry = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menu_file_sample = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_file_import = new javax.swing.JMenuItem();
        menu_file_export = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menu_file_quit = new javax.swing.JMenuItem();
        menu_edit = new javax.swing.JMenu();
        menu_edit_auto = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_edit_add = new javax.swing.JMenuItem();
        menu_edit_clear = new javax.swing.JMenuItem();
        menu_view = new javax.swing.JMenu();
        menu_view_wallet = new javax.swing.JMenu();
        menu_view_wallet_total = new javax.swing.JRadioButtonMenuItem();
        menu_view_wallet_income = new javax.swing.JRadioButtonMenuItem();
        menu_view_wallet_expenses = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menu_view_custom = new javax.swing.JMenuItem();
        menu_help = new javax.swing.JMenu();
        menu_help_doc = new javax.swing.JMenuItem();
        menu_help_about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(198, 220, 186));
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 350));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_tabbedPanel_wallet.setBackground(new java.awt.Color(187, 195, 164));
        main_tabbedPanel_wallet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        main_tabbedPanel_wallet.setOpaque(true);
        main_tabbedPanel_wallet.setPreferredSize(new java.awt.Dimension(250, 300));
        main_tabbedPanel_wallet.setRequestFocusEnabled(false);
        main_tabbedPanel_wallet.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                main_tabbedPanel_walletStateChanged(evt);
            }
        });

        wallet_total_scroll.setBackground(new java.awt.Color(187, 195, 164));

        wallet_total_table.setBackground(new java.awt.Color(187, 195, 164));
        wallet_total_table.setModel(new javax.swing.table.DefaultTableModel(
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
        wallet_total_table.setDoubleBuffered(true);
        wallet_total_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        wallet_total_table.getTableHeader().setReorderingAllowed(false);
        wallet_total_scroll.setViewportView(wallet_total_table);

        main_tabbedPanel_wallet.addTab("Total", wallet_total_scroll);

        wallet_income_scroll.setBackground(new java.awt.Color(187, 195, 164));

        wallet_income_table.setBackground(new java.awt.Color(187, 195, 164));
        wallet_income_table.setModel(new javax.swing.table.DefaultTableModel(
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
        wallet_income_table.setDoubleBuffered(true);
        wallet_income_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        wallet_income_table.getTableHeader().setReorderingAllowed(false);
        wallet_income_scroll.setViewportView(wallet_income_table);

        main_tabbedPanel_wallet.addTab("Income", wallet_income_scroll);

        wallet_expenses_table.setBackground(new java.awt.Color(187, 195, 164));
        wallet_expenses_table.setModel(new javax.swing.table.DefaultTableModel(
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
        wallet_expenses_table.setDoubleBuffered(true);
        wallet_expenses_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        wallet_expenses_table.getTableHeader().setReorderingAllowed(false);
        wallet_expenses_scroll.setViewportView(wallet_expenses_table);

        main_tabbedPanel_wallet.addTab("Expenses", wallet_expenses_scroll);

        mainPanel.add(main_tabbedPanel_wallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 6, -1, -1));

        main_showAll.setBackground(new java.awt.Color(179, 163, 152));
        main_showAll.setText("Show All");
        main_showAll.setBorder(null);
        main_showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_showAllActionPerformed(evt);
            }
        });
        mainPanel.add(main_showAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 312, 100, 32));

        main_eurSymbol.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        main_eurSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_eurSymbol.setText(" €");
        mainPanel.add(main_eurSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, -1));

        main_total.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        main_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        main_total.setText("0");
        mainPanel.add(main_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, -1));

        mainPanel_disclaimer.setEditable(false);
        mainPanel_disclaimer.setBackground(new java.awt.Color(198, 220, 186));
        mainPanel_disclaimer.setColumns(1);
        mainPanel_disclaimer.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        mainPanel_disclaimer.setRows(1);
        mainPanel_disclaimer.setTabSize(1);
        mainPanel_disclaimer.setText("Computer-Human Interaction\nÁngel Arróspide Marco");
        mainPanel_disclaimer.setAutoscrolls(false);
        mainPanel_disclaimer.setBorder(null);
        mainPanel_disclaimer.setMaximumSize(new java.awt.Dimension(48, 18));
        mainPanel_disclaimer.setMinimumSize(new java.awt.Dimension(48, 18));
        mainPanel.add(mainPanel_disclaimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 314, 142, 30));

        main_addEntries.setBackground(new java.awt.Color(179, 163, 152));
        main_addEntries.setText("Add entry");
        main_addEntries.setBorder(null);
        main_addEntries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_addEntriesActionPerformed(evt);
            }
        });
        mainPanel.add(main_addEntries, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 36));

        main_deleteEntry.setBackground(new java.awt.Color(179, 163, 152));
        main_deleteEntry.setText("Delete entry");
        main_deleteEntry.setBorder(null);
        mainPanel.add(main_deleteEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 36));

        main_modEntry.setBackground(new java.awt.Color(179, 163, 152));
        main_modEntry.setText("Modify entry");
        main_modEntry.setBorder(null);
        mainPanel.add(main_modEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 36));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.setBackground(new java.awt.Color(187, 195, 164));
        menu.setBorder(null);
        menu.setBorderPainted(false);

        menu_file.setBackground(new java.awt.Color(187, 195, 164));
        menu_file.setText("File");

        menu_file_sample.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_file_sample.setBackground(new java.awt.Color(187, 195, 164));
        menu_file_sample.setText("Open sample");
        menu_file_sample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_sampleActionPerformed(evt);
            }
        });
        menu_file.add(menu_file_sample);
        menu_file.add(jSeparator1);

        menu_file_import.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_file_import.setBackground(new java.awt.Color(187, 195, 164));
        menu_file_import.setText("Import csv");
        menu_file_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_importActionPerformed(evt);
            }
        });
        menu_file.add(menu_file_import);

        menu_file_export.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_file_export.setBackground(new java.awt.Color(187, 195, 164));
        menu_file_export.setText("Export csv");
        menu_file_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_exportActionPerformed(evt);
            }
        });
        menu_file.add(menu_file_export);
        menu_file.add(jSeparator2);

        menu_file_quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_file_quit.setBackground(new java.awt.Color(187, 195, 164));
        menu_file_quit.setText("Quit");

        menu_file.add(menu_file_quit);

        menu.add(menu_file);

        menu_edit.setBackground(new java.awt.Color(187, 195, 164));
        menu_edit.setText("Edit");

        menu_edit_auto.setSelected(true);
        menu_edit_auto.setText("Auto-save");
        menu_edit.add(menu_edit_auto);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Save to cloud");
        menu_edit.add(jCheckBoxMenuItem1);
        menu_edit.add(jSeparator3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Undo");
        menu_edit.add(jMenuItem1);

        menu_edit_add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_edit_add.setBackground(new java.awt.Color(187, 195, 164));
        menu_edit_add.setText("Add entry");
        menu_edit_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_edit_addActionPerformed(evt);
            }
        });
        menu_edit.add(menu_edit_add);

        menu_edit_clear.setBackground(new java.awt.Color(187, 195, 164));
        menu_edit_clear.setText("Clear all entries");
        menu_edit_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_edit_clearActionPerformed(evt);
            }
        });
        menu_edit.add(menu_edit_clear);

        menu.add(menu_edit);

        menu_view.setBackground(new java.awt.Color(187, 195, 164));
        menu_view.setText("View");

        menu_view_wallet.setBackground(new java.awt.Color(187, 195, 164));
        menu_view_wallet.setText("Wallet");

        wallet.add(menu_view_wallet_total);
        menu_view_wallet_total.setSelected(true);
        menu_view_wallet_total.setText("Total");
        menu_view_wallet_total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu_view_wallet_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_view_wallet_totalActionPerformed(evt);
            }
        });
        menu_view_wallet.add(menu_view_wallet_total);

        wallet.add(menu_view_wallet_income);
        menu_view_wallet_income.setText("Income");
        menu_view_wallet_income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_view_wallet_incomeActionPerformed(evt);
            }
        });
        menu_view_wallet.add(menu_view_wallet_income);

        wallet.add(menu_view_wallet_expenses);
        menu_view_wallet_expenses.setText("Expenses");
        menu_view_wallet_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_view_wallet_expensesActionPerformed(evt);
            }
        });
        menu_view_wallet.add(menu_view_wallet_expenses);

        menu_view.add(menu_view_wallet);
        menu_view.add(jSeparator4);

        menu_view_custom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_view_custom.setText("Customize view");
        menu_view_custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_view_customActionPerformed(evt);
            }
        });
        menu_view.add(menu_view_custom);

        menu.add(menu_view);

        menu_help.setBackground(new java.awt.Color(187, 195, 164));
        menu_help.setText("Help");

        menu_help_doc.setBackground(new java.awt.Color(187, 195, 164));
        menu_help_doc.setText("Documentation");
        menu_help.add(menu_help_doc);

        menu_help_about.setBackground(new java.awt.Color(187, 195, 164));
        menu_help_about.setText("About");
        menu_help.add(menu_help_about);

        menu.add(menu_help);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void menu_file_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_file_importActionPerformed
        JFileChooser MyFile = new JFileChooser();
        int Ret = MyFile.showOpenDialog(null);
        if(Ret == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error importing the file:\n" + MyFile.getSelectedFile().getAbsolutePath(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_menu_file_importActionPerformed

    private void menu_file_sampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_file_sampleActionPerformed
        // TODO add your handling code here:
        
        this.clearTables();
        
        this.addEntry(1600, "Salario");
        this.addEntry(-700, "Renta piso");
        this.addEntry(-27.50, "Comida");
        this.addEntry(+55, "Venta TV");
        this.addEntry(-45, "Cena");
        this.addEntry(-20.50, "Regalo");
        
    }//GEN-LAST:event_menu_file_sampleActionPerformed

    private void menu_file_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_file_exportActionPerformed
        JFileChooser MyFile = new JFileChooser();
        int Ret = MyFile.showSaveDialog(null);
        if(Ret == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error exporting the file:\n" + MyFile.getSelectedFile().getAbsolutePath(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menu_file_exportActionPerformed

    
    private void menu_edit_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_edit_addActionPerformed
        requestEntry();
    }//GEN-LAST:event_menu_edit_addActionPerformed

    private void menu_view_wallet_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_view_wallet_totalActionPerformed
        // TODO add your handling code here:
        this.selectWalletTotal();
    }//GEN-LAST:event_menu_view_wallet_totalActionPerformed

    private void menu_view_wallet_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_view_wallet_expensesActionPerformed
        // TODO add your handling code here:
        this.selectWalletExpenses();
    }//GEN-LAST:event_menu_view_wallet_expensesActionPerformed

    private void menu_view_wallet_incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_view_wallet_incomeActionPerformed
        // TODO add your handling code here:
        this.selectWalletIncome();
    }//GEN-LAST:event_menu_view_wallet_incomeActionPerformed

    private void menu_edit_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_edit_clearActionPerformed
        // TODO add your handling code here:
        this.clearTables();
        this.refreshTotal();
    }//GEN-LAST:event_menu_edit_clearActionPerformed

    private void main_showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_showAllActionPerformed
        // TODO add your handling code here:
        this.showAllWindow.setVisible(true);
    }//GEN-LAST:event_main_showAllActionPerformed

    private void main_tabbedPanel_walletStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_main_tabbedPanel_walletStateChanged
        // TODO add your handling code here:
        if(this.showAllWindow != null)
        {
            switch(this.main_tabbedPanel_wallet.getSelectedIndex())
            {
                case -1 -> System.err.print("Error. No tab selected.");
                case 0 -> this.selectWalletTotal();
                case 1 -> this.selectWalletIncome();
                case 2 -> this.selectWalletExpenses();
            }
        }
    }//GEN-LAST:event_main_tabbedPanel_walletStateChanged

    private void menu_view_customActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_view_customActionPerformed
        this.customViewWindow.setVisible(true);
    }//GEN-LAST:event_menu_view_customActionPerformed

    private void main_addEntriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_addEntriesActionPerformed
        requestEntry();
    }//GEN-LAST:event_main_addEntriesActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(false);
            }
        });
    }
    
    private void requestEntry() {
        if(this.addEntryDialog.showDialog())
            this.addEntry(
                    this.addEntryDialog.amount,
                    this.addEntryDialog.tag
            );
    }
    
    protected ShowAllWindow getShowAllWindow() {
        return this.showAllWindow;
    }
    
    protected void setTableBackground(Color c) {
        this.main_tabbedPanel_wallet.setBackground(c);
        this.wallet_expenses_table.setBackground(c);
        this.wallet_income_table.setBackground(c);
        this.wallet_total_table.setBackground(c);
    }
    
    protected double getAbsoluteTotal() {
        return TableUtils.getRelativeTotal(this.wallet_total_table);
    }
    
    protected void addEntry(double quantity, String tag) {
         
        if(quantity == 0)
            System.err.print("Error. Quantities cannot be 0");
        else
        {
            TableUtils.addEntryToTable(this.wallet_total_table, quantity, tag);
            
            if(quantity < 0)
                TableUtils.addEntryToTable(this.wallet_expenses_table, quantity, tag);
            else
                TableUtils.addEntryToTable(this.wallet_income_table, quantity, tag);
            
            refreshTotal();
        }

    }
    
    protected void refreshTotal() {
        this.main_total.setText(String.valueOf(this.getAbsoluteTotal()));
    }
    
    protected void clearTables() {
        TableUtils.cleanTable(this.wallet_total_table);
        TableUtils.cleanTable(this.wallet_income_table);
        TableUtils.cleanTable(this.wallet_expenses_table);
    } 
    
    
    protected void selectWalletTotal() {
        this.menu_view_wallet_total.setSelected(true);
        this.main_tabbedPanel_wallet.setSelectedComponent(
                this.wallet_total_scroll
        );
        this.showAllWindow.tabbedPane.setSelectedComponent(
                this.showAllWindow.tabbedPane_total_scroll
        );
    }
    
    protected void selectWalletIncome() {
        this.menu_view_wallet_income.setSelected(true);
        this.main_tabbedPanel_wallet.setSelectedComponent(
                this.wallet_income_scroll
        );
        this.showAllWindow.tabbedPane.setSelectedComponent(
                this.showAllWindow.tabbedPane_income_scroll
        );
    }
    
    protected void selectWalletExpenses() {
        this.menu_view_wallet_expenses.setSelected(true);
        this.main_tabbedPanel_wallet.setSelectedComponent(
                this.wallet_expenses_scroll
        );
        this.showAllWindow.tabbedPane.setSelectedComponent(
                this.showAllWindow.tabbedPane_expenses_scroll
        );
    }

    
    protected ShowAllWindow showAllWindow;
    protected WelcomeWindow welcomeWindow;
    protected CustomViewWindow customViewWindow;
    protected AddEntryDialog addEntryDialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    protected javax.swing.JMenuItem jMenuItem1;
    protected javax.swing.JPopupMenu.Separator jSeparator1;
    protected javax.swing.JPopupMenu.Separator jSeparator2;
    protected javax.swing.JPopupMenu.Separator jSeparator3;
    protected javax.swing.JPopupMenu.Separator jSeparator4;
    protected javax.swing.JPanel mainPanel;
    protected javax.swing.JTextArea mainPanel_disclaimer;
    protected javax.swing.JButton main_addEntries;
    protected javax.swing.JButton main_deleteEntry;
    protected javax.swing.JLabel main_eurSymbol;
    protected javax.swing.JButton main_modEntry;
    protected javax.swing.JButton main_showAll;
    protected javax.swing.JTabbedPane main_tabbedPanel_wallet;
    protected javax.swing.JLabel main_total;
    protected javax.swing.JMenuBar menu;
    protected javax.swing.JMenu menu_edit;
    protected javax.swing.JMenuItem menu_edit_add;
    protected javax.swing.JCheckBoxMenuItem menu_edit_auto;
    protected javax.swing.JMenuItem menu_edit_clear;
    protected javax.swing.JMenu menu_file;
    protected javax.swing.JMenuItem menu_file_export;
    protected javax.swing.JMenuItem menu_file_import;
    protected javax.swing.JMenuItem menu_file_quit;
    protected javax.swing.JMenuItem menu_file_sample;
    protected javax.swing.JMenu menu_help;
    protected javax.swing.JMenuItem menu_help_about;
    protected javax.swing.JMenuItem menu_help_doc;
    protected javax.swing.JMenu menu_view;
    protected javax.swing.JMenuItem menu_view_custom;
    protected javax.swing.JMenu menu_view_wallet;
    protected javax.swing.JRadioButtonMenuItem menu_view_wallet_expenses;
    protected javax.swing.JRadioButtonMenuItem menu_view_wallet_income;
    protected javax.swing.JRadioButtonMenuItem menu_view_wallet_total;
    protected javax.swing.ButtonGroup period;
    protected javax.swing.ButtonGroup wallet;
    protected javax.swing.JScrollPane wallet_expenses_scroll;
    protected javax.swing.JTable wallet_expenses_table;
    protected javax.swing.JScrollPane wallet_income_scroll;
    protected javax.swing.JTable wallet_income_table;
    protected javax.swing.JScrollPane wallet_total_scroll;
    protected javax.swing.JTable wallet_total_table;
    // End of variables declaration//GEN-END:variables
}
