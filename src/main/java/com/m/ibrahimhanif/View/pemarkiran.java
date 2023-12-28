package com.m.ibrahimhanif.View;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class pemarkiran extends javax.swing.JInternalFrame {
    ArrayList<Integer> daftar_id;
    
    public pemarkiran() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            cetak.putClientProperty( "JButton.buttonType", "roundRect" );
            
            ResultSet jenis = data_adapter.GetTarif();
            daftar_id = new ArrayList<>();
            
            while (jenis.next()) {
                jenis_kendaraan.addItem(jenis.getString("jenis"));
                daftar_id.add(jenis.getInt("id"));
            }
            
            jenis_kendaraan.setSelectedIndex(-1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nopol = new javax.swing.JTextField();
        jenis_kendaraan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nopol_tanpa_tiket = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        denda = new javax.swing.JTextField();
        selesai_denda = new javax.swing.JButton();
        selesai_normal = new javax.swing.JButton();
        no = new javax.swing.JTextField();

        setBackground(new java.awt.Color(244, 244, 249));
        setBorder(null);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(605, 550));
        setPreferredSize(new java.awt.Dimension(625, 550));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Kelola Kendaraan");

        jTabbedPane1.setBackground(new java.awt.Color(253, 255, 252));
        jTabbedPane1.setForeground(new java.awt.Color(241, 136, 5));
        jTabbedPane1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(253, 255, 252));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setText("Plat Nomor");

        nopol.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jenis_kendaraan.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jenis_kendaraan.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel4.setText("Jenis");

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Catat Kendaraan Masuk");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cetak.setBackground(new java.awt.Color(241, 136, 5));
        cetak.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        cetak.setForeground(new java.awt.Color(253, 255, 252));
        cetak.setText("Cetak Karcis");
        cetak.setMargin(new java.awt.Insets(3, 14, 3, 14));
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenis_kendaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nopol)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cetak)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenis_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(cetak)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(106, 106, 106))
        );

        jTabbedPane1.addTab("Masuk", jPanel2);

        jPanel3.setBackground(new java.awt.Color(253, 255, 252));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Catat Keluar");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel6.setText("No Tiket");

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel7.setText("Catat Keluar Tiket Hilang");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel8.setText("Nopol");

        nopol_tanpa_tiket.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        nopol_tanpa_tiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nopol_tanpa_tiketKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel9.setText("Denda");

        denda.setEditable(false);
        denda.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        selesai_denda.setBackground(new java.awt.Color(241, 136, 5));
        selesai_denda.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        selesai_denda.setForeground(new java.awt.Color(253, 255, 252));
        selesai_denda.setText("Selesai");
        selesai_denda.setMargin(new java.awt.Insets(3, 14, 3, 14));
        selesai_denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesai_dendaActionPerformed(evt);
            }
        });

        selesai_normal.setBackground(new java.awt.Color(241, 136, 5));
        selesai_normal.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        selesai_normal.setForeground(new java.awt.Color(253, 255, 252));
        selesai_normal.setText("Selesai");
        selesai_normal.setMargin(new java.awt.Insets(3, 14, 3, 14));
        selesai_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesai_normalActionPerformed(evt);
            }
        });

        no.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selesai_denda)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(nopol_tanpa_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(selesai_normal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(324, 324, 324))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selesai_normal)
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nopol_tanpa_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selesai_denda)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Keluar", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(20, 20, 20))
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

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        if (nopol.getText().isEmpty() || jenis_kendaraan.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.KendaraanMasuk(nopol.getText(), daftar_id.get(jenis_kendaraan.getSelectedIndex()));
            JOptionPane.showMessageDialog(this, "Berhasil mencatat kendaraan", "Parkir Masuk", JOptionPane.INFORMATION_MESSAGE);
            nopol.setText("");
            jenis_kendaraan.setSelectedIndex(-1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cetakActionPerformed

    private void selesai_dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesai_dendaActionPerformed
        if (nopol_tanpa_tiket.getText().isEmpty() || denda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.KendaraanKeluar(nopol_tanpa_tiket.getText(), Integer.valueOf(denda.getText()));
            JOptionPane.showMessageDialog(this, "Berhasil mencatat denda", "Parkir Keluar", JOptionPane.INFORMATION_MESSAGE);
            nopol_tanpa_tiket.setText("");
            denda.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_selesai_dendaActionPerformed

    private void selesai_normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesai_normalActionPerformed
        if (no.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.KendaraanKeluar(Integer.parseInt(no.getText()));
            JOptionPane.showMessageDialog(this, "Berhasil mencatat kendaraan", "Parkir Keluar", JOptionPane.INFORMATION_MESSAGE);
            no.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_selesai_normalActionPerformed

    private void nopol_tanpa_tiketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nopol_tanpa_tiketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER && !nopol_tanpa_tiket.getText().isEmpty()) {
            try {
                denda.setText(String.valueOf(data_adapter.GetDenda(nopol_tanpa_tiket.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_nopol_tanpa_tiketKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JTextField denda;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jenis_kendaraan;
    private javax.swing.JTextField no;
    private javax.swing.JTextField nopol;
    private javax.swing.JTextField nopol_tanpa_tiket;
    private javax.swing.JButton selesai_denda;
    private javax.swing.JButton selesai_normal;
    // End of variables declaration//GEN-END:variables
}