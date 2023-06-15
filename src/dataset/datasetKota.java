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
public class datasetKota {
    private ArrayList<Integer> id_kota;
    private ArrayList<Integer> id_provinsi;
    private ArrayList<String> nm_kota;
    private ArrayList<String> tarif;
    
    public datasetKota () {
        id_kota = new ArrayList<Integer>();
        id_provinsi = new ArrayList<Integer>();
        nm_kota = new ArrayList<String>();
        tarif = new ArrayList<String>();
    }
    
    public void insertid_kota (int isi){
        this.id_kota.add(isi);
    }
    public ArrayList<Integer> getRecordId_kota (){
        return this.id_kota;
    }
    
    public void insertid_provinsi (int isi){
        this.id_provinsi.add(isi);
    }
    public ArrayList<Integer> getRecordId_provinsi(){
        return this.id_provinsi;
    }
    
    public void insertnm_kota (String isi){
        this.nm_kota.add(isi);
    }
    public ArrayList<String> getRecordNm_kota (){
        return this.nm_kota;
    }
    
    public void inserttarif (String isi){
        this.tarif.add(isi);
    }
    public ArrayList<String> getRecordTarif (){
        return this.tarif;
    }
    
    public void insertCustomer (Integer id_kota, Integer id_provinsi, String nm_kota, String tarif){
        this.id_kota.add(id_kota);
        this.id_provinsi.add(id_provinsi);
        this.nm_kota.add(nm_kota);
        this.tarif.add(tarif);
        
    }

}
