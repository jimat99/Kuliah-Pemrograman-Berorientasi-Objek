package pertemuan5;

import java.util.Scanner;

public class Proses {

    Scanner input = new Scanner(System.in);

    void menu() {
        ModelMahasiswa mahasiswa = new ModelMahasiswa();
        ModelDosen dosen = new ModelDosen();
        int pilih, pilihan = 0;
        do {
            System.out.println("================================================================");
            System.out.println("1. Dosen");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Close Program");
            System.out.print("Pilih menu nomor : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    String ulang_dosen;
                    do {
                        System.out.println("================================================================");
                        ulang_dosen = "ulang";
                        System.out.println("1. Insert Data Dosen");
                        System.out.println("2. Cetak Data Dosen");
                        System.out.println("3. Update Data Dosen");
                        System.out.println("4. Hapus Data Dosen");
                        System.out.println("5. Kembali ke Menu Awal");
                        System.out.println("6. Close Program");
                        System.out.print("Pilih menu nomor : ");
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 1:
                                while (ulang_dosen.equals("ulang")) {
                                    dosen.insert();
                                    System.out.print("Ulang insert/kembali ke menu dosen (ulang/kembali) ? ");
                                    ulang_dosen = input.next();
                                }
                                break;
                            case 2:
                                dosen.view();
                                ulang_dosen = "kembali";
                            case 3:
                                while (ulang_dosen.equals("ulang")) {
                                    int index = dosen.getIndex();
                                    if (index == 0) {
                                        dosen.update();
                                        ulang_dosen = "kembali";
                                    } else {
                                        dosen.update();
                                        System.out.print("Ulang update/kembali ke menu dosen (ulang/kembali) ? ");
                                        ulang_dosen = input.next();
                                    }
                                }
                            case 4:
                                while (ulang_dosen.equals("ulang")) {
                                    int index = dosen.getIndex();
                                    if (index == 0) {
                                        dosen.delete();
                                        ulang_dosen = "kembali";
                                    } else {
                                        dosen.delete();
                                        System.out.print("Ulang hapus/kembali ke menu dosen (ulang/kembali) ? ");
                                        ulang_dosen = input.next();
                                    }
                                }
                        }
                    } while (ulang_dosen.equals("kembali"));
                    break;
                case 2:
                    String ulang_mahasiswa;
                    do {
                        System.out.println("================================================================");
                        ulang_mahasiswa = "ulang";
                        System.out.println("1. Insert Data Mahasiswa");
                        System.out.println("2. Cetak Data Mahasiswa");
                        System.out.println("3. Update Data Mahasiswa");
                        System.out.println("4. Hapus Data Mahasiswa");
                        System.out.println("5. Kembali ke Menu Awal");
                        System.out.println("6. Close Program");
                        System.out.print("Pilih menu nomor : ");
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 1:
                                while (ulang_mahasiswa.equals("ulang")) {
                                    mahasiswa.insert();
                                    System.out.print("Ulang insert/kembali ke menu mahasiswa (ulang/kembali) ? ");
                                    ulang_mahasiswa = input.next();
                                }
                                break;
                            case 2:
                                mahasiswa.view();
                                ulang_mahasiswa = "kembali";
                            case 3:
                                while (ulang_mahasiswa.equals("ulang")) {
                                    int index = mahasiswa.getIndex();
                                    if (index == 0) {
                                        mahasiswa.update();
                                        ulang_mahasiswa = "kembali";
                                    } else {
                                        mahasiswa.update();
                                        System.out.print("Ulang update/kembali ke menu mahasiswa (ulang/kembali) ? ");
                                        ulang_mahasiswa = input.next();
                                    }
                                }
                            case 4:
                                while (ulang_mahasiswa.equals("ulang")) {
                                    int index = mahasiswa.getIndex();
                                    if (index == 0) {
                                        mahasiswa.delete();
                                        ulang_mahasiswa = "kembali";
                                    } else {
                                        mahasiswa.delete();
                                        System.out.print("Ulang hapus/kembali ke menu mahasiswa (ulang/kembali) ? ");
                                        ulang_mahasiswa = input.next();
                                    }
                                }
                        }
                    } while (ulang_mahasiswa.equals("kembali"));
                    break;
                case 3:
                    pilihan = 0;
                    break;
            }
        } while (pilihan == 5);
    }

}
