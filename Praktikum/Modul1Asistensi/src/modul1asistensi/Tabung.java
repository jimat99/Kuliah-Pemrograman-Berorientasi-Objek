package modul1asistensi;

class Tabung {

    private double jari, tinggi;

    public Tabung(double a, double b) {
        this.jari = a;
        this.tinggi = b;
    }

    public double luas() {
        double luas = 2 * 3.14 * jari * (tinggi + jari);
        return luas;
    }

    public double keliling() {
        double keliling = 2 * 3.14 * jari;
        return keliling;
    }

    public double volume() {
        double volume = 3.14 * jari * jari * tinggi;
        return volume;
    }

}
