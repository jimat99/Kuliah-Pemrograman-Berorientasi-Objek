package modul4praktikum;

import java.util.Scanner;

class ModelSiswa {

    Scanner input = new Scanner(System.in);
    Siswa[] siswa = new Siswa[10];
    int index = 0;

    void insert() {
        System.out.println("======================= Insert Data ============================");
        System.out.print("ID siswa : ");
        String id = input.next();
        System.out.print("Nama siswa : ");
        String nama = input.next();
        System.out.print("Alamat : ");
        String alamat = input.next();
        System.out.print("Jenis kelamin : ");
        String jk = input.next();
        siswa[index] = new Siswa(id, nama, alamat, jk);
        index++;
    }

    void view() {
        if (this.index == 0) {
            System.err.println("Data masih kosong");
        } else {
            System.out.println("======================== Data Siswa ============================");
            for (int i = 0; i < index; i++) {
                System.out.println("ID siswa : " + siswa[i].id);
                System.out.println("Nama siswa : " + siswa[i].nama);
                System.out.println("Alamat : " + siswa[i].alamat);
                System.out.println("Jenis kelamin : " + siswa[i].jenis_kelamin);
                System.out.println("================================================================");
            }
        }
    }

    void update() {
        if (this.index == 0) {
            System.err.println("Tidak dapat mengupdate, data masih kosong");
        } else {
            System.out.println("======================= Update Data ============================");
            System.out.print("Nama siswa yang akan diupdate : ");
            String update = input.next();
            int index_ketemu = cariIndexData(update);
            if (index_ketemu != -1) {
                System.out.println("ID siswa : " + siswa[index_ketemu].id);
                System.out.println("Alamat : " + siswa[index_ketemu].alamat);
                System.out.println("Jenis kelamin : " + siswa[index_ketemu].jenis_kelamin);
                System.out.println("===================== Diupdate Menjadi =========================");
                System.out.print("ID siswa : ");
                String id = input.next();
                System.out.print("Nama siswa : ");
                String nama = input.next();
                System.out.print("Alamat : ");
                String alamat = input.next();
                System.out.print("Jenis kelamin : ");
                String jk = input.next();
                siswa[index_ketemu].id = id;
                siswa[index_ketemu].nama = nama;
                siswa[index_ketemu].alamat = alamat;
                siswa[index_ketemu].jenis_kelamin = jk;
                System.out.println("Data berhasil diupdate");
            } else {
                System.err.println("Data yang ingin diupdate tidak ditemukan");
            }
        }
    }

    void delete() {
        if (this.index == 0) {
            System.err.println("Tidak dapat menghapus, data masih kosong");
        } else {
            System.out.println("======================== Hapus Data ============================");
            System.out.print("Nama siswa yang akan dihapus : ");
            String hapus = input.next();
            int index_ketemu = cariIndexData(hapus);
            if (index_ketemu != -1) {
                for (int i = index_ketemu; i < index; i++) {
                    if (hapus.equals(siswa[i].nama)) {
                        for (int j = i; j < index; j++) {
                            if (j != index - 1) {
                                siswa[j].id = siswa[j + 1].id;
                                siswa[j].nama = siswa[j + 1].nama;
                                siswa[j].alamat = siswa[j + 1].alamat;
                                siswa[j].jenis_kelamin = siswa[j + 1].jenis_kelamin;
                            }
                        }
                        System.out.println("Data berhasil dihapus");
                        index--;
                    }
                }
            } else {
                System.err.println("Data yang ingin dihapus tidak ditemukan");
            }
        }
    }

    int cariIndexData(String cari) {
        boolean ketemu = false;
        int index = 0;
        for (int i = 0; i < this.index; i++) {
            if (cari.equals(siswa[i].nama)) {
                ketemu = true;
                index = i;
            } else if (ketemu == false && i == this.index - 1) {
                index = -1;
            }
        }
        return index;
    }

}
