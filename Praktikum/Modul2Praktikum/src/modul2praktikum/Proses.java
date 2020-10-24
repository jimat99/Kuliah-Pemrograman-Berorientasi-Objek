package modul2praktikum;

import java.util.Scanner;

public class Proses {

    Scanner input = new Scanner(System.in);

    void menu() {
        Mahasiswa mahasiswa = new Mahasiswa();
        ModelMahasiswa mhs = new ModelMahasiswa();
        char ulang = 'y';
        do {
            System.out.println("1. Input Data Array");
            System.out.println("2. Tampilkan Data Array");
            System.out.println("3. Input Data Linked List");
            System.out.println("4. Hapus Data Linked List");
            System.out.println("5. Tampilkan Data Linked List");
            System.out.print("Pilih menu nomor : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    mhs.inputArray();
                    break;
                case 2:
                    mhs.tampilkanArray();
                    break;
                case 3:
                    mahasiswa.inputLinkList(mahasiswa);
                    break;
                case 4:
                    mahasiswa.hapusLinkList(mahasiswa);
                    break;
                case 5:
                    mahasiswa.tampilLinkList(mahasiswa);
                    break;
            }
            System.out.print("Ulang program (y/t) ? : ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y');
    }
}
