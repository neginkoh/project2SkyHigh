/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skyhighmedical;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DoctorSearchPatient extends javax.swing.JFrame {

    /**
     * Creates new form DoctorSearchPatient
     */
    public DoctorSearchPatient() {
        setupTable1();
         connect();
        
        initComponents();
    }
    private static String USERNAME = "z3419939";
    private static String PASSWORD = "zAnAnah2";
    private Connection con;
    private DefaultTableModel tableModel2;
    private PreparedStatement st;
    private ResultSet rs;
    private int tableRow1;
    private String fname1;
    
    public void connect() {
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            String url = "jdbc:oracle:thin:@//" + "sage.business.unsw.edu.au" + ":" + "1521" + "/" + "orcl01" + ".asbpldb001.ad.unsw.edu.au";
           
            con = DriverManager.getConnection(url, USERNAME, PASSWORD);
            System.out.println("Connected to database");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database, please start the server"
                    + " in the 'Services' tab or read the setup instructions.");
                   }
    }
    
      public void setupTable1() {
        setupSearchTable1();
    }
    private void setupSearchTable1() {

        tableModel2 = new DefaultTableModel();
        tableModel2.setColumnCount(4);
        tableModel2.setColumnIdentifiers(new String[]{"Patient ID", "First Name", "Last Name", "Contact"});
        DocSearchTable1.setModel(tableModel2);
    }
    private void search() {
        try {
            String sql = "Select * from PATIENT where PATIENTID LIKE ?";
            st = con.prepareStatement(sql);
            st.setString(1, SearchPatientField.getText());
            rs = st.executeQuery();
            if (rs.next()) {
                tableModel2.setNumRows(1);
                String add1 = rs.getString("PATIENTID");
                tableModel2.setValueAt(add1, tableRow1, 0);
                String add2 = rs.getString("FIRSTNAME");
                tableModel2.setValueAt(add2, tableRow1, 1);
                String add3 = rs.getString("LASTNAME");
                tableModel2.setValueAt(add3, tableRow1, 2);
                String add4 = rs.getString("CONTACT");
                tableModel2.setValueAt(add4, tableRow1, 3);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sql = "Select * from PATIENT where FIRSTNAME LIKE ?";
            st = con.prepareStatement(sql);
            st.setString(1, SearchPatientField.getText());
            rs = st.executeQuery();
            if (rs.next()) {
                tableModel2.setNumRows(1);
                String add1 = rs.getString("PATIENTID");
                tableModel2.setValueAt(add1, tableRow1, 0);
                String add2 = rs.getString("FIRSTNAME");
                tableModel2.setValueAt(add2, tableRow1, 1);
                String add3 = rs.getString("LASTNAME");
                tableModel2.setValueAt(add3, tableRow1, 2);
                String add4 = rs.getString("CONTACT");
                tableModel2.setValueAt(add4, tableRow1, 3);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String sql = "Select * from PATIENT where LASTNAME LIKE ?";
            st = con.prepareStatement(sql);
            st.setString(1, SearchPatientField.getText());
            rs = st.executeQuery();
            if (rs.next()) {
                tableModel2.setNumRows(1);
                String add1 = rs.getString("PATIENTID");
                tableModel2.setValueAt(add1, tableRow1, 0);
                String add2 = rs.getString("FIRSTNAME");
                tableModel2.setValueAt(add2, tableRow1, 1);
                String add3 = rs.getString("LASTNAME");
                tableModel2.setValueAt(add3, tableRow1, 2);
                String add4 = rs.getString("CONTACT");
                tableModel2.setValueAt(add4, tableRow1, 3);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String sql = "Select * from PATIENT where CONTACT LIKE ?";
            st = con.prepareStatement(sql);
            st.setString(1, SearchPatientField.getText());
            rs = st.executeQuery();
            if (rs.next()) {
                tableModel2.setNumRows(1);
                String add1 = rs.getString("PATIENTID");
                tableModel2.setValueAt(add1, tableRow1, 0);
                String add2 = rs.getString("FIRSTNAME");
                tableModel2.setValueAt(add2, tableRow1, 1);
                String add3 = rs.getString("LASTNAME");
                tableModel2.setValueAt(add3, tableRow1, 2);
                String add4 = rs.getString("CONTACT");
                tableModel2.setValueAt(add4, tableRow1, 3);

            }

        } catch (Exception e) {
            jLabel1.setText("Search query failed. Please try again later");

            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel2 = new javax.swing.JLabel();
        SearchPatientField = new javax.swing.JTextField();
        searchButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DocName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DocSearchTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Screen Shot 2014-09-10 at 3.18.41 PM.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("Username:");

        searchButton2.setText("Search");
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1411298576_search_magnifying_glass_find-32.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("Doctor Patient Search");

        DocName.setText("jLabel5");

        DocSearchTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(DocSearchTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(SearchPatientField, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(searchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(267, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(332, 332, 332))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(DocName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchPatientField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        setupSearchTable1();
        search();
    }//GEN-LAST:event_searchButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorSearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorSearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorSearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorSearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorSearchPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DocName;
    private javax.swing.JTable DocSearchTable1;
    private javax.swing.JTextField SearchPatientField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchButton2;
    // End of variables declaration//GEN-END:variables
}
