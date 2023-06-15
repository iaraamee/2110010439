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

public class pengiriman {
    private int id_kirim;
    private  String no_resi;
    private int id_pesan;
    private Date tanggal_kirim;
    
    public pengiriman (int id_kirim, String no_resi, int id_pesan, Date tanggal_kirim){
        this.id_kirim = id_kirim;
        this.no_resi = no_resi;
        this.id_pesan = id_pesan;
        this.tanggal_kirim = tanggal_kirim;
    }
    
    public int getId_Kirim(){
        return id_kirim;   
    }
    public void setId_Kirim (int id_kirim){
        this.id_kirim = id_kirim;
    }
    
    public String getNo_Resi(){
        return no_resi;   
    }
    public void setNo_Resi (String no_resi){
        this.no_resi = no_resi;
    }  
    
    public int getId_Pesan(){
        return id_pesan;   
    }
    public void setId_Pesan (int id_pesan){
        this.id_pesan = id_pesan;
    }
    
    public Date getTanggal_Kirim(){
        return tanggal_kirim;   
    }
    public void setTanggal_Kirim (Date tanggal_kirim){
        this.tanggal_kirim = tanggal_kirim;
    }
}
