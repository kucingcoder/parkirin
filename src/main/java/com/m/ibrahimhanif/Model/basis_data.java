package com.m.ibrahimhanif.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class basis_data {
    private String host, database, username, password;
    private Connection conn;
    
    public basis_data(){}
    
    public basis_data(String host_anda, String database_anda, String username_anda, String password_anda){
        host = host_anda;
        database = database_anda;
        username = username_anda;
        password = password_anda;
    }
    
    public void Hubungkan() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://" + host +"/" + database, username, password);
    }
    
    public void Hubungkan(Connection hubungan) throws Exception {
        conn = hubungan;
    }
    
    public ResultSet AmbilData (String query) throws Exception{
        Statement stmt;
        ResultSet rs;
        
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);
        
        return rs;
    }
    
    public void SetData (String Query) throws Exception {
        Statement stmt;
        stmt = conn.createStatement();
        stmt.executeUpdate(Query);
    }
    
    public boolean Terkonfigurasi(){
        try {
            return !(conn.isClosed());
        } catch (Exception e) {
            return false;
        }
    }
    
    public Connection Hubungan(){
        return conn;
    }
}