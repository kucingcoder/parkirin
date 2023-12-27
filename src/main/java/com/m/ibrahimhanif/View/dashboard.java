package com.m.ibrahimhanif.View;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class dashboard extends javax.swing.JInternalFrame {

    public dashboard() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            menu.add(analisis);
            menu.add(kendaraan);
            menu.add(tarif);
            menu.add(pegawai);
            menu.add(pengaturan);
            menu.add(keluar);
            analisis.setSelected(true);
        } catch (PropertyVetoException e) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.ButtonGroup();
        navbar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        analisis = new javax.swing.JToggleButton();
        kendaraan = new javax.swing.JToggleButton();
        tarif = new javax.swing.JToggleButton();
        pegawai = new javax.swing.JToggleButton();
        pengaturan = new javax.swing.JToggleButton();
        keluar = new javax.swing.JToggleButton();
        kerja = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(254, 246, 235));
        setBorder(null);
        setMinimumSize(new java.awt.Dimension(880, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        navbar.setBackground(new java.awt.Color(253, 255, 252));

        jPanel2.setBackground(new java.awt.Color(253, 255, 252));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setBackground(new java.awt.Color(253, 255, 252));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 136, 5));
        jLabel2.setText("PARKIRIN");
        jPanel2.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1, 0, 15));

        analisis.setBackground(new java.awt.Color(253, 255, 252));
        analisis.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        analisis.setForeground(new java.awt.Color(241, 136, 5));
        analisis.setText("Analisis");
        analisis.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        analisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisisActionPerformed(evt);
            }
        });
        jPanel1.add(analisis);

        kendaraan.setBackground(new java.awt.Color(253, 255, 252));
        kendaraan.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        kendaraan.setForeground(new java.awt.Color(241, 136, 5));
        kendaraan.setText("Kelola Kendaraan");
        kendaraan.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(kendaraan);

        tarif.setBackground(new java.awt.Color(253, 255, 252));
        tarif.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        tarif.setForeground(new java.awt.Color(241, 136, 5));
        tarif.setText("Tetapkan Tarif");
        tarif.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        tarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarifActionPerformed(evt);
            }
        });
        jPanel1.add(tarif);

        pegawai.setBackground(new java.awt.Color(253, 255, 252));
        pegawai.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        pegawai.setForeground(new java.awt.Color(241, 136, 5));
        pegawai.setText("Manajemen Pegawai");
        pegawai.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(pegawai);

        pengaturan.setBackground(new java.awt.Color(253, 255, 252));
        pengaturan.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        pengaturan.setForeground(new java.awt.Color(241, 136, 5));
        pengaturan.setText("Pengaturan");
        pengaturan.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengaturanActionPerformed(evt);
            }
        });
        jPanel1.add(pengaturan);

        keluar.setBackground(new java.awt.Color(253, 255, 252));
        keluar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(241, 136, 5));
        keluar.setText("Keluar");
        keluar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar);

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        kerja.setBackground(new java.awt.Color(244, 244, 249));

        javax.swing.GroupLayout kerjaLayout = new javax.swing.GroupLayout(kerja);
        kerja.setLayout(kerjaLayout);
        kerjaLayout.setHorizontalGroup(
            kerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        kerjaLayout.setVerticalGroup(
            kerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kerja))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kerja)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        int reply = JOptionPane.showConfirmDialog(this, "Apakah anda yakin keluar dan login kembali", "Keluar Akun", JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION) {
            main.keluar();
            data_adapter.akun.uuid = "";
            data_adapter.akun.level = "";
            this.dispose();   
        }
    }//GEN-LAST:event_keluarActionPerformed

    private void kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kendaraanActionPerformed

    private void analisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analisisActionPerformed

    private void tarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarifActionPerformed

    private void pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pegawaiActionPerformed

    private void pengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengaturanActionPerformed
        pengaturan seting = new pengaturan();
        kerja.removeAll();
        kerja.add(seting);
        seting.setVisible(true);
    }//GEN-LAST:event_pengaturanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton analisis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton keluar;
    private javax.swing.JToggleButton kendaraan;
    private javax.swing.JDesktopPane kerja;
    private javax.swing.ButtonGroup menu;
    private javax.swing.JPanel navbar;
    private javax.swing.JToggleButton pegawai;
    private javax.swing.JToggleButton pengaturan;
    private javax.swing.JToggleButton tarif;
    // End of variables declaration//GEN-END:variables
}