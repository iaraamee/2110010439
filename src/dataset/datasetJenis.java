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
public class datasetJenis {
    private ArrayList<Integer> id_jenis;
    private ArrayList<String> nm_jenis;
    
    public datasetJenis () {
        id_jenis = new ArrayList<Integer>();
        nm_jenis = new ArrayList<String>();
    }
    
    public void insertid_jenis (int isi){
        this.id_jenis.add(isi);
    }
    public ArrayList<Integer> getRecordId_jenis (){
        return this.id_jenis;
    }
    
    public void insertnm_jenis (String isi){
        this.nm_jenis.add(isi);
    }
    public ArrayList<String> getRecordNm_jenis (){
        return this.nm_jenis;
    }
    
    public void insertCustomer (Integer id_jenis, String nm_jenis){
        this.id_jenis.add(id_jenis);
        this.nm_jenis.add(nm_jenis);
    }
    
}
