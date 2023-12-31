package com.m.ibrahimhanif.Controller;
import com.m.ibrahimhanif.Model.basis_data;
import com.m.ibrahimhanif.Model.pengaturan;
import java.sql.ResultSet;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_adapter {
    public static pengaturan settingan;
    public static basis_data database = new basis_data();
    
    public class akun { public static String uuid, level; }
    
    public static void MuatPengaturan() throws Exception{
        settingan = new pengaturan();
        database.Hubungkan(settingan.getKoneksiDatabase());
    }
    
    public static boolean Masuk(String id, String sandi) {
        try {
            ResultSet rs;
            rs = database.AmbilData("SELECT uuid, level FROM pegawai WHERE id = '" + id + "' and sandi = MD5('" + sandi + "')");
            if (rs.next()) {
                akun.uuid = rs.getString("uuid");
                akun.level = rs.getString("level");
                return true;
            } else { return false; }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static ResultSet GetInfo () throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT nama, gender, telp, alamat FROM pegawai WHERE uuid = '" + akun.uuid + "'");
        
        if (rs.next()) { return rs; }
        else { return null; }
    }
    
    public static void SetInfo (String nama, String j_kelamin, String no_telp, String alamat) throws Exception {
        database.SetData("UPDATE pegawai SET nama = '" + nama + "', gender = '" + j_kelamin + "', telp = '" + no_telp + "', alamat = '" + alamat + "' WHERE uuid = '" + akun.uuid + "'");
    }
    
    public static void SetAuth (String id, String sandi) throws Exception {
        database.SetData("UPDATE pegawai SET id = '" + id + "', sandi = MD5('" + sandi + "') WHERE uuid = '" + akun.uuid + "'");
    }
    
    public static ResultSet GetAkun () throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT uuid, nama from pegawai");
        return rs;
    }
    
    public static ResultSet GetAkun (String uuid) throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT level ,nama, gender, telp, alamat FROM pegawai WHERE uuid = '" + uuid + "'");
        return rs;
    }
    
    public static void AddAkun (String id, String sandi, String nama, String j_kelamin, String no_telp, String alamat, String level) throws Exception {
        database.SetData("INSERT INTO pegawai (uuid,id,sandi,nama,gender,telp,alamat,level) VALUES (MD5(NOW()),'" + id + "',MD5('" + sandi + "'),'" + nama + "','" + j_kelamin + "','" + no_telp + "','" + alamat + "','" + level + "')");
    }
    
    public static void UpAkun (String id, String sandi, String nama, String j_kelamin, String no_telp, String alamat, String level, String uuid) throws Exception {
        database.SetData("UPDATE pegawai SET id = '" + id + "', sandi = MD5('" + sandi + "'), nama = '" + nama + "', gender = '" + j_kelamin + "', telp = '" + no_telp + "', alamat = '" + alamat + "' WHERE uuid = '" + uuid + "'");
    }
    
    public static void DelAkun (String uuid) throws Exception {
        database.SetData("DELETE FROM pegawai WHERE uuid = '" + uuid + "'");
    }
    
    public static ResultSet GetTarif () throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT id, jenis from tarif");
        return rs;
    }
    
    public static ResultSet GetTarif (int id) throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT jenis, waktu_normal, biaya_normal, biaya_perjam FROM tarif WHERE id = " + id);
        return rs;
    }
    
    public static void AddTarif (String jenis, int waktu, int normal, int perjam) throws Exception {
        database.SetData("INSERT INTO tarif (jenis, waktu_normal, biaya_normal, biaya_perjam) VALUES ('" + jenis + "'," + waktu + "," + normal + "," + perjam + ")");
    }
    
    public static void UpTarif (String jenis, int waktu, int normal, int perjam, int id) throws Exception {
        database.SetData("UPDATE tarif SET jenis = '" + jenis + "', waktu_normal = " + waktu + ", biaya_normal = " + normal + ", biaya_perjam = " + perjam + " WHERE id = " + id);
    }
    
    public static void DelTarif (int id) throws Exception {
        database.SetData("DELETE FROM tarif WHERE id = " + id);
    }
    
    public static int GetDenda (String nopol) throws Exception {
        ResultSet tarif, waktu;
        int awal = 0, perjam = 0;
        long biaya;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime waktu_masuk = null, waktu_keluar = null;
        Duration selisihWaktu;
        
        tarif = database.AmbilData("SELECT hari_pertama, per_jam FROM tarif WHERE jenis = (select jenis FROM pemarkiran WHERE nopol = '" + nopol + "' AND status IS NULL)");
        
        if (tarif.next()) {
            awal = tarif.getInt("hari_pertama");
            perjam = tarif.getInt("per_jam");
        } else {
            return 0;
        }
        
        waktu = database.AmbilData("SELECT masuk FROM pemarkiran WHERE nopol = '" + nopol + "' AND status IS NULL");
        
        if (waktu.next()) {
            waktu_masuk = LocalDateTime.parse(waktu.getString("masuk"), formatter);
            waktu_keluar = LocalDateTime.now();
        }
        
        selisihWaktu = Duration.between(waktu_masuk, waktu_keluar);
        
        if (selisihWaktu.toHours() <= 24) { biaya = awal; }
        else { biaya = awal + ((selisihWaktu.toHours() - 24) * perjam); }
        
        return (int) biaya * 2;
    }
    
    public static void KendaraanMasuk (String nopol, int id) throws Exception {
        database.SetData("INSERT INTO pemarkiran (nopol, jenis, masuk, pegawai) VALUES ('" + nopol + "', (SELECT jenis FROM tarif WHERE id = '" + id + "'), NOW(), (SELECT nama FROM pegawai WHERE uuid = '" + akun.uuid + "'))");
    }
    
    public static void KendaraanKeluar (int id) throws Exception {
        ResultSet tarif, waktu;
        int awal = 0, perjam = 0;
        long biaya;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime waktu_masuk = null, waktu_keluar = null;
        Duration selisihWaktu;
        
        tarif = database.AmbilData("SELECT hari_pertama, per_jam FROM tarif WHERE jenis = (select jenis FROM pemarkiran WHERE no = " + id + " AND status IS NULL)");
        
        if (tarif.next()) {
            awal = tarif.getInt("hari_pertama");
            perjam = tarif.getInt("per_jam");
        } else {
            return;
        }
        
        waktu = database.AmbilData("SELECT masuk FROM pemarkiran WHERE no = " + id);
        
        if (waktu.next()) {
            waktu_masuk = LocalDateTime.parse(waktu.getString("masuk"), formatter);
            waktu_keluar = LocalDateTime.now();
        }
        
        selisihWaktu = Duration.between(waktu_masuk, waktu_keluar);
        
        if (selisihWaktu.toHours() <= 24) { biaya = awal; }
        else { biaya = awal + ((selisihWaktu.toHours() - 24) * perjam); }
        
        database.SetData("UPDATE pemarkiran SET keluar= '" + waktu_keluar.format(formatter) + "',status='Normal', biaya= " + biaya + ", pegawai = (SELECT nama FROM pegawai WHERE uuid = '" + akun.uuid + "') WHERE no = " + id);
    }
    
    public static void KendaraanKeluar (String nopol, Integer biaya) throws Exception {
        database.SetData("UPDATE pemarkiran SET keluar= NOW(), status='Bayar Denda', biaya= " + biaya + ", pegawai = (SELECT nama FROM pegawai WHERE uuid = '" + akun.uuid + "') WHERE nopol = '" + nopol + "' AND status IS NULL");
    }
}