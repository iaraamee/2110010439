/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mutiara_2110010439;

import dataset.*;
import salary.*;
import java.util.ArrayList;
import froms.*;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.Date;;
import dataset.datasetCustomer;
import dataset.datasetJenis;
import dataset.datasetKota;
import dataset.datasetPembayaran;
import dataset.datasetPengiriman;
import dataset.datasetPesan;
import dataset.datasetPesan_Detail;
import dataset.datasetProduk;
import dataset.datasetProvinsi;
import froms.FCustomer;
import dataset.datasetCustomer;
import dataset.datasetJenis;
import dataset.datasetKota;
import dataset.datasetPembayaran;
import dataset.datasetPengiriman;
import dataset.datasetPesan;
import dataset.datasetPesan_Detail;
import dataset.datasetProduk;
import dataset.datasetProvinsi;

public class mutiara_2110010439 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        datasetCustomer customer = new datasetCustomer ();
        datasetJenis jenis = new datasetJenis ();
        datasetKota kota = new datasetKota ();
        datasetPembayaran pembayaran = new datasetPembayaran ();
        datasetPengiriman pengiriman = new datasetPengiriman ();
        datasetPesan pesan = new datasetPesan ();
        datasetPesan_Detail pesan_detail = new datasetPesan_Detail ();
        datasetProduk produk = new datasetProduk ();
        datasetProvinsi provinsi = new datasetProvinsi ();
        
        customer.insertid_customer(001);
        customer.insertnama("Wahdanyia");
        customer.insertalamat ("Banjarmasin");
        customer.insertid_kota(101);
        customer.inserttelp("085752413117");
        customer.insertemail("wahdanyia@gmail.com");
        customer.insertpassword("password");
        
        jenis.insertid_jenis(111);
        jenis.insertnm_jenis("Kemeja");
        
        kota.insertid_kota(101);
        kota.insertid_provinsi(100);
        kota.insertnm_kota("Banjarmasin");
        kota.inserttarif("20000");
        
        pembayaran.insertid_bayar(221);
        pembayaran.inserttanggal(new Date());
        pembayaran.insertid_pesan(1);
        pembayaran.insertjumlah("2");
        pembayaran.insertid_bank(20001);
        pembayaran.insertbukti("sudah");
        
        pengiriman.insertid_kirim(321);
        pengiriman.insertno_resi("B001");
        pengiriman.insertid_pesan(1);
        pengiriman.inserttanggal_kirim(new Date());
        
        pesan.insertid_pesan(1);
        pesan.insertid_customer(001);
        pesan.inserttanggal(new Date());
        pesan.inserttotal("15000");
        pesan.inserttarif("20000");
        pesan.insertalamat("Banjarmasin");
        pesan.insertno_telp("081324897664");
        pesan.insertitem("2");
        pesan.insertid_bayar(221);
        pesan.insertno_resi("B001");
        
        pesan_detail.insertid_pesan(1);
        pesan_detail.insertsubtotal("15000");
        pesan_detail.insertid_produk(01);
        pesan_detail.insertharga_jual("75000");
        
        produk.insertid_produk(01);
        produk.insertid_jenis(111);
        produk.insertnm_produk("Kameja");
        produk.insertharga("75000");
        produk.insertstok("20");
        produk.insertgambar("-");
        
        provinsi.insertid_provinsi(100);
        provinsi.insertnm_provinsi("Kalimantan Selatan");
        
        System.out.println(customer.getRecordId_customer());
        System.out.println(customer.getRecordNama());
        System.out.println(jenis.getRecordId_jenis());
        System.out.println(jenis.getRecordNm_jenis());
        System.out.println(kota.getRecordId_kota());
        System.out.println(kota.getRecordNm_kota());
        System.out.println(pembayaran.getRecordId_bayar());
        System.out.println(pengiriman.getRecordId_kirim());
        System.out.println(pesan.getRecordId_pesan());
        System.out.println(pesan_detail.getRecordId_pesan());
        System.out.println(produk.getRecordId_produk());
        System.out.println(produk.getRecordNm_produk());
        System.out.println(provinsi.getRecordId_provinsi());
        System.out.println(provinsi.getRecordNm_provinsi());
        */
        new FCustomer().setVisible(true);
    } 
}