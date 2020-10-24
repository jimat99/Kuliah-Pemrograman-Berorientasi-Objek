package pertemuan5;

public class Dosen extends Manusia {

    String nip;

    public Dosen(String nip, String nama, String alamat, String telepon) {
        this.nip = nip;
        super.nama = nama;
        super.alamat = alamat;
        super.telepon = telepon;
    }

}
