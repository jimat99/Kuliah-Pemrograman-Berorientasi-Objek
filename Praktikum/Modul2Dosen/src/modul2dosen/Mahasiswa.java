package modul2dosen;

import java.util.Scanner;

public class Mahasiswa {

    Scanner input = new Scanner(System.in);
    int index = 0;

    public static class Node {

        String nama, npm, matkul;
        int nilai_ets, nilai_eas, nilai_akhir, index;
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
        this.index++;
    }

    int getIndex() {
        return this.index;
    }

    Node[] tampilLinkListReturnArray(Mahasiswa list) {
        int index_array = 0;
        Node index_list = list.head;
        Node[] mahasiswa = new Node[10];
        while (index_list != null) {
            mahasiswa[index_array] = new Node(index_list.nama, index_list.npm, index_list.matkul, index_list.nilai_ets, index_list.nilai_eas);
            index_list = index_list.next;
            index_array++;
        }
        return mahasiswa;
    }

    Node tampilLinkListReturn(Mahasiswa list) {
        return list.head;
    }

    void hapusLinkList(Mahasiswa list) {
        if (list.head == null) {
            System.out.println("Data kosong");
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

}
