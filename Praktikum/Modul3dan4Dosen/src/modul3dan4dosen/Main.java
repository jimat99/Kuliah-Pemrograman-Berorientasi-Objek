package modul3dan4dosen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;
        int pilihan;
        do {
            ulang = "ulang";
            System.out.println("============================");
            System.out.println("      Kamus Sederhana :     ");
            System.out.println("============================");
            System.out.println("1. Indonesia - English");
            System.out.println("2. English - Indonesia");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    while (ulang.equals("ulang")) {
                        System.out.println("============================");
                        System.out.println("    Indonesia - English     ");
                        System.out.println("============================");
                        System.out.print("Kata yang Anda cari : ");
                        String kata_indo = input.next();
                        Indonesia kamus_indo = new Indonesia(kata_indo);
                        System.out.println("============================");
                        System.out.println("            Hasil           ");
                        System.out.println("============================");
                        System.out.println(kamus_indo.keInggris());
                        System.out.print("Ulang or back ? ");
                        ulang = input.next();
                    }
                case 2:
                    while (ulang.equals("ulang")) {
                        System.out.println("============================");
                        System.out.println("    English - Indonesia     ");
                        System.out.println("============================");
                        System.out.print("Word you will find : ");
                        String kata_inggris = input.next();
                        Inggris kamus_inggris = new Inggris(kata_inggris);
                        System.out.println("============================");
                        System.out.println("           Result           ");
                        System.out.println("============================");
                        System.out.println(kamus_inggris.keIndonesia());
                        System.out.print("Ulang or back ? ");
                        ulang = input.next();
                    }
            }
        } while (ulang.equals("back") && pilihan != 3);
    }
}
