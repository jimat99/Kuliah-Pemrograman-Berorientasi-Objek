package model;

public class BeliHewan {

    private String id, nama, umur, tanggal_beli;
    private int harga_beli;

    public BeliHewan(String id, String nama, String umur, int harga_beli, String tgl_beli) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.harga_beli = harga_beli;
        this.tanggal_beli = tgl_beli;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setTanggalBeli(String tanggal_beli) {
        this.tanggal_beli = tanggal_beli;
    }

    public void setHargaBeli(int harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public int getHargaBeli() {
        return harga_beli;
    }

    public String getTanggalBeli() {
        return tanggal_beli;
    }

}
