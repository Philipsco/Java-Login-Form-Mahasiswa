/*FrameKontak*/
package javauassem2;
import database.DataMahasiswa;
import database.DataTabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MenuAdmin extends javax.swing.JFrame {
    private Connection koneksi;
    private Statement script;
    private DataTabel ModelDataTabel;

    public MenuAdmin() {
        initComponents();
        ModelDataTabel = new DataTabel();
        ModelTabel.setModel(ModelDataTabel);
        KoneksiDb( );
        tampil( );  
        bersih();
}
    private void KoneksiDb( ){ 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/uas.db", "root", "");
            script = koneksi.createStatement();
        } catch(SQLException ex){
            System.err.print(ex);
        } catch(ClassNotFoundException ex){
            System.err.print(ex);
            }
    }
    
    private void bersih( ){
    txtnamaedit.setText("Nama");
    txtjurusanedit.setText("Program Studi");
    txtalamatedit.setText("Alamat Lengkap");
    txtnimedit.setText("Username");
    txtpasswordedit.setText("Password");
    txtemailedit.setText("Email");
    }

    private void tampil( ){
        try{
            int baris = ModelTabel.getRowCount( );
            for(int i=0; i<baris; i++){
                ModelDataTabel.delete(0, baris);
    }

    String sql = "select * from db_uas";
    ResultSet rs = script.executeQuery(sql);

    while (rs.next( )){
        DataMahasiswa mahasiswa = new DataMahasiswa( );

        mahasiswa.setNama(rs.getString(1));
        mahasiswa.setAlamat(rs.getString(2));
        mahasiswa.setprogramStudi(rs.getString(3));
        mahasiswa.setEmail(rs.getString(4));
        mahasiswa.setUsername(rs.getString(5));
        mahasiswa.setPassword(rs.getString(6));

        ModelDataTabel.add(mahasiswa);
    }
} catch(SQLException ex){
    System.err.print(ex);
    }
}

    private void tabel( ){
        ModelTabel.getSelectionModel( ).addListSelectionListener(new ListSelectionListener() {

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int baris = ModelTabel.getSelectedRow( );

        if(baris != -1){
            DataMahasiswa mahasiswa = ModelDataTabel.get(baris);
            txtnamaedit.setText(mahasiswa.getNama());
            txtalamatedit.setText(mahasiswa.getAlamat( ));
            txtjurusanedit.setText(mahasiswa.getprogramStudi());
            txtemailedit.setText(mahasiswa.getEmail( ));
            txtnimedit.setText(mahasiswa.getUsername());
            txtpasswordedit.setText(mahasiswa.getPassword( ));
        }
    }
  });
}



    private void ubah( ){
        int app;

        if((app = JOptionPane.showConfirmDialog(null, "Ubah Data"+" ?","Perhatian",JOptionPane.YES_NO_OPTION))==0){
            try{
                String sql = "update db_uas set"
                +" Nama = '"+txtnamaedit.getText()+"',"
                +" Alamat = '"+txtalamatedit.getText()+"',"
                +" ProgramStudi = '"+txtjurusanedit.getText()+"',"
                +" Email = '"+txtemailedit.getText()+"',"
                +" Username = '"+txtnimedit.getText()+"',"
                +" Password = '"+txtpasswordedit.getText()+"' where"
                +" Nama = '"+txtnamaedit.getText()+"'";

                script.executeUpdate(sql);

                tampil( );
                JOptionPane.showMessageDialog(null, "Data berhasil dirubah");
                bersih();
                } catch(SQLException ex){
                    System.err.print(ex);
                }
        }
    }
    


    private void hapus( ){
        int app, bantu;

        if((app = JOptionPane.showConfirmDialog(null, "Hapus data"+" ?","Perhatian",JOptionPane.YES_NO_OPTION))==0){
            try{
                String sql = "delete from db_uas where"+" Nama = '"+txtnamaedit.getText()+"'";

                bantu = script.executeUpdate(sql);

                tampil( );
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                bersih();
            } catch(SQLException ex){
                System.err.print(ex);
            }
        }
    }
    
    private void cari( ){
        int baris = ModelTabel.getRowCount( );
        String bantu = cmbcari.getSelectedItem( ).toString( );

        for(int i=0; i<baris; i++){
            ModelDataTabel.delete(i, baris);
        }

        try{
            String sql = "select * from db_uas where "
            +bantu+" like '%"+txtcari.getText()+"%'";

            ResultSet rs = script.executeQuery(sql);

            while(rs.next( )){
                DataMahasiswa mahasiswa = new DataMahasiswa( );

                mahasiswa.setNama(rs.getString(1));
                mahasiswa.setAlamat(rs.getString(2));
                mahasiswa.setprogramStudi(rs.getString(3));
                mahasiswa.setEmail(rs.getString(4));
                mahasiswa.setUsername(rs.getString(5));
                mahasiswa.setPassword(rs.getString(6));

                ModelDataTabel.add(mahasiswa);
            }
        } catch(SQLException ex){
            System.err.print(ex);
        }
    }
    
    private void nextActivity(){
        LoginForm LF = new LoginForm();
        LF.setVisible(true);
        this.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtnamaedit = new javax.swing.JTextField();
        txtalamatedit = new javax.swing.JTextField();
        txtjurusanedit = new javax.swing.JTextField();
        txtemailedit = new javax.swing.JTextField();
        txtnimedit = new javax.swing.JTextField();
        txtpasswordedit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ModelTabel = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cmbcari = new javax.swing.JComboBox<>();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 440));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javauassem2/logo_thamrin.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Mahasiswa yang sudah Registrasi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnback.setBackground(new java.awt.Color(0, 0, 153));
        btnback.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(204, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        txtnamaedit.setText("Nama");
        txtnamaedit.setToolTipText("Nama");

        txtalamatedit.setText("Alamat");
        txtalamatedit.setPreferredSize(new java.awt.Dimension(33, 20));

        txtjurusanedit.setText("Program Studi");
        txtjurusanedit.setPreferredSize(new java.awt.Dimension(33, 20));

        txtemailedit.setText("Email");
        txtemailedit.setPreferredSize(new java.awt.Dimension(33, 20));

        txtnimedit.setText("Username");
        txtnimedit.setPreferredSize(new java.awt.Dimension(33, 20));

        txtpasswordedit.setText("Password");
        txtpasswordedit.setPreferredSize(new java.awt.Dimension(33, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnamaedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtalamatedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtjurusanedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemailedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnimedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpasswordedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamaedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtalamatedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjurusanedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnimedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpasswordedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        ModelTabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        ModelTabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ModelTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        ModelTabel.setGridColor(new java.awt.Color(255, 255, 255));
        ModelTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ModelTabelMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(ModelTabel);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btnedit.setBackground(new java.awt.Color(102, 102, 102));
        btnedit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnedit.setForeground(new java.awt.Color(0, 204, 0));
        btnedit.setText("Edit Data");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(153, 153, 255));
        btnhapus.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(102, 102, 102));
        btnhapus.setText("Hapus Data");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hapus dan Edit Data by Nama Mahasiswa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhapus)
                    .addComponent(btnedit))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        cmbcari.setBackground(new java.awt.Color(255, 102, 0));
        cmbcari.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        cmbcari.setForeground(new java.awt.Color(204, 255, 204));
        cmbcari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama", "Username", "Email" }));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

        btncari.setBackground(new java.awt.Color(204, 153, 0));
        btncari.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btncari.setForeground(new java.awt.Color(204, 204, 204));
        btncari.setText("Search");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Data ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cmbcari, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        nextActivity();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        hapus( );
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        ubah( );
    }//GEN-LAST:event_btneditActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        cari();
    }//GEN-LAST:event_btncariActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void ModelTabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModelTabelMousePressed
        // TODO add your handling code here:
        tabel();
    }//GEN-LAST:event_ModelTabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ModelTabel;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JComboBox<String> cmbcari;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtalamatedit;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtemailedit;
    private javax.swing.JTextField txtjurusanedit;
    private javax.swing.JTextField txtnamaedit;
    private javax.swing.JTextField txtnimedit;
    private javax.swing.JTextField txtpasswordedit;
    // End of variables declaration//GEN-END:variables

}