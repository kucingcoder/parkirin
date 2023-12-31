package com.m.ibrahimhanif.View;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class tarif extends javax.swing.JInternalFrame {
    ArrayList<String> daftar_id;

    public tarif() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
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
        normal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jenis = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jenis_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        perjam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        waktu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 249));
        setBorder(null);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(605, 550));
        setPreferredSize(new java.awt.Dimension(625, 550));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Tetapkan Tarif");
        jLabel1.setToolTipText("");

        jScrollPane1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        daftar.setBackground(new java.awt.Color(253, 255, 252));
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
        delete.setToolTipText("Hapus Tarif");
        delete.setMargin(new java.awt.Insets(10, 10, 10, 10));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Informasi");

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setText("Tarif Normal");

        normal.setBackground(new java.awt.Color(253, 255, 252));
        normal.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel8.setText("Jenis");

        jenis.setBackground(new java.awt.Color(253, 255, 252));
        jenis.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        save.setBackground(new java.awt.Color(164, 222, 2));
        save.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(253, 255, 252));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/save.png"))); // NOI18N
        save.setToolTipText("Buat Tarif Baru");
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
        edit.setToolTipText("Update Tarif");
        edit.setMargin(new java.awt.Insets(10, 10, 10, 10));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel7.setText("Daftar");

        jenis_id.setEditable(false);
        jenis_id.setBackground(new java.awt.Color(253, 255, 252));
        jenis_id.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jenis_id.setFocusable(false);
        jenis_id.setRequestFocusEnabled(false);

        jLabel10.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel10.setText("ID");

        perjam.setBackground(new java.awt.Color(253, 255, 252));
        perjam.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel4.setText("Tarif Per Jam");

        waktu.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 jam", "2 jam", "3 jam", "4 jam", "5 jam", "6 jam", "7 jam", "8 jam", "9 jam", "10 jam", "11 jam", "12 jam", "13 jam", "14 jam", "15 jam", "16 jam", "17 jam", "18 jam", "19 jam", "20 jam", "21 jam", "22 jam", "23 jam", "24 jam" }));
        waktu.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel9.setText("Waktu Normal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jenis_id, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(save)
                            .addGap(18, 18, 18)
                            .addComponent(edit)
                            .addGap(18, 18, 18)
                            .addComponent(delete))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(31, 31, 31))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(79, 79, 79)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(normal, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(jenis, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(perjam, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                            .addGap(1, 1, 1)))
                    .addComponent(jLabel4))
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenis_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(normal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save)
                            .addComponent(delete)
                            .addComponent(edit))))
                .addContainerGap(91, Short.MAX_VALUE))
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
            jenis_id.setText(daftar_id.get(daftar.getSelectedIndex()));
            ResultSet data = data_adapter.GetTarif(Integer.parseInt(jenis_id.getText()));
            
            if (data.next()) {
                jenis.setText(data.getString("jenis"));
                waktu.setSelectedIndex(data.getInt("waktu_normal") - 1);
                normal.setText(data.getString("biaya_normal"));
                perjam.setText(data.getString("biaya_perjam"));
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_daftarValueChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (jenis.getText().isEmpty() || waktu.getSelectedIndex() < 0 || normal.getText().isEmpty() || perjam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.AddTarif(jenis.getText(), waktu.getSelectedIndex() + 1, Integer.parseInt(normal.getText()), Integer.parseInt(perjam.getText()));
            JOptionPane.showMessageDialog(this, "Berhasil membuat tarif baru", "Tambah Tarif", JOptionPane.INFORMATION_MESSAGE);
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (jenis_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon pilih jenis dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.DelTarif(Integer.parseInt(jenis_id.getText()));
            JOptionPane.showMessageDialog(this, "Berhasil menghapus", "Hapus Tarif", JOptionPane.INFORMATION_MESSAGE);
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if (jenis_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon pilih jenis dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (jenis.getText().isEmpty() || waktu.getSelectedIndex() < 0 || normal.getText().isEmpty() || perjam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.UpTarif(jenis.getText(), waktu.getSelectedIndex() + 1, Integer.parseInt(normal.getText()), Integer.parseInt(perjam.getText()), Integer.parseInt(jenis_id.getText()));
            JOptionPane.showMessageDialog(this, "Berhasil memperbaharui tarif", "Edit Tarif", JOptionPane.INFORMATION_MESSAGE);
            Refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editActionPerformed

    private void Refresh() throws Exception{
        ResultSet rs = data_adapter.GetTarif();
        DefaultListModel isi = new DefaultListModel();
        daftar_id = new ArrayList<>();

        while (rs.next()) {
            daftar_id.add(rs.getString("id"));
            isi.addElement(rs.getString("jenis"));
        }
        
        daftar.setModel(isi);
        
        jenis.setText("");
        waktu.setSelectedIndex(-1);
        normal.setText("");
        perjam.setText("");
        jenis_id.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> daftar;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField jenis_id;
    private javax.swing.JTextField normal;
    private javax.swing.JTextField perjam;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> waktu;
    // End of variables declaration//GEN-END:variables
}