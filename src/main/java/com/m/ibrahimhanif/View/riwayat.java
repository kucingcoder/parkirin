package com.m.ibrahimhanif.View;
import com.formdev.flatlaf.FlatClientProperties;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class riwayat extends javax.swing.JInternalFrame {
    public riwayat() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            
            cari.putClientProperty( "JButton.buttonType", "roundRect" );
            no.putClientProperty( FlatClientProperties.STYLE, "showClearButton: true" );
            
            histori.getTableHeader().setFont(new Font("Poppins Medium", Font.PLAIN, 14));
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            
            histori.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            histori.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            histori.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            histori.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            histori.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            histori.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            histori.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
            
            refresh();
            
            no.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                @Override
                public void insertUpdate(javax.swing.event.DocumentEvent e) {
                    handleTextChange();
                }

                @Override
                public void removeUpdate(javax.swing.event.DocumentEvent e) {
                    // Metode ini dipanggil ketika teks dihapus
                    handleTextChange();
                }

                @Override
                public void changedUpdate(javax.swing.event.DocumentEvent e) {
                    // Metode ini dipanggil ketika ada perubahan format teks
                    handleTextChange();
                }
            });
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
        histori = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        cari = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 244, 249));
        setBorder(null);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(605, 550));
        setPreferredSize(new java.awt.Dimension(625, 550));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Riwayat");

        histori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Karcis", "Plat Nomor", "Jenis", "Masuk", "Keluar", "Status", "Biaya", "Pegawai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        histori.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        histori.setShowGrid(true);
        jScrollPane1.setViewportView(histori);

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setText("Cari Motor dengan Plat Nomor");

        no.setBackground(new java.awt.Color(253, 255, 252));
        no.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        cari.setBackground(new java.awt.Color(241, 136, 5));
        cari.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        cari.setForeground(new java.awt.Color(253, 255, 252));
        cari.setText("Cari");
        cari.setMargin(new java.awt.Insets(3, 14, 3, 14));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cari))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addGap(22, 22, 22))
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

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        if (no.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plat nomor kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            ResultSet data = data_adapter.GetCariRiwayat(no.getText());
            DefaultTableModel model = (DefaultTableModel) histori.getModel();
            model.setNumRows(0);

            while (data.next()) {
                model.addRow(new Object[]{data.getInt("no"), data.getString("nopol"), data.getString("jenis"), data.getString("masuk"), data.getString("keluar"), data.getString("status"), data.getString("total_biaya"), data.getString("pegawai")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_cariActionPerformed

    private void handleTextChange() {
        try {
            String newText = no.getText();
            if (newText.isEmpty()) { refresh(); }
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }
    
    private void refresh() throws Exception {
        ResultSet data = data_adapter.GetRiwayat();
        DefaultTableModel model = (DefaultTableModel) histori.getModel();
        model.setNumRows(0);
        
        while (data.next()) {
            model.addRow(new Object[]{data.getInt("no"), data.getString("nopol"), data.getString("jenis"), data.getString("masuk"), data.getString("keluar"), data.getString("status"), data.getString("total_biaya"), data.getString("pegawai")});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JButton deteksi;
    private javax.swing.JButton deteksi1;
    private javax.swing.JTable histori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField no;
    // End of variables declaration//GEN-END:variables
}