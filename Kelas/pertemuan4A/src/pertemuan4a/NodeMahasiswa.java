package pertemuan4A;

public class NodeMahasiswa {

    String nama;
    int npm, nilai_uts, nilai_uas, nas;

    public NodeMahasiswa(String a, int b, int c, int d) {
        this.nama = a;
        this.npm = b;
        this.nilai_uts = c;
        this.nilai_uas = d;
        this.nas = (nilai_uts + nilai_uas) / 2;
    }
}
