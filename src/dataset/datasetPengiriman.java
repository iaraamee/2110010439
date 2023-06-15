/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class datasetPengiriman {
    private ArrayList<Integer> id_kirim;
    private ArrayList<String> no_resi;
    private ArrayList<Integer> id_pesan;
    private ArrayList<String> tanggal_kirim;
    
    public datasetPengiriman () {
        id_kirim = new ArrayList<String>();
        no_resi = new ArrayList<String>();
        id_pesan = new ArrayList<String>();
        tanggal_kirim = new ArrayList<String>();
    }
    
    public void insertid_kirim (int isi){
        this.id_kirim.add(isi);
    }
    public ArrayList<Integer> getRecordId_kirim (){
        return this.id_kirim;
    }
    
    public void insertno_resi (String isi){
        this.no_resi.add(isi);
    }
    public ArrayList<String> getRecordNo_resi(){
        return this.no_resi;
    }
    
    public void insertid_pesan (int isi){
        this.id_pesan.add(isi);
    }
    public ArrayList<Integer> getRecordId_pesan(){
        return this.id_pesan;
    }
    
    public void inserttanggal_kirim (String isi){
        this.tanggal_kirim.add(isi);
    }
    public ArrayList<String> getRecordTanggal_kirim (){
        return this.tanggal_kirim;
    }
    
    public void insertCustomer (Integer id_kirim, String no_resi, Integer id_pesan, Date tanggal_kirim){ 
        this.id_kirim.add(id_kirim);
        this.no_resi.add(no_resi);
        this.id_pesan.add(id_pesan);
        this.tanggal_kirim.add(tanggal_kirim);  
    }
}
