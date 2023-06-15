/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetCustomer {
    private ArrayList<Integer> id_customer;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<Integer> id_kota;
    private ArrayList<String> telp;
    private ArrayList<String> email;
    private ArrayList<String> password;
    
    public datasetCustomer () {
        id_customer = new ArrayList<Integer>(); 
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        id_kota = new ArrayList<Integer>();
        telp = new ArrayList<String>();
        email = new ArrayList<String>();
        password = new ArrayList<String>();
    }
    
    public void insertid_customer (int isi){
        this.id_customer.add(1);
    }
    public ArrayList<Integer> getRecordId_customer (){
        return this.id_customer;
    }
    
    public void insertnama (String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordNama (){
        return this.nama;
    }
    
    public void insertalamat (String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat (){
        return this.alamat;
    }
    
    public void insertid_kota (int isi){
        this.id_kota.add(isi);
    }
    public ArrayList<Integer> getRecordId_kota (){
        return this.id_kota;
    }
    
    public void inserttelp (String isi){
        this.telp.add(isi);
    }
    public ArrayList<String> getRecordTelp (){
        return this.telp;
    }
    
    public void insertemail (String isi){
        this.email.add(isi);
    }
    public ArrayList<String> getRecordEmail (){
        return this.email;
    }
    
    public void insertpassword (String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getRecordPassword (){
        return this.password;
    }
    
    public void insertCustomer (Integer id_customer, String nama, String alamat, Integer id_kota, String telp, String email, String password){
        this.id_customer.add(id_customer);
        this.nama.add(nama);
        this.alamat.add(alamat);
        this.id_kota.add(id_kota);
        this.telp.add(telp);
        this.email.add(email);
        this.password.add(password);
    
    }
}
