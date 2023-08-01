package GUI;

import CMSClass.Condo;
import FileManager.Istream;
import FileManager.Ostream;
import java.util.ArrayList;

/**
 * @author Paul Reonal 
 * - Designed the java form 
 * - Implements the code
 */
public class SellCondo extends javax.swing.JFrame {

    private CMS _myCMS;
    private Istream _istream = Istream.getInstance();
    private Ostream _ostream = Ostream.getInstance();
    private Condo _MyCondo = Condo.get_instance();

    public SellCondo() {
        this._ostream = Ostream.getInstance();
        initComponents();
    }

    public void setCMS(CMS cms) {
        _myCMS = cms;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SCPaymentOptionCombo = new javax.swing.JComboBox<>();
        SCSelectFloorLabel1 = new javax.swing.JLabel();
        SCEnterUnitText = new javax.swing.JTextField();
        SCSelectFloorCombo = new javax.swing.JComboBox<>();
        SCEnterUnitLabel = new javax.swing.JLabel();
        SCSelectFloorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SCExitButton = new javax.swing.JButton();
        SCConfirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(741, 607));

        jPanel1.setBackground(new java.awt.Color(255, 158, 181));
        jPanel1.setMaximumSize(new java.awt.Dimension(741, 607));
        jPanel1.setMinimumSize(new java.awt.Dimension(741, 607));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 607));

        SCPaymentOptionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Payment", "Installment" }));

        SCSelectFloorLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCSelectFloorLabel1.setText("Payment Option:");

        SCEnterUnitText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCEnterUnitTextActionPerformed(evt);
            }
        });

        SCSelectFloorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4", "Floor 5" }));

        SCEnterUnitLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCEnterUnitLabel.setText("Enter Condo Unit:");

        SCSelectFloorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCSelectFloorLabel.setText("Select Floor:");

        jLabel1.setText("Specify the floor and enter the condo unit to sell:");

        SCExitButton.setForeground(new java.awt.Color(156, 40, 75));
        SCExitButton.setText("Exit");
        SCExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCExitButtonActionPerformed(evt);
            }
        });

        SCConfirmButton.setForeground(new java.awt.Color(156, 40, 75));
        SCConfirmButton.setText("Confirm");
        SCConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SCSelectFloorLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SCPaymentOptionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SCEnterUnitLabel)
                                        .addComponent(SCConfirmButton))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SCEnterUnitText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SCExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(245, 245, 245))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(SCSelectFloorLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SCSelectFloorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(174, 174, 174)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCSelectFloorLabel)
                    .addComponent(SCSelectFloorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCSelectFloorLabel1)
                    .addComponent(SCPaymentOptionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCEnterUnitLabel)
                    .addComponent(SCEnterUnitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCExitButton)
                    .addComponent(SCConfirmButton))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(660, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SCExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCExitButtonActionPerformed
        this.setVisible(false);
        _myCMS.setVisible(true);
    }//GEN-LAST:event_SCExitButtonActionPerformed

    private void SCConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCConfirmButtonActionPerformed
        String UnitNo = SCEnterUnitText.getText();
        String modeOfPayment = SCPaymentOptionCombo.getSelectedIndex() == 0 ? "Full Payment" : "Installment";
        int floorIndex = SCSelectFloorCombo.getSelectedIndex();
        ArrayList<String> units = _MyCondo.getFloor(floorIndex).getUnitNo();
        int rowIndex = 0;
        for (int i = 0; i < units.size(); ++i) {
            if (units.get(i) == null ? UnitNo == null : units.get(i).equals(UnitNo)) {
                _MyCondo.getFloor(floorIndex).getModeOfPayment().set(i, modeOfPayment);
                _MyCondo.getFloor(floorIndex).getStatus().set(i, "Sold");
                rowIndex = i;
                break;
            }
        }
        _ostream.updateFiles();
        _myCMS.updateEditedValue(floorIndex, rowIndex);
        this.setVisible(false);
        _myCMS.setVisible(true);
    }//GEN-LAST:event_SCConfirmButtonActionPerformed

    private void SCEnterUnitTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCEnterUnitTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCEnterUnitTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SCConfirmButton;
    private javax.swing.JLabel SCEnterUnitLabel;
    private javax.swing.JTextField SCEnterUnitText;
    private javax.swing.JButton SCExitButton;
    private javax.swing.JComboBox<String> SCPaymentOptionCombo;
    private javax.swing.JComboBox<String> SCSelectFloorCombo;
    private javax.swing.JLabel SCSelectFloorLabel;
    private javax.swing.JLabel SCSelectFloorLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
