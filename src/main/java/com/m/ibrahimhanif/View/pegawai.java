package com.m.ibrahimhanif.View;
import com.formdev.flatlaf.FlatClientProperties;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class pegawai extends javax.swing.JInternalFrame {
    ArrayList<String> daftar_uuid;

    public pegawai() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            sandi.putClientProperty( FlatClientProperties.STYLE, "showRevealButton: true" );
            save.putClientProperty( "JButton.buttonType", "roundRect" );
            edit.putClientProperty( "JButton.buttonType", "roundRect" );
            delete.putClientProperty( "JButton.buttonType", "roundRect" );
            
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftar = new javax.swing.JList<>();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jenis_kelamin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        sandi = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        akun_uuid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        no_telp = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 249));
        setBorder(null);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(605, 550));
        setPreferredSize(new java.awt.Dimension(625, 550));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Akun Pegawai");

        jScrollPane1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        daftar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                daftarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(daftar);

        delete.setBackground(new java.awt.Color(255, 44, 44));
        delete.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(253, 255, 252));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/delete.png"))); // NOI18N
        delete.setToolTipText("Hapus Akun");
        delete.setMargin(new java.awt.Insets(10, 10, 10, 10));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Informasi");

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        nama.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jenis_kelamin.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        jenis_kelamin.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel8.setText("ID");

        id.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        sandi.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel9.setText("Sandi");

        save.setBackground(new java.awt.Color(164, 222, 2));
        save.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(253, 255, 252));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/save.png"))); // NOI18N
        save.setToolTipText("Buat Akun Baru");
        save.setMargin(new java.awt.Insets(10, 10, 10, 10));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(72, 202, 228));
        edit.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(253, 255, 252));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/edit.png"))); // NOI18N
        edit.setToolTipText("Update Akun");
        edit.setMargin(new java.awt.Insets(10, 10, 10, 10));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel7.setText("Daftar");

        akun_uuid.setEditable(false);
        akun_uuid.setBackground(new java.awt.Color(253, 255, 252));
        akun_uuid.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        akun_uuid.setFocusable(false);
        akun_uuid.setRequestFocusEnabled(false);

        jLabel10.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel10.setText("UUID");

        jLabel11.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel11.setText("Level");

        level.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standar", "Admin" }));
        level.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel5.setText("No Telephone");

        no_telp.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        alamat.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel6.setText("Alamat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(27, 27, 27)
                            .addComponent(akun_uuid, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no_telp)
                            .addComponent(alamat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jenis_kelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11))
                                    .addGap(76, 76, 76)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sandi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(level, javax.swing.GroupLayout.Alignment.TRAILING, 0, 200, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(edit)
                                .addGap(18, 18, 18)
                                .addComponent(delete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akun_uuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save)
                            .addComponent(delete)
                            .addComponent(edit))))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void daftarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_daftarValueChanged
        try {
            id.setText("");
            sandi.setText("");
            akun_uuid.setText(daftar_uuid.get(daftar.getSelectedIndex()));
            ResultSet data = data_adapter.GetAkun(akun_uuid.getText());
            
            if (data.next()) {
                level.setSelectedItem(data.getString("level"));
                nama.setText(data.getString("nama"));
                jenis_kelamin.setSelectedItem(data.getString("gender"));
                no_telp.setText(data.getString("telp"));
                alamat.setText(data.getString("alamat"));
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_daftarValueChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (id.getText().isEmpty() || sandi.getText().isEmpty() || nama.getText().isEmpty() || level.getSelectedItem().toString().isEmpty() || jenis_kelamin.getSelectedItem().toString().isEmpty() || no_telp.getText().isEmpty() || alamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.AddAkun(id.getText(), sandi.getText(), nama.getText(), jenis_kelamin.getSelectedItem().toString(), no_telp.getText(), alamat.getText(), level.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Berhasil membuat akun baru", "Tambah Akun", JOptionPane.INFORMATION_MESSAGE);
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (akun_uuid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon pilih akun dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.DelAkun(akun_uuid.getText());
            JOptionPane.showMessageDialog(this, "Berhasil menghapus", "Hapus Akun", JOptionPane.INFORMATION_MESSAGE);
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if (akun_uuid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon pilih akun dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (id.getText().isEmpty() || sandi.getText().isEmpty() || nama.getText().isEmpty() || level.getSelectedItem().toString().isEmpty() || jenis_kelamin.getSelectedItem().toString().isEmpty() || no_telp.getText().isEmpty() || alamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.UpAkun(id.getText(), sandi.getText(), nama.getText(), jenis_kelamin.getSelectedItem().toString(), no_telp.getText(), alamat.getText(), level.getSelectedItem().toString(), akun_uuid.getText());
            JOptionPane.showMessageDialog(this, "Berhasil memperbaharui akun", "Edit Akun", JOptionPane.INFORMATION_MESSAGE);
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editActionPerformed

    private void Refresh() throws Exception{
        ResultSet rs = data_adapter.GetAkun();
        DefaultListModel isi = new DefaultListModel();
        daftar_uuid = new ArrayList<>();

        while (rs.next()) {
            daftar_uuid.add(rs.getString("uuid"));
            isi.addElement(rs.getString("nama"));
        }
        
        daftar.setModel(isi);
        
        id.setText("");
        sandi.setText("");
        level.setSelectedIndex(0);
        nama.setText("");
        jenis_kelamin.setSelectedIndex(0);
        no_telp.setText("");
        alamat.setText("");
        akun_uuid.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField akun_uuid;
    private javax.swing.JTextField alamat;
    private javax.swing.JList<String> daftar;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis_kelamin;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_telp;
    private javax.swing.JPasswordField sandi;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}