package GUI;

import CMSClass.Condo;
import FileManager.Istream;
import FileManager.Ostream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Paul Reonal 
 * - Designed the java form 
 * - Implements the code
 */
public class EditDescription extends javax.swing.JFrame {

    CMS _myCMS = null;
    DescriptionWindow _MyDescription = null;
    Istream _istream = Istream.getInstance();
    Ostream _ostream = Ostream.getInstance();
    private int _tableIndex;
    private int _rowPos;
    Condo _MyCondo = Condo.get_instance();

    ArrayList<String> newDetails = new ArrayList<>();
    ArrayList<String> newAmenities = new ArrayList<>();

    public EditDescription() {
        initComponents();
    }

    public EditDescription(int tableIndex, int rowPos) {
        initComponents();
        _tableIndex = tableIndex;
        _rowPos = rowPos;
        setUpValues();
    }

    public void pushNewDetails(String data) {
        newDetails.add(data);
        addDetail(data);
    }

    public void addDetail(String str) {
        DefaultTableModel tempModel = (DefaultTableModel) DetailsTable.getModel();
        String[] myStr = {str};
        tempModel.addRow(myStr);
    }

    public void removeDetails(int row) {
        DefaultTableModel tempModel = (DefaultTableModel) DetailsTable.getModel();
        tempModel.removeRow(row);
        newDetails.remove(row);
    }

    public void pushNewAmenities(String data) {
        newAmenities.add(data);
        addAmeties(data);
    }

    public void addAmeties(String str) {
        DefaultTableModel tempModel = (DefaultTableModel) AmentiesTable.getModel();
        String[] myStr = {str};
        tempModel.addRow(myStr);
    }

    public void removeAmenities(int row) {
        DefaultTableModel tempModel = (DefaultTableModel) AmentiesTable.getModel();
        tempModel.removeRow(row);
        newAmenities.remove(row);
    }

    private void setUpValues() {
        EDCostText.setText(_MyCondo.getFloor(_tableIndex).getCost().get(_rowPos));
        EDUnitNoText.setText(_MyCondo.getFloor(_tableIndex).getUnitNo().get(_rowPos));
        EDMODCombo.setSelectedItem(_MyCondo.getFloor(_tableIndex).getModeOfPayment().get(_rowPos));
        StatusDropdown.setSelectedItem(_MyCondo.getFloor(_tableIndex).getStatus().get(_rowPos));

        DefaultTableModel detailModel = (DefaultTableModel) DetailsTable.getModel();
        ArrayList<ArrayList<String>> tempData = _MyCondo.getFloor(_tableIndex).getDetails();
        for (int j = 0; j < tempData.get(_rowPos).size(); ++j) {
            String TempDataValue = tempData.get(_rowPos).get(j);
            detailModel.addRow(new String[]{TempDataValue});
            newDetails.add(TempDataValue);
        }

        DefaultTableModel amenitiesModel = (DefaultTableModel) AmentiesTable.getModel();
        tempData = _MyCondo.getFloor(_tableIndex).getAmenities();
        for (int j = 0; j < tempData.get(_rowPos).size(); ++j) {
            String TempDataValue = tempData.get(_rowPos).get(j);
            amenitiesModel.addRow(new String[]{TempDataValue});
            newAmenities.add(TempDataValue);
        }
    }

    public void setMyCMS(CMS myCMS) {
        this._myCMS = myCMS;
    }

