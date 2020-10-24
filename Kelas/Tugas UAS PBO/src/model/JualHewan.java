package model;

public class JualHewan {

    public BeliHewan hewan_dibeli;
    private String tanggal_jual;
    private int harga_jual, untung;
    public static int total_untung;

    public JualHewan(String id, int harga_jual, String tgl_jual, int untung) {
        this.hewan_dibeli = AllObject.data_beli_all.cariObjek(id);
        this.harga_jual = harga_jual;
        this.tanggal_jual = tgl_jual;
        this.untung = untung;
    }

    public String getId() {
        return hewan_dibeli.getId();
    }

    public String getNama() {
        return hewan_dibeli.getNama();
    }

    public int getHargaBeli() {
        return hewan_dibeli.getHargaBeli();
    }

    public String getTanggalBeli() {
        return hewan_dibeli.getTanggalBeli();
    }

    public int getHargaJual() {
        return harga_jual;
    }

    public String getTanggalJual() {
        return tanggal_jual;
    }

    public int getUntung() {
        return untung;
    }
}
