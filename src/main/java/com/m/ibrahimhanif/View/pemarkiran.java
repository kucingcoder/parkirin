package com.m.ibrahimhanif.View;
import com.github.sarxos.webcam.Webcam;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class pemarkiran extends javax.swing.JInternalFrame {
    ArrayList<Integer> daftar_id;
    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    
    public pemarkiran() {
        initComponents();
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            
            cetak.putClientProperty( "JButton.buttonType", "roundRect" );
            deteksi.putClientProperty( "JButton.buttonType", "roundRect" );
            selesai_normal.putClientProperty( "JButton.buttonType", "roundRect" );
            selesai_denda.putClientProperty( "JButton.buttonType", "roundRect" );
            
            ukuran_printer.add(a);
            ukuran_printer.add(b);
            ukuran_printer.add(c);
            ukuran_printer.add(d);
            
            for (Webcam webcam : Webcam.getWebcams()) { kamera.addItem(webcam.getName()); }
            
            PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
            
            for (PrintService printService : printServices) {
                printer.addItem(printService.getName());
            }
            
            kamera.setSelectedIndex(-1);
            printer.setSelectedIndex(-1);
            
            ResultSet jenis = data_adapter.GetTarif();
            daftar_id = new ArrayList<>();
            
            while (jenis.next()) {
                jenis_kendaraan.addItem(jenis.getString("jenis"));
                daftar_id.add(jenis.getInt("id"));
            }
            
            jenis_kendaraan.setSelectedIndex(-1);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            
            riwayat_masuk.getTableHeader().setFont(new Font("Poppins Medium", Font.PLAIN, 14));
            riwayat_keluar.getTableHeader().setFont(new Font("Poppins Medium", Font.PLAIN, 14));
            
            riwayat_masuk.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            riwayat_masuk.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            riwayat_masuk.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            riwayat_masuk.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            riwayat_masuk.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            riwayat_masuk.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            
            riwayat_keluar.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
            riwayat_keluar.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
            
            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ukuran_printer = new javax.swing.ButtonGroup();
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
        deteksi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        riwayat_masuk = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        d = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        printer = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        kamera = new javax.swing.JComboBox<>();
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
        jLabel14 = new javax.swing.JLabel();
        biaya = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        riwayat_keluar = new javax.swing.JTable();

        setBackground(new java.awt.Color(253, 255, 252));
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

        jPanel4.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel4.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setText("Plat Nomor");

        nopol.setBackground(new java.awt.Color(253, 255, 252));
        nopol.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N

        jenis_kendaraan.setBackground(new java.awt.Color(253, 255, 252));
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

        deteksi.setBackground(new java.awt.Color(241, 136, 5));
        deteksi.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        deteksi.setForeground(new java.awt.Color(253, 255, 252));
        deteksi.setText("Deteksi");
        deteksi.setMargin(new java.awt.Insets(3, 14, 3, 14));
        deteksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deteksiActionPerformed(evt);
            }
        });

        riwayat_masuk.setBackground(new java.awt.Color(253, 255, 252));
        riwayat_masuk.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        riwayat_masuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Waktu", "No Karcis", "Nomor Polisi", "Jenis", "Pegawai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        riwayat_masuk.setShowGrid(true);
        jScrollPane1.setViewportView(riwayat_masuk);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel10.setText("Riwayat Kendaraan Masuk");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel11.setText("Ukuran");

        a.setBackground(new java.awt.Color(253, 255, 252));
        a.setText("57");

        b.setBackground(new java.awt.Color(253, 255, 252));
        b.setText("58");

        c.setBackground(new java.awt.Color(253, 255, 252));
        c.setText("75");

        d.setBackground(new java.awt.Color(253, 255, 252));
        d.setText("80");

        jLabel12.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel12.setText("Printer");

        printer.setBackground(new java.awt.Color(253, 255, 252));
        printer.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        printer.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel13.setText("Kamera");

        kamera.setBackground(new java.awt.Color(253, 255, 252));
        kamera.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        kamera.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(kamera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(deteksi))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(a)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(b)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(c)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(d))
                                                    .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jenis_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cetak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(kamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deteksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenis_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(a)
                            .addComponent(b)
                            .addComponent(c)
                            .addComponent(d))
                        .addGap(18, 18, 18)
                        .addComponent(cetak)))
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
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

        nopol_tanpa_tiket.setBackground(new java.awt.Color(253, 255, 252));
        nopol_tanpa_tiket.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        nopol_tanpa_tiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nopol_tanpa_tiketKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel9.setText("Denda");

        denda.setEditable(false);
        denda.setBackground(new java.awt.Color(253, 255, 252));
        denda.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        denda.setEnabled(false);
        denda.setFocusable(false);
        denda.setRequestFocusEnabled(false);

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

        no.setBackground(new java.awt.Color(253, 255, 252));
        no.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel14.setText("Biaya");

        biaya.setEditable(false);
        biaya.setBackground(new java.awt.Color(253, 255, 252));
        biaya.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        biaya.setEnabled(false);
        biaya.setFocusable(false);
        biaya.setRequestFocusEnabled(false);

        jLabel15.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel15.setText("Riwayat Kendaraan keluar");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        riwayat_keluar.setBackground(new java.awt.Color(253, 255, 252));
        riwayat_keluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Waktu", "No Karcis", "Nomor Polisi", "Jenis", "Status", "Total Biaya", "Pegawai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        riwayat_keluar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        riwayat_keluar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(riwayat_keluar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(selesai_normal)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel14))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(biaya))))
                            .addComponent(jLabel5))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addComponent(nopol_tanpa_tiket))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(26, 26, 26)
                                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(selesai_denda, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                        .addComponent(selesai_denda))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(selesai_normal)))
                .addGap(48, 48, 48)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(22, 22, 22))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        if (nopol.getText().isEmpty() || jenis_kendaraan.getSelectedIndex() < 0 || printer.getSelectedIndex() < 0 || ukuran_printer.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Masih ada data yang kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            data_adapter.KendaraanMasuk(nopol.getText(), daftar_id.get(jenis_kendaraan.getSelectedIndex()));    
            JOptionPane.showMessageDialog(this, "Berhasil mencatat kendaraan", "Parkir Masuk", JOptionPane.INFORMATION_MESSAGE);
            nopol.setText("");
            jenis_kendaraan.setSelectedIndex(-1);
            refresh();
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
            refresh();
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
            data_adapter.KendaraanKeluar(Integer.parseInt(no.getText()), Integer.valueOf(biaya.getText()));
            JOptionPane.showMessageDialog(this, "Berhasil mencatat kendaraan", "Parkir Keluar", JOptionPane.INFORMATION_MESSAGE);
            no.setText("");
            biaya.setText("");
            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_selesai_normalActionPerformed

    private void nopol_tanpa_tiketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nopol_tanpa_tiketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER && !nopol_tanpa_tiket.getText().isEmpty()) {
            try {
                denda.setText(formatRupiah.format(data_adapter.GetDenda(nopol_tanpa_tiket.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_nopol_tanpa_tiketKeyPressed

    private void deteksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deteksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deteksiActionPerformed

    private void noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER && !no.getText().isEmpty()) {
            try {
                biaya.setText(formatRupiah.format(data_adapter.GetBiaya(Integer.parseInt(no.getText()))));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_noKeyPressed

    private void refresh() throws Exception{
        ResultSet masukin = data_adapter.GetKendaraanMasuk();
        DefaultTableModel model = (DefaultTableModel) riwayat_masuk.getModel();
        model.setNumRows(0);
        
        while (masukin.next()) {
            model.addRow(new Object[]{masukin.getString("tanggal"), masukin.getString("waktu"), masukin.getInt("no"), masukin.getString("nopol"), masukin.getString("jenis"), masukin.getString("pegawai")});
        }
        
        ResultSet keluarin = data_adapter.GetKendaraanKeluar();
        DefaultTableModel modelbaru = (DefaultTableModel) riwayat_keluar.getModel();
        modelbaru.setNumRows(0);
        
        while (keluarin.next()) {
            modelbaru.addRow(new Object[]{keluarin.getString("tanggal"), keluarin.getString("waktu"), keluarin.getInt("no"), keluarin.getString("nopol"), keluarin.getString("jenis"), keluarin.getString("status"), formatRupiah.format(keluarin.getInt("total_biaya")), keluarin.getString("pegawai")});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.JTextField biaya;
    private javax.swing.JRadioButton c;
    private javax.swing.JButton cetak;
    private javax.swing.JRadioButton d;
    private javax.swing.JTextField denda;
    private javax.swing.JButton deteksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jenis_kendaraan;
    private javax.swing.JComboBox<String> kamera;
    private javax.swing.JTextField no;
    private javax.swing.JTextField nopol;
    private javax.swing.JTextField nopol_tanpa_tiket;
    private javax.swing.JComboBox<String> printer;
    private javax.swing.JTable riwayat_keluar;
    private javax.swing.JTable riwayat_masuk;
    private javax.swing.JButton selesai_denda;
    private javax.swing.JButton selesai_normal;
    private javax.swing.ButtonGroup ukuran_printer;
    // End of variables declaration//GEN-END:variables
}