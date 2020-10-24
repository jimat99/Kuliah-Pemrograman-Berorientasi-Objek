package modul1asistensi;

class Kerucut {

    private double jari, tinggi, sisi_miring;

    public Kerucut(double a, double b, double c) {
        this.jari = a;
        this.tinggi = b;
        this.sisi_miring = c;
    }

    public double luas() {
        double luas = (3.14 * jari * jari) + (3.14 * jari * sisi_miring);
        return luas;
    }

    public double keliling() {
        double keliling = 2 * 3.14 * jari;
        return keliling;
    }

    public double volume() {
        double volume = 3.14 * jari * jari * tinggi / 3;
        return volume;
    }

}
