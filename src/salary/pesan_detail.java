/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class pesan_detail {
    private int id_pesan;
    private String subtotal;
    private int id_produk;
    private String harga_jual;
    
    public pesan_detail (int id_pesan, String subtotal, int id_produk, String harga_jual){
        this.id_pesan = id_pesan;
        this.subtotal = subtotal;
        this.id_produk = id_produk;
        this.harga_jual = harga_jual;
    }
    
    public int getId_Pesan(){
        return id_pesan;   
    }
    public void setId_Pesan (int id_pesan){
        this.id_pesan = id_pesan;
    }
    
    public String getSubTotal(){
        return subtotal;   
    }
    public void setSubTotal (String subtotal){
        this.subtotal = subtotal;
    }
    
    public int getId_Produk(){
        return id_produk;   
    }
    public void setId_Produk (int id_produk){
        this.id_produk = id_produk;
    }
    
    public String getHarga_jual(){
        return harga_jual;   
    }
    public void setHarga_Jual (String harga_jual){
        this.harga_jual = harga_jual;
    }
}