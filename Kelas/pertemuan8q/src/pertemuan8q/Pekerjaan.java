package pertemuan8q;

class Pekerjaan {

    private String no_pekerjaan;
    private String nama_pekerjaan;
    private int harga;

    public Pekerjaan(String id, String nama, int harga) {
        this.no_pekerjaan = id;
        this.nama_pekerjaan = nama;
        this.harga = harga;
    }

    public String getNoPekerjaan() {
        return no_pekerjaan;
    }

    public String getNamaPekerjaan() {
        return nama_pekerjaan;
    }

    public int getHarga() {
        return harga;
    }
}
