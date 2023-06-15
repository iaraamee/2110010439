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
public class datasetProduk {
    private ArrayList<Integer> id_produk;
    private ArrayList<Integer> id_jenis;
    private ArrayList<String> nm_produk;
    private ArrayList<String> harga;
    private ArrayList<String> stok;
    private ArrayList<String> gambar;
    
    public datasetProduk () {
        id_produk = new ArrayList<Integer>();
        id_jenis = new ArrayList<Integer>();
        nm_produk = new ArrayList<String>();
        harga = new ArrayList<String>();
        stok = new ArrayList<String>();
        gambar = new ArrayList<String>();
    } 
    
    public void insertid_produk (int isi){
        this.id_produk.add(isi);
    }
    public ArrayList<Integer> getRecordId_produk (){
        return this.id_produk;
    }
    
    public void insertid_jenis (int isi){
        this.id_jenis.add(isi);
    }
    public ArrayList<Integer> getRecordId_jenis (){
        return this.id_jenis;
    }
    
    public void insertnm_produk (String isi){
        this.nm_produk.add(isi);
    }
    public ArrayList<String> getRecordNm_produk (){
        return this.nm_produk;
    }
    
    public void insertharga (String isi){
        this.harga.add(isi);
    }
    public ArrayList<String> getRecordHarga(){
        return this.harga;
    }
    
    public void insertstok(String isi){
        this.stok.add(isi);
    }
    public ArrayList<String> getRecordStok(){
        return this.stok;
    }
    
    public void insertgambar (String isi){
        this.gambar.add(isi);
    }
    public ArrayList<String> getRecordGambar (){
        return this.gambar;
    }
    
     public void insertCustomer (Integer id_produk, Integer id_jenis, String nm_produk, String harga, String stok, String gambar){
        this.id_produk.add(id_produk);
        this.id_jenis.add(id_jenis);
        this.nm_produk.add(nm_produk);
        this.harga.add(harga);
        this.stok.add(stok);
        this.gambar.add(gambar);
    }
    
}
