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
public class datasetPembayaran {
    private ArrayList<Integer> id_bayar;
    private ArrayList<String> tanggal;
    private ArrayList<Integer> id_pesan;
    private ArrayList<String> jumlah;
    private ArrayList<Integer> id_bank;
    private ArrayList<String> bukti;
    
    public datasetPembayaran () {
        id_bayar = new ArrayList<Integer>();
        tanggal = new ArrayList<Date>();
        id_pesan = new ArrayList<Integer>();
        jumlah = new ArrayList<String>();
        id_bank = new ArrayList<Integer>();
        bukti = new ArrayList<String>();
    } 
    
    public void insertid_bayar (int isi){
        this.id_bayar.add(isi);
    }
    public ArrayList<Integer> getRecordId_bayar (){
        return this.id_bayar;
    }
    
    public void inserttanggal (String isi){
        this.tanggal.add(isi);
    }
    public ArrayList<String> getRecordTanggal (){
        return this.tanggal;
    }
    
    public void insertid_pesan (int isi){
        this.id_pesan.add(isi);
    }
    public ArrayList<Integer> getRecordId_pesan (){
        return this.id_pesan;
    }
    
    public void insertjumlah (String isi){
        this.jumlah.add(isi);
    }
    public ArrayList<String> getRecordJumlah (){
        return this.jumlah;
    }
    
    public void insertid_bank (int isi){
        this.id_bank.add(isi);
    }
    public ArrayList<Integer> getRecordId_bank (){
        return this.id_bank;
    }
    
    public void insertbukti (String isi){
        this.bukti.add(isi);
    }
    public ArrayList<String> getRecordbukti(){
        return this.bukti;
    }
    
    public void insertCustomer (Integer id_bayar, Date tanggal, Integer id_pesan, String jumlah, Integer id_bank, String bukti){
        this.id_bayar.add(id_bayar);
        this.tanggal.add(tanggal);
        this.id_pesan.add(id_pesan);
        this.jumlah.add(jumlah);
        this.id_bank.add(id_bank);
        this.bukti.add(bukti);
    }
}
