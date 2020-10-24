package main;

import dataacccessobject.DAOBarang;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DAOBarang barang = new DAOBarang();
        int pilihan;
        do {
            System.out.println("=================== Program Gudang Barang ======================");
            System.out.println("1. Insert Barang");
            System.out.println("2. Sorting Nama (Ascending & Descending)");
            System.out.println("3. Sorting Stok (Ascending & Descending)");
            System.out.println("4. Sorting Harga (Ascending & Descending)");
            System.out.println("5. Search Barang");
            System.out.println("6. Close Program");
            System.out.print("Pilih menu nomor : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    barang.insert();
                    break;
                case 2:
                    barang.sortingNama();
                    break;
                case 3:
                    barang.sortingStok();
                    break;
                case 4:
                    barang.sortingHarga();
                    break;
                case 5:
                    barang.search();
                    break;
                case 6:
                    pilihan = 0;
                    break;
            }
        } while (pilihan != 0);
    }

}
