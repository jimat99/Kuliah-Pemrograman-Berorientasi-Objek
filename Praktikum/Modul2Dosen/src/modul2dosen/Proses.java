package modul2dosen;

import java.util.Scanner;

public class Proses {

    Scanner input = new Scanner(System.in);

    void menu() {
        Mahasiswa mahasiswa = new Mahasiswa();
        char ulang = 'y';
        do {
            System.out.println("1. Input Data Linked List");
            System.out.println("2. Hapus Data Linked List");
            System.out.println("3. Tampilkan Data Linked List dari Return Node");
            System.out.println("4. Tampilkan Data Linked List dari Return Array");
            System.out.print("Pilih menu nomor : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    mahasiswa.inputLinkList(mahasiswa);
                    break;
                case 2:
                    mahasiswa.hapusLinkList(mahasiswa);
                    break;
                case 3:
                    Mahasiswa.Node cetak;
                    cetak = mahasiswa.tampilLinkListReturn(mahasiswa);
                    System.out.println("=====Data Mahasiswa=====");
                    while (cetak != null) {
                        System.out.println("Nama : " + cetak.nama);
                        System.out.println("NPM : " + cetak.npm);
                        System.out.println("Mata Kuliah : " + cetak.matkul);
                        System.out.println("Nilai ETS : " + cetak.nilai_ets);
                        System.out.println("Nilai EAS : " + cetak.nilai_eas);
                        System.out.println("Nilai akhir : " + cetak.nilai_akhir);
                        System.out.println("==============================");
                        cetak = cetak.next;
                    }
                    break;
                case 4:
                    Mahasiswa.Node[] array;
                    array = mahasiswa.tampilLinkListReturnArray(mahasiswa);
                    int index = mahasiswa.getIndex();
                    for (int i = 0; i < index; i++) {
                        System.out.println("Nama : " + array[i].nama);
                        System.out.println("NPM : " + array[i].npm);
                        System.out.println("Mata Kuliah : " + array[i].matkul);
                        System.out.println("Nilai ETS : " + array[i].nilai_ets);
                        System.out.println("Nilai EAS : " + array[i].nilai_eas);
                        System.out.println("Nilai akhir : " + array[i].nilai_akhir);
                        System.out.println("==============================");
                    }
                    break;
            }
            System.out.print("Ulang program (y/t) ? : ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y');
    }
}
