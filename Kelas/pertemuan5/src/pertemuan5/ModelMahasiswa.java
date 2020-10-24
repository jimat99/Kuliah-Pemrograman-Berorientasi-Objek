package pertemuan5;

import java.util.Scanner;

public class ModelMahasiswa {

    Scanner input = new Scanner(System.in);
    int index = 0;
    Mahasiswa[] mahasiswa = new Mahasiswa[10];

    void insert() {
        System.out.print("ID dosen wali : ");
        String id = input.next();
        System.out.print("NPM mahasiswa : ");
        String npm = input.next();
        System.out.print("Nama mahasiswa : ");
        String nama = input.next();
        System.out.print("Alamat : ");
        String alamat = input.next();
        System.out.print("Nomor telepon : ");
        String telepon = input.next();
        mahasiswa[index] = new Mahasiswa(npm, nama, alamat, telepon);
        mahasiswa[index].regDosen(id);
        index++;
    }

    void view() {
        if (this.index == 0) {
            System.err.println("Data masih kosong");
        } else {
            System.out.println("==============Data Mahasiswa=============");
            for (int i = 0; i < index; i++) {
                System.out.println("ID dosen wali : " + mahasiswa[i].id_dosen_wali);
                System.out.println("NPM mahasiswa : " + mahasiswa[i].npm);
                System.out.println("Nama mahasiswa : " + mahasiswa[i].nama);
                System.out.println("Alamat : " + mahasiswa[i].alamat);
                System.out.println("Nomor telepon : " + mahasiswa[i].telepon);
                System.out.println("=========================================");
            }
        }
    }

    void update() {
        if (this.index == 0) {
            System.err.println("Tidak dapat mengupdate, data masih kosong");
        } else {
            System.out.println("========================Update Data=============================");
            System.out.print("Nama mahasiswa yang akan diupdate : ");
            String update = input.next();
            int index_ketemu = cariData(update);
            if (index_ketemu != -1) {
                System.out.println("ID dosen wali : " + mahasiswa[index_ketemu].id_dosen_wali);
                System.out.println("NPM mahasiswa : " + mahasiswa[index_ketemu].npm);
                System.out.println("Alamat : " + mahasiswa[index_ketemu].alamat);
                System.out.println("Nomor telepon : " + mahasiswa[index_ketemu].telepon);
                System.out.println("=============Diupdate menjadi============");
                System.out.print("ID dosen wali : ");
                String id = input.next();
                System.out.print("NPM mahasiswa : ");
                String npm = input.next();
                System.out.print("Nama mahasiswa : ");
                String nama = input.next();
                System.out.print("Alamat : ");
                String alamat = input.next();
                System.out.print("Nomor telepon : ");
                String telepon = input.next();
                mahasiswa[index_ketemu].id_dosen_wali = id;
                mahasiswa[index_ketemu].nama = npm;
                mahasiswa[index_ketemu].npm = nama;
                mahasiswa[index_ketemu].alamat = alamat;
                mahasiswa[index_ketemu].telepon = telepon;
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
            System.out.print("Nama mahasiswa yang akan dihapus : ");
            String hapus = input.next();
            int index_ketemu = cariData(hapus);
            if (index_ketemu != -1) {
                for (int i = index_ketemu; i < index; i++) {
                    if (hapus.equals(mahasiswa[i].nama)) {
                        for (int j = i; j < index; j++) {
                            if (j != index - 1) {
                                mahasiswa[j].id_dosen_wali = mahasiswa[j + 1].id_dosen_wali;
                                mahasiswa[j].npm = mahasiswa[j + 1].npm;
                                mahasiswa[j].nama = mahasiswa[j + 1].nama;
                                mahasiswa[j].alamat = mahasiswa[j + 1].alamat;
                                mahasiswa[j].telepon = mahasiswa[j + 1].telepon;
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
            if (cari.equals(mahasiswa[i].nama)) {
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
