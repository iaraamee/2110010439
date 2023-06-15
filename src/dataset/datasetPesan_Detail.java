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
public class datasetPesan_Detail {
    private ArrayList<Integer> id_pesan;
    private ArrayList<String> subtotal;
    private ArrayList<Integer> id_produk;
    private ArrayList<String> harga_jual;

    public datasetPesan_Detail () {
        id_pesan = new ArrayList<Integer>();
        subtotal = new ArrayList<String>();
        id_produk = new ArrayList<Integer>();
        harga_jual = new ArrayList<String>();
    }
    
    public void insertid_pesan (int isi){
        this.id_pesan.add(isi);
    }
    public ArrayList<Integer> getRecordId_pesan (){
        return this.id_pesan;
    }
    
    public void insertsubtotal (String isi){
        this.subtotal.add(isi);
    }
    public ArrayList<String> getRecordSubtotal (){
        return this.subtotal;
    }
    
    public void insertid_produk (int isi){
        this.id_produk.add(isi);
    }
    public ArrayList<Integer> getRecordId_produk (){
        return this.id_produk;
    }
    
    public void insertharga_jual (String isi){
        this.harga_jual.add(isi);
    }
    public ArrayList<String> getRecordHarga_jual (){
        return this.harga_jual;
    }
    
    public void insertPesan_Detail (Integer id_pesan, String subtotal, Integer id_produk, String harga_jual){
        this.id_pesan.add(id_pesan);
        this.subtotal.add(subtotal);
        this.id_produk.add(id_produk);
        this.harga_jual.add(harga_jual);
    }
}
