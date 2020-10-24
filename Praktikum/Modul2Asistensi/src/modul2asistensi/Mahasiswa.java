package modul2asistensi;

import java.util.Scanner;

public class Mahasiswa {

    Scanner input = new Scanner(System.in);

    private static class Node {

        String nama, npm, matkul;
        int nilai_ets, nilai_eas, nilai_akhir;
        Node next;

        Node(String a, String b, String c, int d, int e) {
            this.nama = a;
            this.npm = b;
            this.matkul = c;
            this.nilai_ets = d;
            this.nilai_eas = e;
            this.nilai_akhir = (nilai_ets + nilai_eas) / 2;
            this.next = null;
        }
    }

    Node head;

    void inputLinkList(Mahasiswa list) {
        System.out.print("Masukkan nama : ");
        String nama = input.next();
        System.out.print("Masukkan NPM : ");
        String npm = input.next();
        System.out.print("Masukkan mata kuliah : ");
        String matkul = input.next();
        System.out.print("Masukkan nilai ETS : ");
        int ets = input.nextInt();
        System.out.print("Masukkan nilai EAS : ");
        int eas = input.nextInt();
        Node data_mahasiswa = new Node(nama, npm, matkul, ets, eas);
        if (list.head == null) {
            list.head = data_mahasiswa;
        } else {
            data_mahasiswa.next = list.head;
            list.head = data_mahasiswa;
        }
    }

    void tampilLinkList(Mahasiswa list) {
        Node tampil = list.head;
        System.out.println("=== Data Mahasiswa ===");
        while (tampil != null) {
            System.out.println("Nama : " + tampil.nama);
            System.out.println("NPM : " + tampil.npm);
            System.out.println("Mata Kuliah : " + tampil.matkul);
            System.out.println("Nilai ETS : " + tampil.nilai_ets);
            System.out.println("Nilai EAS : " + tampil.nilai_eas);
            System.out.println("Nilai akhir : " + tampil.nilai_akhir);
            tampil = tampil.next;
            System.out.println("=============================");
        }
    }

    void hapusLinkList(Mahasiswa list) {
        if (list.head == null) {
            System.out.println("Data masih kosong");
        } else {
            System.out.print("Nama yang ingin dihapus : ");
            String nama = input.next();
            Node hapus = list.head, temukan = list.head;
            boolean ketemu = true;
            while (nama.equals(temukan.nama) == false && ketemu == true) {
                if (temukan.next == null) {
                    System.out.println("Data tidak ditemukan");
                    ketemu = false;
                } else {
                    temukan = temukan.next;
                }
            }

            if (nama.equals(list.head.nama) && ketemu == true) {
                list.head = list.head.next;
                System.out.println("Data berhasil dihapus");
            } else {
                if (ketemu == true) {
                    while (nama.equals(hapus.next.nama) == false) {
                        hapus = hapus.next;
                    }
                    hapus.next = hapus.next.next;
                    System.out.println("Data berhasil dihapus");
                }
            }
        }
    }

    void updateLinkList(Mahasiswa list) {
        System.out.print("Nama mahasiswa yang akan diupdate : ");
        String update = input.next();
        Node cari = list.head;
        while (cari != null && update.equals(cari.nama) == false) {
            cari = cari.next;
        }

        if (update.equals(cari.nama)) {
            System.out.println("NPM : " + cari.npm);
            System.out.println("Mata kuliah : " + cari.matkul);
            System.out.println("Nilai ETS : " + cari.nilai_ets);
            System.out.println("Nilai EAS : " + cari.nilai_eas);
            System.out.println("Nilai akhir : " + cari.nilai_akhir);
            System.out.println("=====Diupdate Menjadi=====");
            System.out.print("Nilai ETS : ");
            int ets = input.nextInt();
            System.out.print("Nilai EAS : ");
            int eas = input.nextInt();
            cari.nilai_ets = ets;
            cari.nilai_eas = eas;
            cari.nilai_akhir = (ets + eas) / 2;
        }
    }

}
