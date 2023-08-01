package GUI;

import CMSClass.Condo;
import FileManager.Ostream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Everyone
 * - Designed the java form 
 * - Implements the code
 */
public class GenerateReport extends javax.swing.JFrame {

    private DefaultTableModel _MyModel;
    private Condo _MyCondo = Condo.get_instance();
    private ArrayList<String[]> _ReportData;
    private Ostream _MyOstream = Ostream.getInstance();
    private CMS _MyCMS;

    public GenerateReport() {
        initComponents();
        _MyModel = (DefaultTableModel) GRReportTable.getModel();
    }

    void setMyCMS(CMS data) {
        _MyCMS = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GRReportTable = new javax.swing.JTable();
        GRExitButton = new javax.swing.JButton();
        SaveToFileButton = new javax.swing.JButton();
        GRFilterCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        GenerateReportButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(741, 607));
        setMinimumSize(new java.awt.Dimension(741, 607));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 158, 181));
        jPanel1.setMaximumSize(new java.awt.Dimension(741, 607));
        jPanel1.setMinimumSize(new java.awt.Dimension(741, 607));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 607));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORT");

        GRReportTable.setBackground(new java.awt.Color(255, 235, 239));
        GRReportTable.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GRReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No,", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(GRReportTable);

        GRExitButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GRExitButton.setForeground(new java.awt.Color(153, 153, 153));
        GRExitButton.setText("Exit");
        GRExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRExitButtonActionPerformed(evt);
            }
        });

        SaveToFileButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        SaveToFileButton.setForeground(new java.awt.Color(153, 153, 153));
        SaveToFileButton.setText("SAVE");
        SaveToFileButton.setMaximumSize(new java.awt.Dimension(61, 29));
        SaveToFileButton.setMinimumSize(new java.awt.Dimension(61, 29));
        SaveToFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveToFileButtonActionPerformed(evt);
            }
        });

        GRFilterCombo.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        GRFilterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sold", "Available" }));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filter:");

        GenerateReportButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GenerateReportButton.setForeground(new java.awt.Color(153, 153, 153));
        GenerateReportButton.setText("GENERATE");
        GenerateReportButton.setMaximumSize(new java.awt.Dimension(61, 29));
        GenerateReportButton.setMinimumSize(new java.awt.Dimension(61, 29));
        GenerateReportButton.setPreferredSize(new java.awt.Dimension(61, 29));
        GenerateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportButtonActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(SaveToFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(GenerateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GRExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GRFilterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GRFilterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveToFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GRExitButton))
                .addGap(34, 34, 34))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(763, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportButtonActionPerformed
        String searchValue = GRFilterCombo.getSelectedIndex() == 0 ? "Sold" : "Available";
        _ReportData = new ArrayList<>();
        // Remove all of the values
        while (_MyModel.getRowCount() != 0) {
            _MyModel.removeRow(0);
        }
        int floorSize = _MyCondo.getAllFloors().size();
        // Iterate through all the floors
        for (int i = 0; i < floorSize; ++i) {
            // iterate through all the data
            for (int j = 0; j < _MyCondo.getAllFloors().get(i).getStatus().size(); ++j) {
                if (searchValue.equals(_MyCondo.getAllFloors().get(i).getStatus().get(j))) {
                    String[] dataRow = {_MyCondo.getAllFloors().get(i).getUnitNo().get(j), _MyCondo.getAllFloors().get(i).getStatus().get(j)};
                    _MyModel.addRow(dataRow);
                    _ReportData.add(dataRow);
                }
            }
        }
    }//GEN-LAST:event_GenerateReportButtonActionPerformed

    private void SaveToFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveToFileButtonActionPerformed
        JOptionPane.showMessageDialog(this, "File Saved", "Generate Report", JOptionPane.PLAIN_MESSAGE);
        _MyOstream.deleteReport();
        _MyOstream.exportReport(_ReportData);
    }//GEN-LAST:event_SaveToFileButtonActionPerformed

    private void GRExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRExitButtonActionPerformed
        this.setVisible(false);
        _MyCMS.setVisible(true);
    }//GEN-LAST:event_GRExitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GRExitButton;
    private javax.swing.JComboBox<String> GRFilterCombo;
    private javax.swing.JTable GRReportTable;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JButton SaveToFileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
