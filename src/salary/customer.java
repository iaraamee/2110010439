/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class customer {
    private int id_Customer;
    private String nama;
    private String alamat;
    private int id_Kota;
    private String telp;
    private String email;
    private String password;
    
    public customer (int id_customer, String nama, String alamat, int id_kota, String telp, String email, String password){
        this.id_Customer = id_customer;
        this.nama = nama;
        this.alamat = alamat;
        this.id_Kota = id_kota;
        this.telp = telp;
        this.email = email;
        this.password = password;
    }
    
    public int getId_Customer(){
        return id_Customer;   
    }
    public void setId_Customer (int id_customer){
        this.id_Customer = id_customer;
    }
    
    public String getNama(){
        return nama;   
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;   
    }
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    
    public int getId_Kota(){
        return id_Kota;   
    }
    public void setId_Kota (int id_kota){
        this.id_Kota = id_kota;
    }
    
    public String getTelp(){
    return telp;   
    }
    public void setTelp (String telp){
        this.telp = telp;
    }
    
    public String getEmail(){
    return email;   
    }
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getPassword(){
    return password;   
    }
    public void setPassword (String password){
        this.password = password;
    }
}
