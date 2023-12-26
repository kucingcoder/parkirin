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
}