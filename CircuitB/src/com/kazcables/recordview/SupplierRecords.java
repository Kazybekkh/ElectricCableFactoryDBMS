package com.kazcables.recordview;

import com.kazcables.forms.Home;
import com.kazcables.model.Supplier;
import com.kazcables.model.Organization;
import com.kazcables.model.Supply;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class SupplierRecords extends javax.swing.JPanel {

    private final Organization organization;
    private final Home home;

    public SupplierRecords(Organization organization, Home home) {
        this.organization = organization;
        this.home = home;
        this.organization.initSuppliers();
        initComponents();
        showSuppliers();
    }

    public void addSupplierRow(String[] supplierRecord, DefaultTableModel model) {
        model.addRow(supplierRecord);
    }

    public void addSupplyRow(Object[] supply, DefaultTableModel model) {
        model.addRow(supply);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierList = new javax.swing.JTable();
        lbl_clientRecords1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplyList = new javax.swing.JTable();
        lbl_supply = new javax.swing.JLabel();
        tf_searchField = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        supplierList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "supplier name", "email", "phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierList);
        if (supplierList.getColumnModel().getColumnCount() > 0) {
            supplierList.getColumnModel().getColumn(2).setResizable(false);
        }

        lbl_clientRecords1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_clientRecords1.setText("Branch Supplier Records");

        supplyList.setAutoCreateRowSorter(true);
        supplyList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "supply material", "branch id", "price", "quantity", "supplier name", "supply type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(supplyList);

        lbl_supply.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_supply.setText("Supplies");

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Search Branch Supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_supply))
                    .addComponent(lbl_clientRecords1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(tf_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbl_clientRecords1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(lbl_supply)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        performSearchClientByFullName();
    }//GEN-LAST:event_btn_searchActionPerformed
    public void showSuppliers() {
        HashMap<String, Supplier> allSuppliers = this.organization.getAllSuppliers();
        DefaultTableModel model = (DefaultTableModel) supplierList.getModel();
        DefaultTableModel supplyModel = (DefaultTableModel) supplyList.getModel();
        model.setRowCount(0);
        supplyModel.setRowCount(0);
        if (allSuppliers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "EMPTY SUPPLIERS");
        }
        for (Map.Entry<String, Supplier> entry : allSuppliers.entrySet()) {
            Supplier s = entry.getValue();
            String[] row = s.getRow();
            if (row != null) {
                addSupplierRow(row, model);
                showSupplies(s, supplyModel);
            }
        }
        supplierList.setModel(model);
        supplyList.setModel(supplyModel);
        // Since 3 nested loops, runtime ~~ O(n^3)
    }
    public void openSupplierInfoDialog(Supplier supplier) {
        SupplierInfo supplierInfoPanel = new SupplierInfo(supplier, this.organization, this); // Assume this is a JPanel for displaying supplier info
        this.home.showDialogPanel(supplierInfoPanel, "Supplier Info");
    }
    
    public void performSearchClientByFullName() {
        String supplier_name = (String) tf_searchField.getText().trim().toLowerCase();

        Supplier supplier = this.organization.searchSupplier(supplier_name);

        if (supplier != null) {
            openSupplierInfoDialog(supplier);
        } else {
            JOptionPane.showMessageDialog(null, "Supplier with name " +supplier_name + " was not found");
        }
    }
    public void showSupplies(Supplier s, DefaultTableModel supplyModel) {
        Map<Integer, List<Supply>> supplies = s.getSuppliesToBranches();
        for (Map.Entry<Integer, List<Supply>> supplyEntry : supplies.entrySet()) {
            List<Supply> listOfSupply = supplyEntry.getValue();
            for (Supply supply : listOfSupply) {
                Object[] row = supply.getRow();
                row[1] = supplyEntry.getKey();
                row[4] = s.getName();
                addSupplyRow(row, supplyModel);
            }
        }
        // O(n^2)
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_clientRecords1;
    private javax.swing.JLabel lbl_supply;
    private javax.swing.JTable supplierList;
    private javax.swing.JTable supplyList;
    private javax.swing.JTextField tf_searchField;
    // End of variables declaration//GEN-END:variables
}
