package modul1praktikum;

import java.util.Scanner;

class NPM07053Balok {

    private int panjang, lebar, tinggi;

    public NPM07053Balok(int a, int b, int c) {
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

class NPM07053Kubus {

    private int sisi;

    public NPM07053Kubus(int a) {
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

class NPM07053Tabung {

    private double jari, tinggi, luas_alas;

    public NPM07053Tabung(int a, int b) {
        this.jari = a;
        this.tinggi = b;
        this.luas_alas = 3.14 * jari * jari;
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
        double volume = luas_alas * tinggi;
        return volume;
    }
}

class NPM07053Kerucut {

    private double jari, tinggi, sisi_miring;

    public NPM07053Kerucut(int a, int b, int c) {
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

class NPM07053Modul1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char ulang = 'y';
        while (ulang == 'y') {
            System.out.println("Program Menghitung Luas, Keliling dan Volume Bangun Ruang");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.print("Pilih menu nomor : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang : ");
                    int p = input.nextInt();
                    System.out.print("Masukkan lebar : ");
                    int l = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    int t = input.nextInt();
                    NPM07053Balok balok = new NPM07053Balok(p, l, t);
                    System.out.println("Luas balok adalah " + balok.luas());
                    System.out.println("Keliling balok adalah " + balok.keliling());
                    System.out.println("Volume balok adalah " + balok.volume());
                    break;

                case 2:
                    System.out.print("Masukkan sisi : ");
                    int s = input.nextInt();
                    NPM07053Kubus kubus = new NPM07053Kubus(s);
                    System.out.println("Luas kubus adalah " + kubus.luas());
                    System.out.println("Keliling kubus adalah " + kubus.keliling());
                    System.out.println("Volume kubus adalah " + kubus.volume());
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari : ");
                    int j = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    int tg = input.nextInt();
                    NPM07053Tabung tabung = new NPM07053Tabung(j, tg);
                    System.out.println("Luas tabung adalah " + tabung.luas());
                    System.out.println("Keliling tabung adalah " + tabung.keliling());
                    System.out.println("Volume tabung adalah " + tabung.volume());
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari : ");
                    int ja = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    int ti = input.nextInt();
                    System.out.print("Masukkan sisi miring : ");
                    int sm = input.nextInt();
                    NPM07053Kerucut kerucut = new NPM07053Kerucut(ja, ti, sm);
                    System.out.println("Luas kerucut adalah " + kerucut.luas());
                    System.out.println("Keliling kerucut adalah " + kerucut.keliling());
                    System.out.println("Volume kerucut adalah " + kerucut.volume());
                    break;
            }
            System.out.print("Ulang (y/t) ? : ");
            ulang = input.next().charAt(0);
        }
    }
}
