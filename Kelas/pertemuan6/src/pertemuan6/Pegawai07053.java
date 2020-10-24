package pertemuan6;

public class Pegawai07053 extends Induk07053 {

    String nama, alamat;
    int gaji;
    Pekerjaan07053 tugas;
    String departemen;

    public Pegawai07053(String id, String nama, String alamat) {
        super.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
}
