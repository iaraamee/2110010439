/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
import java.util.Date;

public class pembayaran {
    private int id_bayar;
    private  Date tanggal;
    private int id_pesan;
    private String jumlah;
    private int id_bank;
    private String bukti;
    
    public pembayaran (int id_bayar, Date tanggal, int id_pesan, String jumlah, int id_bank, String bukti){
        this.id_bayar = id_bayar;
        this.tanggal = tanggal;
        this.id_pesan = id_pesan;
        this.jumlah = jumlah;
        this.id_bank = id_bank;
        this.bukti = bukti;
    }
    
    public int getId_Bayar(){
        return id_bayar;   
    }
    public void setId_Bayar (int id_bayar){
        this.id_bayar = id_bayar;
    }
    
    public Date getTanggal(){
        return tanggal;   
    }
    public void setTanggal (Date tanggal){
        this.tanggal = tanggal;
    }
    
    public int getId_Pesan(){
        return id_pesan;   
    }
    public void setId_Pesan (int id_pesan){
        this.id_pesan = id_pesan;
    }
    
    public String getJumlah(){
        return jumlah;   
    }
    public void setJumlah (String jumlah){
        this.jumlah = jumlah;
    }
    
    public int getId_Bank(){
        return id_bank;   
    }
    public void setId_Bank (int id_bank){
        this.id_bank = id_bank;
    }
    
    public String getBukti(){
        return bukti;   
    }
    public void setId_Bayar (String bukti){
        this.bukti = bukti;
    }
}
