package modul1asistensi;

class Balok {

    private int panjang, lebar, tinggi;

    public Balok(int a, int b, int c) {
        this.panjang = a;
        this.lebar = b;
        this.tinggi = c;
    }

    public int luas() {
        int luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        return luas;
    }

    public int keliling() {
        int keliling = 4 * (panjang + lebar + tinggi);
        return keliling;
    }

    public int volume() {
        int volume = panjang * lebar * tinggi;
        return volume;
    }

}
