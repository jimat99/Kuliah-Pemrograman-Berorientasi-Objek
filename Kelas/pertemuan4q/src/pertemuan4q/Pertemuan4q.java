package pertemuan4q;

import java.util.Scanner;

public class Pertemuan4q {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[10];

        System.out.print("Masukkan banyak data : ");
        int data = input.nextInt();
        System.out.println("===== Input Data =====");
        for (int i = 0; i < data; i++) {
            System.out.print("NPM mahasiswa ke-" + (i + 1) + " : ");
            int npm = input.nextInt();
            System.out.print("Nama mahasiswa ke-" + (i + 1) + " : ");
            String nama = input.next();
            System.out.print("Nilai UTS mahasiswa ke-" + (i + 1) + " : ");
            int nilai_uts = input.nextInt();
            System.out.print("Nilai UAS mahasiswa ke-" + (i + 1) + " : ");
            int nilai_uas = input.nextInt();
            mahasiswa[i] = new Mahasiswa(nama, npm, nilai_uts, nilai_uas);
        }
        System.out.println("===== Cetak Data =====");
        for (int i = 0; i < data; i++) {
            System.out.println("NPM mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i].npm);
            System.out.println("Nama mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i].nama);
            System.out.println("Nilai UTS mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i].nilai_uts);
            System.out.println("Nilai UAS mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i].nilai_uas);
            System.out.println("NAS mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i].nas);
        }
    }
}
