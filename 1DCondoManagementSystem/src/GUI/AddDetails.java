package GUI;

/**
 * @author Paul Reonal 
 * - Designed the java form 
 * - Implements the code
 */
public class AddDetails extends javax.swing.JFrame {

    String _data;
    EditDetails _myEditDetails;

    public AddDetails() {
        initComponents();
    }

    public String getData() {
        return _data;
    }

    public void setEditDetails(EditDetails data) {
        _myEditDetails = data;
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
        jLabel1 = new javax.swing.JLabel();
        ADDetailText = new javax.swing.JTextField();
        ADCancelButton = new javax.swing.JButton();
        ADAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(741, 607));
        setMinimumSize(new java.awt.Dimension(741, 607));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 158, 181));
        jPanel1.setMaximumSize(new java.awt.Dimension(741, 607));
        jPanel1.setMinimumSize(new java.awt.Dimension(741, 607));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 607));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Add Detail:");

        ADCancelButton.setForeground(new java.awt.Color(156, 40, 75));
        ADCancelButton.setText("Cancel");
        ADCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADCancelButtonActionPerformed(evt);
            }
        });

        ADAddButton.setForeground(new java.awt.Color(156, 40, 75));
        ADAddButton.setText("Add");
        ADAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ADDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ADAddButton)
                        .addGap(31, 31, 31)
                        .addComponent(ADCancelButton)))
                .addGap(214, 214, 214))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADCancelButton)
                    .addComponent(ADAddButton))
                .addContainerGap(299, Short.MAX_VALUE))
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

    private void ADAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADAddButtonActionPerformed
        this.setVisible(false);
        _myEditDetails.setVisible(true);
        _data = ADDetailText.getText();
        _myEditDetails.addDetails(_data);
    }//GEN-LAST:event_ADAddButtonActionPerformed

    private void ADCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADCancelButtonActionPerformed
        this.setVisible(false);
        _myEditDetails.setVisible(true);
    }//GEN-LAST:event_ADCancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADAddButton;
    private javax.swing.JButton ADCancelButton;
    private javax.swing.JTextField ADDetailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
