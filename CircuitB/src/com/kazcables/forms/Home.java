package com.kazcables.forms;

import com.kazcabels.model.Organization;
import com.kazcables.recordview.Account;
import com.kazcables.recordview.ClientRecords;
import com.kazcables.recordview.SupplierRecords;
import com.kazcables.recordview.BranchRecords;
import com.kazcables.recordview.EmployeeRecords;

import java.util.HashMap;
import java.util.Map;

public final class Home extends javax.swing.JFrame {
    public Map<String, Integer> TabTracker = new HashMap<>();;
    private final Organization cableCompany;
    
    EmployeeRecords employeeRecords = null;
    SupplierRecords supplierRecords = null;
    ClientRecords clientRecords = null;
    public Home() {
        initComponents();
        this.cableCompany = new Organization();
        openEmployeeRecordsTab("Employee Records", jTab.getSelectedIndex());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Body = new javax.swing.JPanel();
        jTab = new javax.swing.JTabbedPane();
        jp_actions = new javax.swing.JPanel();
        jb_actions = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MenuOptions = new javax.swing.JTree();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTab.setToolTipText("");

        jp_actions.setBackground(new java.awt.Color(17, 96, 136));
        jp_actions.setEnabled(false);
        jp_actions.setOpaque(false);

        jb_actions.setText("Close");
        jb_actions.setEnabled(false);
        jb_actions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_actionsLayout = new javax.swing.GroupLayout(jp_actions);
        jp_actions.setLayout(jp_actionsLayout);
        jp_actionsLayout.setHorizontalGroup(
            jp_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_actionsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jb_actions)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jp_actionsLayout.setVerticalGroup(
            jp_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_actionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jb_actions)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTab, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_actions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTab, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_actions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuOptions.setBackground(new java.awt.Color(102, 102, 102));
        MenuOptions.setFont(new java.awt.Font("3270 Nerd Font", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Home");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Records");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Employee Records");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Client Records");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Supplier Records");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Product Records");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Branch Records");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Settings");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Account");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        MenuOptions.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        MenuOptions.setToolTipText("");
        MenuOptions.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                MenuOptionsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(MenuOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuOptionsValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_MenuOptionsValueChanged
        String selectedComponent = MenuOptions.getLastSelectedPathComponent().toString();
        
        int index = jTab.indexOfTab(selectedComponent);
        if (TabTracker.containsKey(selectedComponent)){
            jTab.setSelectedIndex(index);
        }
        else if (selectedComponent.equals("Employee Records") && !TabTracker.containsKey(selectedComponent)){
            openEmployeeRecordsTab(selectedComponent, index);
        }
        else if (selectedComponent.equals("Supplier Records") && !TabTracker.containsKey(selectedComponent)){
            openSupplierRecordsTab(selectedComponent, index);
        }
        else if (selectedComponent.equals("Client Records") && !TabTracker.containsKey(selectedComponent)){
            openClientRecordsTab(selectedComponent, index);
        }
        else if (selectedComponent.equals("Branch Records") && !TabTracker.containsKey(selectedComponent)){
            openBranchRecordsTab(selectedComponent, index);
            
        }
        else if (selectedComponent.equals("Account") && !TabTracker.containsKey(selectedComponent)){
            openAccountTab(selectedComponent, index);
        }
    }//GEN-LAST:event_MenuOptionsValueChanged

    private void jb_actionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actionsActionPerformed
        int index = jTab.getSelectedIndex();
        if (index != -1){
            String title = jTab.getTitleAt(index);
            jTab.removeTabAt(index);
            TabTracker.remove(title);
            if (jTab.getTabCount()==0){
                jb_actions.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jb_actionsActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }
    public void openEmployeeRecordsTab(String selectedComponent, int index){
        employeeRecords = new EmployeeRecords(this.cableCompany);
        employeeRecords.setVisible(true);
        employeeRecords.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);

            
        if(!jb_actions.isEnabled()){jb_actions.setEnabled(true);}
            
            // configure the action button
        jTab.addTab(selectedComponent, employeeRecords);
            // Store the Tab title and it's selected index in the hashmap, to ensure each tab is opened only once
        TabTracker.put(selectedComponent, index);
    }
    public void openSupplierRecordsTab(String selectedComponent, int index){
        supplierRecords = new SupplierRecords(this.cableCompany);
            
        supplierRecords.setVisible(true);
            
        if(!jb_actions.isEnabled()){jb_actions.setEnabled(true);}
            
            
        supplierRecords.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
            
        jTab.addTab(selectedComponent, supplierRecords);
            // Store the Tab title and it's selected index in the hashmap, to ensure each tab is opened only once
        TabTracker.put(selectedComponent, index);
        jTab.setSelectedIndex(index);
    }
    public void openClientRecordsTab(String selectedComponent, int index){
        clientRecords = new ClientRecords(this.cableCompany);
            
        clientRecords.setVisible(true);
            
        if(!jb_actions.isEnabled()){jb_actions.setEnabled(true);}
            
        // configure the action button
            
        clientRecords.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
            
        jTab.addTab(selectedComponent, clientRecords);
            // Store the Tab title and it's selected index in the hashmap, to ensure each tab is opened only once
        TabTracker.put(selectedComponent, index);
    }
    public void openBranchRecordsTab(String selectedComponent, int index){
        BranchRecords j = new BranchRecords();
            
        j.setVisible(true);
            
        j.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
            
        jTab.addTab(selectedComponent, j);
            // Store the Tab title and it's selected index in the hashmap, to ensure each tab is opened only once
        TabTracker.put(selectedComponent, index);
    }
    public void openAccountTab(String selectedComponent, int index){
        Account j = new Account();
            
        j.setVisible(true);
            
        j.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
            
        jTab.addTab(selectedComponent, j);
        // Store the Tab title and it's selected index in the hashmap, to ensure each tab is opened only once
        TabTracker.put(selectedComponent, index);
        jTab.setSelectedIndex(index);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JTree MenuOptions;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JButton jb_actions;
    private javax.swing.JPanel jp_actions;
    // End of variables declaration//GEN-END:variables
}
