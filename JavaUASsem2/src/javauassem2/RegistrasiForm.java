package javauassem2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.connection;


public class RegistrasiForm extends javax.swing.JFrame {

    
    public RegistrasiForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtjurusan = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Form Registrasi Mahasiswa");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javauassem2/thamrin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 90);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIGN UP");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 90, 700, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(40, 140, 620, 10);
        jPanel1.add(txtnama);
        txtnama.setBounds(20, 180, 200, 40);
        jPanel1.add(txtalamat);
        txtalamat.setBounds(250, 180, 200, 40);
        jPanel1.add(txtjurusan);
        txtjurusan.setBounds(480, 180, 200, 40);
        jPanel1.add(txtemail);
        txtemail.setBounds(480, 260, 200, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nama Lengkap :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 160, 100, 16);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Alamat Lengkap :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 160, 100, 16);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Program Studi :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 160, 100, 16);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Email : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(480, 240, 90, 20);

        btntambah.setBackground(new java.awt.Color(153, 51, 255));
        btntambah.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btntambah.setForeground(new java.awt.Color(255, 255, 255));
        btntambah.setText("Registrasi");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah);
        btntambah.setBounds(530, 340, 100, 50);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create Username       :");

        txtnim.setToolTipText("Maks 10 digit");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Create Password        :");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Registrasi Web Universitas MH Thamrin ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 260, 450, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void btntambah(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
        String nama = txtnama.getText();
        String alamat = txtalamat.getText();
        String jurusan = txtjurusan.getText();
        String email = txtemail.getText();
        String username = txtnim.getText();
        String password = String.valueOf(txtpass.getPassword());
        
        if(username.equals("")){ 
            JOptionPane.showMessageDialog(null, "Please ADD a Username");
        } else if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Please ADD a Password");
        }
        
        PreparedStatement ps;
        String query = "INSERT INTO `db_uas`(`Nama`, `Alamat`, `ProgramStudi`, `Email`, `Username`, `Password`) VALUES (?,?,?,?,?,?)";

        try{
            ps = connection.getConnection().prepareStatement(query);
            
            ps.setString(1, nama);
            ps.setString(2, alamat);
            ps.setString(3, jurusan);
            ps.setString(4, email);
            ps.setString(5, username);
            ps.setString(6, password);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Kamu sukses melakukan registrasi");
                LoginForm LF = new LoginForm();
                LF.setVisible(true);
                this.setVisible(false);
            } else{JOptionPane.showMessageDialog(null, "Kamu gagal melakukan registrasi"); }
          } 
        catch(SQLException ex){
            Logger.getLogger(RegistrasiForm.class.getName()).log(Level.SEVERE,null,ex);
        }        
    }
    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        String nama = txtnama.getText();
        String alamat = txtalamat.getText();
        String jurusan = txtjurusan.getText();
        String email = txtemail.getText();
        String username = txtnim.getText();
        String password = String.valueOf(txtpass.getPassword());
        
        if(username.equals("")){ 
            JOptionPane.showMessageDialog(null, "Please ADD a username");
        } else if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Please ADD a Password");
        }
        
        PreparedStatement ps;
        String query = "INSERT INTO `db_uas`(`Nama`, `Alamat`, `ProgramStudi`, `Email`, `Username`, `Password`) VALUES (?,?,?,?,?,?)";

        try{
            ps = connection.getConnection().prepareStatement(query);
            
            ps.setString(1, nama);
            ps.setString(2, alamat);
            ps.setString(3, jurusan);
            ps.setString(4, email);
            ps.setString(5, username);
            ps.setString(6, password);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Kamu sukses melakukan registrasi");
                LoginForm LF = new LoginForm();
                LF.setVisible(true);
                this.setVisible(false);
            } else{JOptionPane.showMessageDialog(null, "Kamu gagal melakukan registrasi"); }
          } 
        catch(SQLException ex){
            Logger.getLogger(RegistrasiForm.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btntambahActionPerformed

        public boolean checkUsername( String Username ) throws SQLException{
        PreparedStatement ps;
        ResultSet rs;
        boolean checkuser = false;
        String query = "SELECT * FROM `db_uas` WHERE `Username` =?";
        try{
            ps = connection.getConnection().prepareStatement(query);
            ps.setString(1, Username);
          
            rs = ps.executeQuery();
            if(rs.next()){
                checkuser = true;
            }
        } catch(SQLException ex){
            Logger.getLogger(RegistrasiForm.class.getName()).log(Level.SEVERE,null,ex);
        }
        return checkuser;
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrasiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrasiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrasiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrasiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrasiForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtjurusan;
    public javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    private void log(Level SEVERE, Object object, SQLException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
