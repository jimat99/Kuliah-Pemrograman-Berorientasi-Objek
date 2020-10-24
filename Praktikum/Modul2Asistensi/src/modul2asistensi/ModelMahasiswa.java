package modul2asistensi;

import java.util.Scanner;

public class ModelMahasiswa {

    Scanner input = new Scanner(System.in);
    int index = 0;
    NodeMahasiswa[] mahasiswa = new NodeMahasiswa[10];

    void inputArray() {
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
        mahasiswa[index] = new NodeMahasiswa(nama, npm, matkul, ets, eas);
        this.index++;
    }

    void tampilkanArray() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NPM : " + mahasiswa[i].npm);
            System.out.println("Mata Kuliah : " + mahasiswa[i].matkul);
            System.out.println("Nilai ETS : " + mahasiswa[i].nilai_ets);
            System.out.println("Nilai EAS : " + mahasiswa[i].nilai_eas);
            System.out.println("Nilai akhir : " + mahasiswa[i].nilai_akhir);
        }
    }
}
