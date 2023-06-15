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
public class pesan {
    private int id_pesan;
    private int id_Customer;
    private Date tanggal;
    private String total;
    private String tarif;
    private String alamat;
    private String no_telp;
    private int id_kota;
    private int item;
    private int id_bayar;
    private String no_resi;
    
    public pesan (int id_pesan, int id_customer, Date tanggal, String total, String tarif, String alamat, String no_telp, int id_kota, int item, int id_bayar, String no_resi){
        this.id_pesan = id_pesan;
        this.id_Customer = id_customer;
        this.tanggal = tanggal;
        this.total = total;
        this.tarif = tarif;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.id_kota = id_kota;
        this.item = item;
        this.id_bayar = id_bayar;
        this.no_resi = no_resi;
    }
    
    public int getId_Pesan(){
        return id_pesan;   
    }
    public void setId_Pesan (int id_pesan){
        this.id_pesan = id_pesan;
    }
    
     public int getId_Customer(){
        return id_Customer;   
    }
    public void setId_Customer (int id_customer){
        this.id_Customer = id_customer;
    }
    
    public Date getTanggal(){
        return tanggal;   
    }
    public void setTanggal (Date tanggal){
        this.tanggal = tanggal;
    }
    
    public String getTotal(){
        return total;   
    }
    public void setTotal (String total){
        this.total = total;
    }
    
    public String getTarif(){
        return tarif;   
    }
    public void setTarif (String tarif){
        this.tarif = tarif;
    }
    
    public String getAlamat(){
        return alamat;   
    }
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    
    public String getNo_Telp(){
    return no_telp;   
    }
    public void setTelp (String no_telp){
        this.no_telp = no_telp;
    }
    
    public int getId_Kota(){
        return id_kota;   
    }
    public void setId_Kota (int id_kota){
        this.id_kota = id_kota;
    }
    
    public int getItem(){
        return item;   
    }
    public void setItem (int item){
        this.item = item;
    }
    
    public int getId_Bayar(){
        return id_bayar;   
    }
    public void setId_Bayar (int id_bayar){
        this.id_bayar = id_bayar;
    }
    
    public String getNo_Resi(){
        return no_resi;   
    }
    public void setNo_Resi (String no_resi){
        this.no_resi = no_resi;
    }
}
