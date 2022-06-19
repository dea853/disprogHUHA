/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
  
//import java.security.Timestamp;

/**
 *
 * @author Windows 10 PRO
 */
public class reservasi {
    int kodeReservasi;
    //Timestamp tanggalPemesanan;
    int jumlahOrang;
    
    public reservasi(int kodeReservasi, int jumlahOrang) {
        this.kodeReservasi = kodeReservasi;
        this.jumlahOrang = jumlahOrang;
    }

    public int getKodeReservasi() {
        return kodeReservasi;
    }

    public void setKodeReservasi(int kodeReservasi) {
        this.kodeReservasi = kodeReservasi;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public void setJumlahOrang(int jumlahOrang) {
        this.jumlahOrang = jumlahOrang;
    }

    
}
