package modul1asistensi;

class Kubus {

    private int sisi;

    public Kubus(int a) {
        this.sisi = a;
    }

    public int luas() {
        int luas = 6 * (sisi * sisi);
        return luas;
    }

    public int keliling() {
        int keliling = 12 * sisi;
        return keliling;
    }

    public int volume() {
        int volume = sisi * sisi * sisi;
        return volume;
    }

}
