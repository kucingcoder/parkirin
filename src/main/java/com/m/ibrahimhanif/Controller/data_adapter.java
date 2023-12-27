package com.m.ibrahimhanif.Controller;
import com.m.ibrahimhanif.Model.basis_data;
import com.m.ibrahimhanif.Model.pengaturan;
import java.sql.ResultSet;

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
        rs = database.AmbilData("SELECT jenis, hari_pertama, per_jam FROM tarif WHERE id = " + id);
        return rs;
    }
    
    public static void AddTarif (String jenis, int awal, int perjam) throws Exception {
        database.SetData("INSERT INTO tarif (jenis,hari_pertama,per_jam) VALUES ('" + jenis + "',"+ awal + "," + perjam + ")");
    }
    
    public static void UpTarif (String jenis, int awal, int perjam, int id) throws Exception {
        database.SetData("UPDATE tarif SET jenis = '" + jenis + "', hari_pertama = " + awal + ", per_jam = " + perjam + " WHERE id = " + id);
    }
    
    public static void DelTarif (int id) throws Exception {
        database.SetData("DELETE FROM tarif WHERE id = " + id);
    }
}