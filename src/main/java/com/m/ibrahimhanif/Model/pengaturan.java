package com.m.ibrahimhanif.Model;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class pengaturan {
    private boolean PengaturanDimuat;
    private String nama_penyedia, alamat, nama_gedung, perhatian;
    private basis_data database;
    private ArrayList<jenis_kendaraan> tipe = new ArrayList<>();
    
    public pengaturan(){
        PengaturanDimuat = false;
        try {
            String isi = new String(Files.readAllBytes(Paths.get("pengaturan.json")));
            JSONObject file_pengaturan = new JSONObject(isi);
            
            nama_penyedia = file_pengaturan.getString("nama");
            alamat = file_pengaturan.getString("alamat");
            nama_gedung = file_pengaturan.getString("gedung");
            perhatian = file_pengaturan.getString("perhatin");
            
            database = new basis_data(file_pengaturan.getString("host"), file_pengaturan.getString("database"), file_pengaturan.getString("username"), file_pengaturan.getString("password"));
            database.Hubungkan();
            
            JSONArray daftar_tipe = file_pengaturan.getJSONArray("tipe");
            for (int i = 0; i < daftar_tipe.length(); i++) {
                JSONObject objek_sementara = daftar_tipe.getJSONObject(i);
                jenis_kendaraan jenis_sementara = new jenis_kendaraan(objek_sementara.getString("jenis"), objek_sementara.getInt("biaya"));
                tipe.add(jenis_sementara);
            }
            
            PengaturanDimuat = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public String getNamaPenyedia(){
        return this.nama_penyedia;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getNamaGedung(){
        return this.nama_gedung;
    }
    
    public String getPerhatian(){
        return this.perhatian;
    }
    
    public Connection getKoneksiDatabase(){
        return database.Hubungan();
    }
    
    public jenis_kendaraan[] getTipe(){
        jenis_kendaraan[] array = new jenis_kendaraan[tipe.size()];
        tipe.toArray(array);
        return array;
    }
    
    public boolean MemilikiPengaturan(){
        return PengaturanDimuat;
    }
}