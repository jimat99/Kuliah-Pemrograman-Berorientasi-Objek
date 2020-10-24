package pertemuan3q;

public class balok extends bangunruang {

    int panjang, lebar;

    public balok(int a, int b, int tng) {
        this.panjang = a;
        this.lebar = b;
        super.tinggi = tng;
        luasalas();
    }

    void luasalas() {
        int luas = panjang * lebar;
        super.luasAlas = luas;
    }

}
