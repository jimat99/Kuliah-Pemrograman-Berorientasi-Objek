package pertemuan5;

import java.util.Scanner;

public class ModelDosen {

    Scanner input = new Scanner(System.in);
    int index = 0;
    Dosen[] dosen = new Dosen[10];

    void insert() {
        System.out.print("NIP dosen : ");
        String nip = input.next();
        System.out.print("Nama dosen : ");
        String nama = input.next();
        System.out.print("Alamat : ");
        String alamat = input.next();
        System.out.print("Nomor telepon : ");
        String telepon = input.next();
        dosen[index] = new Dosen(nip, nama, alamat, telepon);
        index++;
    }

    void view() {
        if (this.index == 0) {
            System.err.println("Data masih kosong");
        } else {
            System.out.println("================Data Dosen===============");
            for (int i = 0; i < index; i++) {
                System.out.println("NIP dosen : " + dosen[i].nip);
                System.out.println("Nama dosen : " + dosen[i].nama);
                System.out.println("Alamat : " + dosen[i].alamat);
                System.out.println("Nomor telepon : " + dosen[i].telepon);
                System.out.println("=========================================");
            }
        }
    }

    void update() {
        if (this.index == 0) {
            System.err.println("Tidak dapat mengupdate, data masih kosong");
        } else {
            System.out.println("========================Update Data=============================");
            System.out.print("Nama dosen yang akan diupdate : ");
            String update = input.next();
            int index_ketemu = cariData(update);
            if (index_ketemu != -1) {
                System.out.println("NIP dosen : " + dosen[index_ketemu].nip);
                System.out.println("Alamat : " + dosen[index_ketemu].alamat);
                System.out.println("Nomor telepon : " + dosen[index_ketemu].telepon);
                System.out.println("=============Diupdate menjadi============");
                System.out.print("NIP dosen : ");
                String nip = input.next();
                System.out.print("Nama dosen : ");
                String nama = input.next();
                System.out.print("Alamat : ");
                String alamat = input.next();
                System.out.print("Nomor telepon : ");
                String telepon = input.next();
                dosen[index_ketemu].nip = nip;
                dosen[index_ketemu].nama = nama;
                dosen[index_ketemu].alamat = alamat;
                dosen[index_ketemu].telepon = telepon;
            } else {
                System.err.println("Data yang ingin diupdate tidak ditemukan");
            }
        }
    }

    void delete() {
        if (this.index == 0) {
            System.err.println("Tidak dapat menghapus, data masih kosong");
        } else {
            System.out.println("=========================Hapus Data=============================");
            System.out.print("Nama dosen yang akan dihapus : ");
            String hapus = input.next();
            int index_ketemu = cariData(hapus);
            if (index_ketemu != -1) {
                for (int i = index_ketemu; i < index; i++) {
                    if (hapus.equals(dosen[i].nama)) {
                        for (int j = i; j < index; j++) {
                            if (j != index - 1) {
                                dosen[j].nip = dosen[j + 1].nip;
                                dosen[j].nama = dosen[j + 1].nama;
                                dosen[j].alamat = dosen[j + 1].alamat;
                                dosen[j].telepon = dosen[j + 1].telepon;
                            }
                        }
                        System.out.println("Data telah dihapus");
                        index--;
                    }
                }
            } else {
                System.err.println("Data yang ingin dihapus tidak ditemukan");
            }
        }
    }

    int cariData(String cari) {
        boolean ketemu = false;
        int index = 0;
        for (int i = 0; i < this.index; i++) {
            if (cari.equals(dosen[i].nama)) {
                ketemu = true;
                index = i;
            } else if (ketemu == false && i == this.index - 1) {
                index = -1;
            }
        }
        return index;
    }

    int getIndex() {
        return this.index;
    }

}
