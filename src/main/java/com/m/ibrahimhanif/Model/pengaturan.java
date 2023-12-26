package com.m.ibrahimhanif.Model;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import org.json.JSONObject;

public class pengaturan {
    private final boolean PengaturanDimuat;
    private final String nama_penyedia;
    private final String alamat;
    private final String nama_gedung;
    private final String perhatian;
    private final basis_data database;
    
    public pengaturan() throws Exception{
        String isi = new String(Files.readAllBytes(Paths.get("pengaturan.json")));
        JSONObject file_pengaturan = new JSONObject(isi);

        nama_penyedia = file_pengaturan.getString("nama");
        alamat = file_pengaturan.getString("alamat");
        nama_gedung = file_pengaturan.getString("gedung");
        perhatian = file_pengaturan.getString("perhatian");

        database = new basis_data(file_pengaturan.getString("host"), file_pengaturan.getString("database"), file_pengaturan.getString("username"), file_pengaturan.getString("password"));
        database.Hubungkan();

        PengaturanDimuat = true;
    }
    
    public static void simpan(String inf_nama, String inf_alamat, String inf_gedung, String inf_perhatian, String db_host, String db_port, String db_name, String db_user, String db_pass) throws Exception{
        JSONObject setingan = new JSONObject();
        
        setingan.put("nama", inf_nama);
        setingan.put("alamat", inf_alamat);
        setingan.put("gedung", inf_gedung);
        setingan.put("perhatian", inf_perhatian);
        setingan.put("host", db_host);
        setingan.put("port", db_port);
        setingan.put("database", db_name);
        setingan.put("username", db_user);
        setingan.put("password", db_pass);
        
        FileWriter fileWriter = new FileWriter("pengaturan.json");
        fileWriter.write(setingan.toString(2));
        fileWriter.flush(); 
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
    
    public boolean MemilikiPengaturan(){
        return PengaturanDimuat;
    }
}