    public void setDescriptionWindow(DescriptionWindow window) {
        _MyDescription = window;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DWNameText1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AmentiesTable = new javax.swing.JTable();
        EDUnitNoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EDCostText = new javax.swing.JTextField();
        EDDetailButton = new javax.swing.JButton();
        EDAmenityButton = new javax.swing.JButton();
        EDConfirmButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();
        EDMODCombo = new javax.swing.JComboBox<>();
        EDBackButton = new javax.swing.JButton();
        StatusDropdown = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 0));
        setMaximumSize(new java.awt.Dimension(741, 607));
        setMinimumSize(new java.awt.Dimension(741, 607));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 158, 181));
        jPanel1.setMaximumSize(new java.awt.Dimension(741, 607));
        jPanel1.setMinimumSize(new java.awt.Dimension(741, 607));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 607));

        AmentiesTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AmentiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amenities"
            }
        ));
        jScrollPane1.setViewportView(AmentiesTable);

        EDUnitNoText.setEditable(false);
        EDUnitNoText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MOP :");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unit No. :");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cost :");

        EDCostText.setEditable(false);
        EDCostText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        EDDetailButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDDetailButton.setForeground(new java.awt.Color(153, 153, 153));
        EDDetailButton.setText("Edit");
        EDDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDDetailButtonActionPerformed(evt);
            }
        });

        EDAmenityButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDAmenityButton.setForeground(new java.awt.Color(153, 153, 153));
        EDAmenityButton.setText("Edit");
        EDAmenityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDAmenityButtonActionPerformed(evt);
            }
        });

        EDConfirmButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDConfirmButton.setForeground(new java.awt.Color(153, 153, 153));
        EDConfirmButton.setText("Confirm");
        EDConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDConfirmButtonActionPerformed(evt);
            }
        });

        DetailsTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        DetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Details"
            }
        ));
        jScrollPane2.setViewportView(DetailsTable);

        EDMODCombo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EDMODCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Full Payment", "Installment" }));

        EDBackButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EDBackButton.setForeground(new java.awt.Color(153, 153, 153));
        EDBackButton.setText("Back");
        EDBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDBackButtonActionPerformed(evt);
            }
        });

        StatusDropdown.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Sold" }));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("DESCRIPTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EDConfirmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EDBackButton)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EDDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDAmenityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EDMODCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EDCostText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EDUnitNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(StatusDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EDUnitNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDCostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EDMODCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EDDetailButton)
                    .addComponent(EDAmenityButton))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDConfirmButton)
                    .addComponent(EDBackButton))
                .addGap(27, 27, 27))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(763, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EDDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDDetailButtonActionPerformed
        EditDetails newEditDetail = new EditDetails();
        newEditDetail.setDescriptionWindow(this);
        newEditDetail.setUpValues(newDetails);
        newEditDetail.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EDDetailButtonActionPerformed

    private void EDAmenityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDAmenityButtonActionPerformed
        EditAmenities newEditAmenities = new EditAmenities();
        newEditAmenities.setDescriptionWindow(this);
        newEditAmenities.setUpValues(newAmenities);
        newEditAmenities.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EDAmenityButtonActionPerformed

    private void EDConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDConfirmButtonActionPerformed
        String unitText = EDUnitNoText.getText();
        String costText = EDCostText.getText();
        String modeOfPayment = EDMODCombo.getSelectedIndex() == 0 ? "N/A" : EDMODCombo.getSelectedIndex() == 1 ? "Full Payment" : "Installment";
        String status = StatusDropdown.getSelectedIndex() == 0 ? "Available" : "Sold";
        
        _MyCondo.replaceUnitNo(_tableIndex, _rowPos, unitText);
        _MyCondo.replaceCost(_tableIndex, _rowPos, costText);
        _MyCondo.replaceModeOfPayment(_tableIndex, _rowPos, modeOfPayment);
        _MyCondo.replaceDetails(_tableIndex, _rowPos, newDetails);
        _MyCondo.replaceAmenities(_tableIndex, _rowPos, newAmenities);
        _MyCondo.replaceStatus(_tableIndex, _rowPos, status);
        
        _myCMS.updateEditedValue(_tableIndex, _rowPos);
        this.setVisible(false);
        _myCMS.setVisible(true);
        _ostream.updateFiles();
    }//GEN-LAST:event_EDConfirmButtonActionPerformed

    private void EDBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDBackButtonActionPerformed
        if (_myCMS == null) {
            _MyDescription.setVisible(true);
        } else {
            _myCMS.setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_EDBackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmentiesTable;
    private javax.swing.JTextField DWNameText1;
    private javax.swing.JTable DetailsTable;
    private javax.swing.JButton EDAmenityButton;
    private javax.swing.JButton EDBackButton;
    private javax.swing.JButton EDConfirmButton;
    private javax.swing.JTextField EDCostText;
    private javax.swing.JButton EDDetailButton;
    private javax.swing.JComboBox<String> EDMODCombo;
    private javax.swing.JTextField EDUnitNoText;
    private javax.swing.JComboBox<String> StatusDropdown;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
