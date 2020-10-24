package modul4asistensi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] username = new String[10];
        String[] password = new String[10];
        Siswa implementasi = new Siswa();
        ModelSiswa siswa = new ModelSiswa();
        int index = 0, pilihan;
        do {
            implementasi.defineName();
            System.out.println("===================== Program Data Siswa =======================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Close Program");
            System.out.print("Pilih menu nomor : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("======================= Register Admin =========================");
                    System.out.print("Masukkan username baru : ");
                    username[index] = input.next();
                    System.out.print("Masukkan password baru : ");
                    password[index] = input.next();
                    index++;
                    pilihan = 5;
                    break;
                case 2:
                    boolean ketemu = false;
                    System.out.println("========================= Login Admin ==========================");
                    System.out.print("Username : ");
                    String us = input.next();
                    System.out.print("Password : ");
                    String pw = input.next();
                    for (int i = 0; i < index; i++) {
                        if (us.equals(username[i]) && pw.equals(password[i])) {
                            ketemu = true;
                        }
                    }
                    if (ketemu == true) {
                        do {
                            System.out.println("1. Insert");
                            System.out.println("2. View");
                            System.out.println("3. Update");
                            System.out.println("4. Delete");
                            System.out.println("5. Logout");
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
                            }
                        } while (pilihan != 5);
                    } else {
                        System.err.println("Username atau password belum terdaftar, silahkan register terlebih dahulu");
                        pilihan = 5;
                    }
                    break;
            }
        } while (pilihan == 5);
    }
}
