package com.m.ibrahimhanif.View;
import com.formdev.flatlaf.FlatClientProperties;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class pengaturan extends javax.swing.JInternalFrame {

    public pengaturan() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            sandi.putClientProperty( FlatClientProperties.STYLE, "showRevealButton: true" );
            info.putClientProperty( "JButton.buttonType", "roundRect" );
            auth.putClientProperty( "JButton.buttonType", "roundRect" );
            
            ResultSet rs = data_adapter.GetInfo();
            
            nama.setText(rs.getString("nama"));
            jenis_kelamin.setSelectedItem(rs.getString("gender"));
            no_telp.setText(rs.getString("telp"));
            alamat.setText(rs.getString("alamat"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jenis_kelamin = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        no_telp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        auth = new javax.swing.JButton();
        sandi = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(244, 244, 249));
        setBorder(null);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(605, 500));
        setPreferredSize(new java.awt.Dimension(625, 500));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Pengaturan");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Informasi");

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setText("Nama");

        nama.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jenis_kelamin.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        jenis_kelamin.setSelectedIndex(-1);
        jenis_kelamin.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel5.setText("No Telephone");

        no_telp.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel6.setText("Alamat");

        alamat.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel7.setText("Autentikasi Baru");

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel8.setText("ID");

        id.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel9.setText("Sandi");

        info.setBackground(new java.awt.Color(241, 136, 5));
        info.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(253, 255, 252));
        info.setText("Simpan");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        auth.setBackground(new java.awt.Color(241, 136, 5));
        auth.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        auth.setForeground(new java.awt.Color(253, 255, 252));
        auth.setText("Simpan");
        auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authActionPerformed(evt);
            }
        });

        sandi.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama)
                            .addComponent(jenis_kelamin, 0, 165, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(no_telp, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(alamat)))
                    .addComponent(auth)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(info)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id)
                            .addComponent(sandi, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(info)
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(auth)
                .addContainerGap(32, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        if (nama.getText().isEmpty() || jenis_kelamin.getSelectedItem().toString().isEmpty() || no_telp.getText().isEmpty() || alamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.SetInfo(nama.getText(), jenis_kelamin.getSelectedItem().toString(), no_telp.getText(), alamat.getText());
            JOptionPane.showMessageDialog(this, "Berhasil menyimpan informasi terbaru", "Update Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_infoActionPerformed

    private void authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authActionPerformed
        if (id.getText().isEmpty() || sandi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.SetAuth(id.getText(), sandi.getText());
            JOptionPane.showMessageDialog(this, "Berhasil menyimpan autentikasi terbaru", "Update Login", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_authActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton auth;
    private javax.swing.JTextField id;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenis_kelamin;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_telp;
    private javax.swing.JPasswordField sandi;
    // End of variables declaration//GEN-END:variables
}
