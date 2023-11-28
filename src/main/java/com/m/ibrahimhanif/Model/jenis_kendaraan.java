package com.m.ibrahimhanif.Model;

public class jenis_kendaraan {
    private final String nama;
    private final int harga;
    
    public jenis_kendaraan(String jenis, int biaya){
        nama = jenis;
        harga = biaya;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHarga() {
        return this.harga;
    }
}
