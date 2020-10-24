package dataaccessobject;

import model.Barang;
import java.util.Scanner;

public class DAOBarang {

    Scanner input = new Scanner(System.in);
    Barang[] barang = new Barang[2];
    int index = 0;

    public void insert() {
        try {
            System.out.println("====================== Insert Barang ===========================");
            System.out.print("Nama barang : ");
            String nama = input.next();
            System.out.print("Stok barang : ");
            int stok = input.nextInt();
            System.out.print("Harga barang : ");
            int harga = input.nextInt();
            barang[index] = new Barang(nama, stok, harga);
            index++;
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Insert gagal, ukuran array hanya 2."
                    + "\nTidak dapat menyimpan data lebih dari 2");
        }
    }

    public void viewAscending() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama barang : " + barang[i].nama);
            System.out.println("Stok barang : " + barang[i].stok);
            System.out.println("Harga barang : " + barang[i].harga);
            System.out.println("================================================================");
        }
    }

    public void viewDescending() {
        for (int i = index - 1; i >= 0; i--) {
            System.out.println("Nama barang : " + barang[i].nama);
            System.out.println("Stok barang : " + barang[i].stok);
            System.out.println("Harga barang : " + barang[i].harga);
            System.out.println("================================================================");
        }
    }

    public void sortingNama() {
        if (this.index == 0) {
            System.err.println("Data masih kosong");
        } else {
            String temp_nama;
            int temp_stok, temp_harga;
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < index - (i + 1); j++) {
                    if (barang[j].nama.compareTo(barang[j + 1].nama) > 0) {
                        temp_nama = barang[j].nama;
                        temp_stok = barang[j].stok;
                        temp_harga = barang[j].harga;
                        barang[j].nama = barang[j + 1].nama;
                        barang[j].stok = barang[j + 1].stok;
                        barang[j].harga = barang[j + 1].harga;
                        barang[j + 1].nama = temp_nama;
                        barang[j + 1].stok = temp_stok;
                        barang[j + 1].harga = temp_harga;
                    }
                }
            }

            System.out.println("========= Sorting Barang Berdasarkan Nama (Ascending) ==========");
            viewAscending();
            System.out.println("======== Sorting Barang Berdasarkan Nama (Descending) ==========");
            viewDescending();
        }
    }

    public void sortingStok() {
        if (this.index == 0) {
            System.err.println("Data masih kosong");
        } else {
            String temp_nama;
            int temp_stok, temp_harga;
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < index - (i + 1); j++) {
                    if (barang[j].stok > barang[j + 1].stok) {
                        temp_nama = barang[j].nama;
                        temp_stok = barang[j].stok;
                        temp_harga = barang[j].harga;
                        barang[j].nama = barang[j + 1].nama;
                        barang[j].stok = barang[j + 1].stok;
                        barang[j].harga = barang[j + 1].harga;
                        barang[j + 1].nama = temp_nama;
                        barang[j + 1].stok = temp_stok;
                        barang[j + 1].harga = temp_harga;
                    }
                }
            }

            System.out.println("========= Sorting Barang Berdasarkan Stok (Ascending) ==========");
            viewAscending();
            System.out.println("======== Sorting Barang Berdasarkan Stok (Descending) ==========");
            viewDescending();
        }
    }

    public void sortingHarga() {
        if (this.index == 0) {
            System.err.println("Data masih kosong");
        } else {
            String temp_nama;
            int temp_stok, temp_harga;
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < index - (i + 1); j++) {
                    if (barang[j].harga > barang[j + 1].harga) {
                        temp_nama = barang[j].nama;
                        temp_stok = barang[j].stok;
                        temp_harga = barang[j].harga;
                        barang[j].nama = barang[j + 1].nama;
                        barang[j].stok = barang[j + 1].stok;
                        barang[j].harga = barang[j + 1].harga;
                        barang[j + 1].nama = temp_nama;
                        barang[j + 1].stok = temp_stok;
                        barang[j + 1].harga = temp_harga;
                    }
                }
            }

            System.out.println("========= Sorting Barang Berdasarkan Harga (Ascending) ==========");
            viewAscending();
            System.out.println("======== Sorting Barang Berdasarkan Harga (Descending) ==========");
            viewDescending();
        }
    }

}
