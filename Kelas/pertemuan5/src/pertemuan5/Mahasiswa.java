package pertemuan5;

public class Mahasiswa extends Manusia {

    String npm, id_dosen_wali;

    public Mahasiswa(String npm, String nama, String alamat, String telepon) {
        this.npm = npm;
        super.nama = nama;
        super.alamat = alamat;
        super.telepon = telepon;
    }

    void regDosen(String id) {
        id_dosen_wali = id;
    }

}
