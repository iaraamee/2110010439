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
public class datasetProvinsi {
    private ArrayList<Integer> id_provinsi;
    private ArrayList<String> nm_provinsi;
    
    public datasetProvinsi () {
        id_provinsi = new ArrayList<Integer>();
        nm_provinsi = new ArrayList<String>();
    }
    
    public void insertid_provinsi (int isi){
        this.id_provinsi.add(isi);
    }
    public ArrayList<Integer> getRecordId_provinsi (){
        return this.id_provinsi;
    }
    
    public void insertnm_provinsi (String isi){
        this.nm_provinsi.add(isi);
    }
    public ArrayList<String> getRecordNm_provinsi (){
        return this.nm_provinsi;
    }
    
    public void insertCustomer (Integer id_provinsi, String nm_provinsi){
        this.id_provinsi.add(id_provinsi);
        this.nm_provinsi.add(nm_provinsi);
    }
}
