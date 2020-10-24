package pertemuan1q;

import java.util.Scanner;

public class tugasvolume1 {

    static class Bangun {

        double panjang, lebar, tinggi, volume;

        void volumeBalok(double p, double l, double t) {
            this.volume = p * l * t;
            System.out.println("Volume balok : " + this.volume);
        }

        void volumePrismaSegiempat(double p, double l, double t) {
            this.volume = p * l * t * 1 / 3;
            System.out.println("Volume prisma segiempat : " + this.volume);
        }

        void volumePrismaSegitiga(double p, double l, double t) {
            this.volume = 0.5 * p * l * t * 1 / 3;
            System.out.println("Volume prisma segitiga : " + this.volume);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();

        char ulang = 'y';
        while (ulang == 'y') {
            System.out.println("Pilih objek : 1. Balok");
            System.out.println("              2. Prisma Segiempat");
            System.out.println("              3. Prisma Segitiga");
            int pilihan;
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    Bangun balok = new Bangun();
                    balok.volumeBalok(panjang, lebar, tinggi);
                    break;
                case 2:
                    Bangun prismaSegiempat = new Bangun();
                    prismaSegiempat.volumePrismaSegiempat(panjang, lebar, tinggi);
                    break;
                case 3:
                    Bangun prismaSegitiga = new Bangun();
                    prismaSegitiga.volumePrismaSegitiga(panjang, lebar, tinggi);
                    break;
            }

            System.out.print("Ulang gak cok (y/t) ? ");
            ulang = input.next().charAt(0);
        }
    }

}
