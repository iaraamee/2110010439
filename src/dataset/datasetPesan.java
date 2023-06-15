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
public class datasetPesan {
    private ArrayList<Integer> id_pesan;
    private ArrayList<Integer> id_customer;
    private ArrayList<String> tanggal;
    private ArrayList<String> total;
    private ArrayList<String> tarif;
    private ArrayList<String> alamat;
    private ArrayList<String> no_telp;
    private ArrayList<Integer> id_kota;
    private ArrayList<String> item;
    private ArrayList<Integer> id_bayar;
    private ArrayList<String> no_resi;
    
    public datasetPesan () {
        id_pesan = new ArrayList<Integer>();
        id_customer = new ArrayList<Integer>();
        tanggal = new ArrayList<String>();
        total = new ArrayList<String>();
        tarif = new ArrayList<String>();
        alamat = new ArrayList<String>();
        no_telp = new ArrayList<String>();
        id_kota = new ArrayList<Integer>();
        item = new ArrayList<String>();
        id_bayar = new ArrayList<Integer>();
        no_resi = new ArrayList<String>();
    }
        
    public void insertid_pesan (int isi){
        this.id_pesan.add(isi);
    }
    public ArrayList<Integer> getRecordId_pesan (){
        return this.id_pesan;
    }
    
    public void insertid_customer (int isi){
        this.id_customer.add(isi);
    }
    public ArrayList<Integer> getRecordId_customer (){
        return this.id_customer;
    }
    
    public void inserttanggal (String isi){
        this.tanggal.add(isi);
    }
    public ArrayList<String> getRecordTanggal (){
        return this.tanggal;
    }
    
    public void inserttotal (String isi){
        this.total.add(isi);
    }
    public ArrayList<String> getRecordTotal (){
        return this.total;
    }
    
    public void inserttarif (String isi){
        this.tarif.add(isi);
    }
    public ArrayList<String> getRecordTarif (){
        return this.tarif;
    }
    
    public void insertalamat (String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat (){
        return this.alamat;
    }
    
    public void insertno_telp (String isi){
        this.no_telp.add(isi);
    }
    public ArrayList<String> getRecordNo_telp (){
        return this.no_telp;
    }    
    
    public void insertid_kota (int isi){
        this.id_kota.add(isi);
    }
    public ArrayList<Integer> getRecordId_kota (){
        return this.id_kota;
    }
    
    public void insertitem (String isi){
        this.item.add(isi);
    }
    public ArrayList<String> getRecordItem (){
        return this.item;
    }
    
    public void insertid_bayar (int isi){
        this.id_bayar.add(isi);
    }
    public ArrayList<Integer> getRecordId_bayar (){
        return this.id_bayar;
    }
    
    public void insertno_resi (String isi){
        this.no_resi.add(isi);
    }
    public ArrayList<String> getRecordNo_resi(){
        return this.no_resi;
    }
    
    public void insertPesan (Integer id_pesan, Integer id_customer, String tanggal, String total, String tarif, String alamat, String no_telp, Integer id_kota,  String item, Integer id_bayar, String no_resi){
        this.id_pesan.add(id_pesan);
        this.id_customer.add(id_customer);
        this.tanggal.add(tanggal);
        this.total.add(total);
        this.tarif.add(tarif);
        this.alamat.add(alamat);
        this.no_telp.add(no_telp);
        this.id_kota.add(id_kota);
        this.item.add(item);
        this.id_bayar.add(id_bayar);
        this.no_resi.add(no_resi);
    
    }
}
