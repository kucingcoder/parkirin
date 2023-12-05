package com.m.ibrahimhanif.Controller;
import com.m.ibrahimhanif.Model.basis_data;
import com.m.ibrahimhanif.Model.pengaturan;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class data_adapter {
    public static pengaturan settingan;
    public static basis_data database;
    
    public static void MuatPengaturan() throws Exception{
        settingan = new pengaturan();
        database.Hubungkan(settingan.getKoneksiDatabase());
    }
    
    public static void PerbaharuiDataTabel(String tabel, String manipulasi, String kriteria) throws Exception{
        database.SetData("UPDATE " + tabel + " " + manipulasi + " WHERE " + kriteria);
    }
    
    public static DefaultTableModel AmbilDataTabel(String tabel, String data, String kriteria) throws Exception{
        ResultSet hasil = database.AmbilData("SELECT " + data + " FROM " + tabel + " WHERE " + kriteria);
        DefaultTableModel model = new DefaultTableModel(); 
        
        for (int i = 1; i <= hasil.getMetaData().getColumnCount(); i++) { model.addColumn(hasil.getMetaData().getColumnName(i)); }
            
        while (hasil.next()) {
            Object[] rowData = new Object[hasil.getMetaData().getColumnCount()];
            for (int i = 1; i <= hasil.getMetaData().getColumnCount(); i++) { rowData[i - 1] = hasil.getObject(i); }
            model.addRow(rowData);
        }
        
        return model;
    }
}