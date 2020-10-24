package modul2praktikum;

public class NodeMahasiswa {

    String nama, npm, matkul;
    int nilai_ets, nilai_eas, nilai_akhir;

    public NodeMahasiswa(String a, String b, String c, int d, int e) {
        this.nama = a;
        this.npm = b;
        this.matkul = c;
        this.nilai_ets = d;
        this.nilai_eas = e;
        this.nilai_akhir = (nilai_ets + nilai_eas) / 2;
    }
}
