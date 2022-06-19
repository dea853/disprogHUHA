/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10 PRO
 */
public class mitraResto {
    int kodeResto;
    String namaPemilik;
    String namaResto;
    String username;
    String password;
    int jumlahMeja;
    
    Statement stat;
    ResultSet result;


    public mitraResto(int kodeResto, String namaPemilik, String namaResto, String username, String password, int jumlahMeja) {
        this.kodeResto = kodeResto;
        this.namaPemilik = namaPemilik;
        this.namaResto = namaResto;
        this.username = username;
        this.password = password;
        this.jumlahMeja = jumlahMeja;
    }

    public int getKodeResto() {
        return kodeResto;
    }

    public void setKodeResto(int kodeResto) {
        this.kodeResto = kodeResto;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNamaResto() {
        return namaResto;
    }

    public void setNamaResto(String namaResto) {
        this.namaResto = namaResto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public void insert(){
        try {
            stat = (Statement) myModel.conn.createStatement();
            
            if(!myModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement) myModel.conn.prepareStatement("INSERT INTO users (username, password) values(?,?)");
                sql.setString(1, username);
                sql.setString(2, password);
                sql.executeUpdate();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
