package pertemuan3q;

public class tabung extends bangunruang {

    int jari;
    double phi = 3.14;

    public tabung(int jari, int tng) {
        this.jari = jari;
        super.tinggi = tng;
        luasalas();
    }

    void luasalas() {
        double luas = phi * jari * jari;
        super.luasAlas = luas;
    }
}
