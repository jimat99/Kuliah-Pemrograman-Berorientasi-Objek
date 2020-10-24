package modul1asistensi;

import java.util.Scanner;

class Proses {

    private Scanner input = new Scanner(System.in);

    public void menu() {
        char ulang = 'y';
        int pilihan;
        do {
            System.out.println("Program Menghitung Luas, Keliling dan Volume Bangun Ruang");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu nomor : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang : ");
                    int panjang = input.nextInt();
                    System.out.print("Masukkan lebar : ");
                    int lebar = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    int tinggi = input.nextInt();
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.println("Luas balok adalah " + balok.luas());
                    System.out.println("Keliling balok adalah " + balok.keliling());
                    System.out.println("Volume balok adalah " + balok.volume());
                    break;
                case 2:
                    System.out.print("Masukkan sisi : ");
                    int sisi = input.nextInt();
                    Kubus kubus = new Kubus(sisi);
                    System.out.println("Luas kubus adalah " + kubus.luas());
                    System.out.println("Keliling kubus adalah " + kubus.keliling());
                    System.out.println("Volume kubus adalah " + kubus.volume());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari : ");
                    double jari_tabung = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggi_tabung = input.nextDouble();
                    Tabung tabung = new Tabung(jari_tabung, tinggi_tabung);
                    System.out.println("Luas tabung adalah " + tabung.luas());
                    System.out.println("Keliling tabung adalah " + tabung.keliling());
                    System.out.println("Volume tabung adalah " + tabung.volume());
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari : ");
                    double jari_kerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggi_kerucut = input.nextDouble();
                    System.out.print("Masukkan sisi miring : ");
                    double sisi_miring = input.nextDouble();
                    Kerucut kerucut = new Kerucut(jari_kerucut, tinggi_kerucut, sisi_miring);
                    System.out.println("Luas kerucut adalah " + kerucut.luas());
                    System.out.println("Keliling kerucut adalah " + kerucut.keliling());
                    System.out.println("Volume kerucut adalah " + kerucut.volume());
                    break;
            }
            if (pilihan != 5) {
                System.out.print("Ulang program (y/t) ? ");
                ulang = input.next().charAt(0);
            }
        } while (ulang == 'y' && pilihan != 5);
    }
}
