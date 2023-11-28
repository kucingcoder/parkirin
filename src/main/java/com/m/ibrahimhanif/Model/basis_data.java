package com.m.ibrahimhanif.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class basis_data {
    private final String host, database, username, password;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    
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
        try {
            rs.close();
            stmt.close();
        } catch (SQLException e) {}
        
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);
        
        return rs;
    }
    
    public void SetData (String Query) throws Exception {
        try {
            rs.close();
            stmt.close();
        } catch (SQLException e) {}
        
        stmt = conn.createStatement();
        stmt.executeUpdate(Query);
    }
    
    public boolean Terkonfigurasi(){
        return !(host.isEmpty() || database.isEmpty() || username.isEmpty() || password.isEmpty());
    }
    
    public Connection Hubungan(){
        return conn;
    }
}
