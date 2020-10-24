package modul4praktikum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Siswa implementasi = new Siswa();
        ModelSiswa siswa = new ModelSiswa();
        int pilih, pilihan = 0;
        do {
            implementasi.defineName();
            System.out.println("===================== Program Data Siswa =======================");
            System.out.println("1. Insert");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Close Program");
            System.out.print("Pilih menu nomor : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    siswa.insert();
                    break;
                case 2:
                    siswa.view();
                    break;
                case 3:
                    siswa.update();
                    break;
                case 4:
                    siswa.delete();
                    break;
                case 5:
                    pilihan = 0;
                    break;
            }
        } while (pilihan != 0);
    }

}
