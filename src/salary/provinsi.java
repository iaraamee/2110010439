/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class provinsi {
    private int id_provinsi;
    private String nm_provinsi;
    
    public provinsi (int id_provinsi, String nm_provinsi){
        this.id_provinsi = id_provinsi;
        this.nm_provinsi = nm_provinsi;
    }
    
    public int getId_Provinsi(){
        return id_provinsi;   
    }
    public void setId_Provinsi (int id_provinsi){
        this.id_provinsi = id_provinsi;
    }
    
    public String getNm_Provinsi(){
        return nm_provinsi;   
    }
    public void setNm_Provinsi (String nm_provinsi){
        this.nm_provinsi = nm_provinsi;
    }
    
}
