package GUI;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Everyone 
 * - Designed the java form 
 * - Implements the code
 */
public class EditDetails extends javax.swing.JFrame {

    private EditDescription _MyEditDescription = null;

    public EditDetails() {
        initComponents();
    }

    public void setDescriptionWindow(EditDescription win) {
        _MyEditDescription = win;
    }

    public void setUpValues(ArrayList<String> data) {
        DefaultTableModel detailModel = (DefaultTableModel) EDDetailTable.getModel();
        for (int j = 0; j < data.size(); ++j) {
            detailModel.addRow(new String[]{data.get(j)});
        }
    }

    public void addDetails(String data) {
        DefaultTableModel amenitiesModel = (DefaultTableModel) EDDetailTable.getModel();
        amenitiesModel.addRow(new String[]{data});
        _MyEditDescription.pushNewDetails(data);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EDOkButton = new javax.swing.JButton();
        EDRemoveButton = new javax.swing.JButton();
        EDAddButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EDDetailTable = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(741, 607));
        setMinimumSize(new java.awt.Dimension(741, 607));
        setSize(new java.awt.Dimension(741, 607));

        jPanel1.setBackground(new java.awt.Color(255, 158, 181));
        jPanel1.setMaximumSize(new java.awt.Dimension(741, 607));
        jPanel1.setMinimumSize(new java.awt.Dimension(741, 607));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 607));

        EDOkButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDOkButton.setForeground(new java.awt.Color(153, 153, 153));
        EDOkButton.setText("OK");
        EDOkButton.setPreferredSize(new java.awt.Dimension(89, 29));
        EDOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDOkButtonActionPerformed(evt);
            }
        });

        EDRemoveButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDRemoveButton.setForeground(new java.awt.Color(153, 153, 153));
        EDRemoveButton.setText("Remove");
        EDRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDRemoveButtonActionPerformed(evt);
            }
        });

        EDAddButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDAddButton.setForeground(new java.awt.Color(153, 153, 153));
        EDAddButton.setText("Add");
        EDAddButton.setMaximumSize(new java.awt.Dimension(89, 29));
        EDAddButton.setMinimumSize(new java.awt.Dimension(89, 29));
        EDAddButton.setPreferredSize(new java.awt.Dimension(89, 29));
        EDAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDAddButtonActionPerformed(evt);
            }
        });

        EDDetailTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Details"
            }
        ));
        EDDetailTable.setRequestFocusEnabled(false);
        EDDetailTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(EDDetailTable);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("DETAILS");

        jPanel8.setBackground(new java.awt.Color(255, 133, 162));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO NAME 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EDRemoveButton)
                            .addComponent(EDAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(title)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EDAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EDRemoveButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(EDOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(763, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EDRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDRemoveButtonActionPerformed
        int currentRow = EDDetailTable.getSelectedRow();
        DefaultTableModel tempModel = (DefaultTableModel) EDDetailTable.getModel();
        tempModel.removeRow(currentRow);
        _MyEditDescription.removeDetails(currentRow);
    }//GEN-LAST:event_EDRemoveButtonActionPerformed

    private void EDAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDAddButtonActionPerformed
        AddDetails newAdd = new AddDetails();
        newAdd.setEditDetails(this);
        newAdd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EDAddButtonActionPerformed

    private void EDOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDOkButtonActionPerformed
        this.setVisible(false);
        _MyEditDescription.setVisible(true);
    }//GEN-LAST:event_EDOkButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDAddButton;
    private javax.swing.JTable EDDetailTable;
    private javax.swing.JButton EDOkButton;
    private javax.swing.JButton EDRemoveButton;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
