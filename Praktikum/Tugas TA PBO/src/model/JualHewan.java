package model;

public class JualHewan {

    private String id, nama, tanggal_beli, tanggal_jual;
    private int harga_beli, harga_jual, untung;

    public JualHewan(String id, String nama, int harga_beli, String tgl_beli,
            int harga_jual, String tgl_jual, int untung) {
        this.id = id;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.tanggal_beli = tgl_beli;
        this.harga_jual = harga_jual;
        this.tanggal_jual = tgl_jual;
        this.untung = untung;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalBeli() {
        return tanggal_beli;
    }

    public String getTanggalJual() {
        return tanggal_jual;
    }

    public int getHargaBeli() {
        return harga_beli;
    }

    public int getHargaJual() {
        return harga_jual;
    }

    public int getUntung() {
        return untung;
    }
}
