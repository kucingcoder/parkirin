package com.m.ibrahimhanif.Controller;
import com.m.ibrahimhanif.Model.basis_data;
import com.m.ibrahimhanif.Model.pengaturan;
import java.sql.ResultSet;
import java.sql.Timestamp;
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
    
    public static boolean Masuk (String id, String sandi) {
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
    
    public static int GetBiaya (int karcis) throws Exception {
        ResultSet tarif, waktu;
        int normal = 0, awal = 0, perjam = 0;
        long biaya;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime waktu_masuk = null, waktu_keluar = null;
        Duration selisihWaktu;
        
        tarif = database.AmbilData("SELECT waktu_normal, biaya_normal, biaya_perjam FROM tarif WHERE jenis = (select jenis FROM pemarkiran WHERE no = '" + karcis + "' AND status IS NULL)");
        
        if (tarif.next()) {
            normal = tarif.getInt("waktu_normal");
            awal = tarif.getInt("biaya_normal");
            perjam = tarif.getInt("biaya_perjam");
        } else {
            return 0;
        }
        
        waktu = database.AmbilData("SELECT masuk FROM pemarkiran WHERE no = '" + karcis + "' AND status IS NULL");
        
        if (waktu.next()) {
            waktu_masuk = LocalDateTime.parse(waktu.getString("masuk"), formatter);
            waktu_keluar = LocalDateTime.now();
        }
        
        selisihWaktu = Duration.between(waktu_masuk, waktu_keluar);
        
        if (selisihWaktu.toHours() <= normal) { biaya = awal; }
        else { biaya = awal + ((selisihWaktu.toHours() - normal) * perjam); }
        
        return (int) biaya;
    }
    
    public static int GetDenda (String nopol) throws Exception {
        ResultSet tarif, waktu;
        int normal = 0, awal = 0, perjam = 0;
        long biaya;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime waktu_masuk = null, waktu_keluar = null;
        Duration selisihWaktu;
        
        tarif = database.AmbilData("SELECT waktu_normal, biaya_normal, biaya_perjam FROM tarif WHERE jenis = (select jenis FROM pemarkiran WHERE nopol = '" + nopol + "' AND status IS NULL)");
        
        if (tarif.next()) {
            normal = tarif.getInt("waktu_normal");
            awal = tarif.getInt("biaya_normal");
            perjam = tarif.getInt("biaya_perjam");
        } else {
            return 0;
        }
        
        waktu = database.AmbilData("SELECT masuk FROM pemarkiran WHERE nopol = '" + nopol + "' AND status IS NULL");
        
        if (waktu.next()) {
            waktu_masuk = LocalDateTime.parse(waktu.getString("masuk"), formatter);
            waktu_keluar = LocalDateTime.now();
        }
        
        selisihWaktu = Duration.between(waktu_masuk, waktu_keluar);
        
        if (selisihWaktu.toHours() <= normal) { biaya = awal; }
        else { biaya = awal + ((selisihWaktu.toHours() - normal) * perjam); }
        
        return (int) biaya * 2;
    }
    
    public static ResultSet GetKendaraanMasuk () throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT DATE_FORMAT(masuk, '%d-%m-%Y') AS 'tanggal', TIME_FORMAT(masuk, '%H:%i') AS 'waktu', no, nopol, jenis, pegawai FROM pemarkiran ORDER BY no DESC LIMIT 20");
        return rs;
    }
    
    public static ResultSet GetKendaraanKeluar () throws Exception {
        ResultSet rs;
        rs = database.AmbilData("SELECT DATE_FORMAT(keluar, '%d-%m-%Y') AS 'tanggal', TIME_FORMAT(keluar, '%H:%i') AS 'waktu', no, nopol, jenis, status, total_biaya, pegawai FROM pemarkiran WHERE status IS NOT NULL ORDER BY no DESC LIMIT 20");
        return rs;
    }
    
    public static void KendaraanMasuk (String nopol, int id) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        database.SetData("INSERT INTO pemarkiran (nopol, jenis, masuk, pegawai) VALUES ('" + nopol + "', (SELECT jenis FROM tarif WHERE id = '" + id + "'), '" + timestamp + "', (SELECT nama FROM pegawai WHERE uuid = '" + akun.uuid + "'))");
    }
    
    public static void KendaraanKeluar (int id, Integer biaya) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        database.SetData("UPDATE pemarkiran SET keluar = '" + timestamp + "', status = 'Normal', total_biaya = " + biaya + ", pegawai = (SELECT nama FROM pegawai WHERE uuid = '" + akun.uuid + "') WHERE no = '" + id + "' AND status IS NULL");
    }
    
    public static void KendaraanKeluar (String nopol, Integer biaya) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        database.SetData("UPDATE pemarkiran SET keluar = '" + timestamp + "', status = 'Bayar Denda', total_biaya = " + biaya + ", pegawai = (SELECT nama FROM pegawai WHERE uuid = '" + akun.uuid + "') WHERE nopol = '" + nopol + "' AND status IS NULL");
    }
}