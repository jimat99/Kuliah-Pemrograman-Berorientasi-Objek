package model;

public class Barang extends Gudang {

    public String nama;
    public int harga;

    public Barang(String nama, int stok, int harga) {
        this.nama = nama;
        super.stok = stok;
        this.harga = harga;
    }

}
