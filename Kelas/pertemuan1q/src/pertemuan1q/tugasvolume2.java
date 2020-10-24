package pertemuan1q;

import java.util.Scanner;

public class tugasvolume2 {

    static class Bangun {

        double panjang, lebar, tinggi, volume;

        public Bangun() {
            Scanner input = new Scanner(System.in);

            System.out.print("Panjang : ");
            this.panjang = input.nextDouble();
            System.out.print("Lebar : ");
            this.lebar = input.nextDouble();
            System.out.print("Tinggi : ");
            this.tinggi = input.nextDouble();

            System.out.println("========================================");
        }

        void volumeBalok() {
            this.volume = this.panjang * this.lebar * this.tinggi;
            System.out.println("Volume balok : " + this.volume);
        }

        void volumePrismaSegiempat() {
            this.volume = this.panjang * this.lebar * this.tinggi * 1 / 3;
            System.out.println("Volume prisma segiempat : " + this.volume);
        }

    }

    public static void main(String[] args) {
        System.out.println("Objek Balok");
        Bangun balok = new Bangun();
        System.out.println("Objek Prisma Segiempat");
        Bangun prismaSegiempat = new Bangun();
        balok.volumeBalok();
        prismaSegiempat.volumePrismaSegiempat();
    }
}
