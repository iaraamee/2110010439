/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class kota {
    private int id_kota;
    private int id_provinsi;
    private String nm_kota;
    private String tarif;
    
    public kota (int id_kota, int id_provinsi, String nm_kota, String tarif){
        this.id_kota = id_kota;
        this.id_provinsi = id_provinsi;
        this.nm_kota = nm_kota;
        this.tarif = tarif;
    }
    
    public int getId_Kota(){
        return id_kota;   
    }
    public void setId_Kota (int id_kota){
        this.id_kota = id_kota;
    }
    
    public int getId_Provinsi(){
        return id_provinsi;   
    }
    public void setId_Provinsi (int id_provinsi){
        this.id_provinsi = id_provinsi;
    }
    
    public String getNm_Kota(){
        return nm_kota;   
    }
    public void setNm_Kota (String nm_kota){
        this.nm_kota = nm_kota;
    }
    
    public String getTarif(){
        return tarif;   
    }
    public void setTarif (String tarif){
        this.tarif = tarif;
    }

}
