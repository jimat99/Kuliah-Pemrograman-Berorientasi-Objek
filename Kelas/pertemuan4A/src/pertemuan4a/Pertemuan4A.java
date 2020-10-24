package pertemuan4A;

import java.util.Scanner;

public class Pertemuan4A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ModelMahasiswa mahasiswa_main = new ModelMahasiswa();

        char ulang = 'y';
        while (ulang == 'y') {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. View");
            System.out.print("Pilih menu nomor : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("NPM mahasiswa : ");
                    int npm = input.nextInt();
                    System.out.print("Nama mahasiswa : ");
                    String nama = input.next();
                    System.out.print("Nilai UTS mahasiswa : ");
                    int nilai_uts = input.nextInt();
                    System.out.print("Nilai UAS mahasiswa : ");
                    int nilai_uas = input.nextInt();
                    mahasiswa_main.insert(nama, npm, nilai_uts, nilai_uas);
                    break;
                case 2:
                    System.out.print("Nama mahasiswa yang akan diupdate : ");
                    String update = input.next();
                    System.out.println("=====Diupdate Menjadi=====");
                    System.out.print("NPM mahasiswa : ");
                    int npm2 = input.nextInt();
                    System.out.print("Nama mahasiswa : ");
                    String nama2 = input.next();
                    System.out.print("Nilai UTS mahasiswa : ");
                    int nilai_uts2 = input.nextInt();
                    System.out.print("Nilai UAS mahasiswa : ");
                    int nilai_uas2 = input.nextInt();
                    mahasiswa_main.update(nama2, npm2, nilai_uts2, nilai_uas2, update);
                    break;
                case 3:
                    System.out.print("Nama mahasiswa yang akan dihapus : ");
                    String hapus = input.next();
                    mahasiswa_main.delete(hapus);
                    break;
                case 4:
                    System.out.println("=====View Data=====");
                    mahasiswa_main.view();
                    break;
            }
            System.out.print("Ulang program (y/t) ? ");
            ulang = input.next().charAt(0);
        }
    }
}
