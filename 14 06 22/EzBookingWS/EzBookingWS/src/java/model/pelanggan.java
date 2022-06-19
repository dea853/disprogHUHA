/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Windows 10 PRO
 */
public class pelanggan {
    int kodePelanggan;
    String namaPengguna;
    String username;
    String password;
    
    public pelanggan(int kodePelanggan, String namaPengguna, String username, String password) {
        this.kodePelanggan = kodePelanggan;
        this.namaPengguna = namaPengguna;
        this.username = username;
        this.password = password;
    }

    public int getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(int kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
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


}
