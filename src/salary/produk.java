/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class produk {
    private int id_produk;
    private int id_jenis;
    private String nm_produk;
    private String harga;
    private String stok;
    private String gambar;
    
    public produk(int id_produk, int id_jenis, String nm_produk, String harga, String stok, String gambar){
        this.id_produk = id_produk;
        this.id_jenis = id_jenis;
        this.nm_produk = nm_produk;
        this.harga = harga;
        this.stok = stok;
        this.gambar = gambar;   
    }
    
    public int getId_Produk(){
        return id_produk;   
    }
    public void setId_Produk (int id_produk){
        this.id_produk = id_produk;
    }
    
    public int getId_Jenis(){
        return id_jenis;   
    }
    public void setId_Jenis (int id_jenis){
        this.id_jenis = id_jenis;
    }
    
    public String getNm_Produk(){
        return nm_produk;   
    }
    public void setNm_Produk (String nm_produk){
        this.nm_produk = nm_produk;
    }
    
    public String getHarga(){
        return harga;   
    }
    public void setHarga(String harga){
        this.harga= harga;
    }
    
    public String getStok(){
        return stok;   
    }
    public void setStok(String stok){
        this.stok = stok;
    }   
}
