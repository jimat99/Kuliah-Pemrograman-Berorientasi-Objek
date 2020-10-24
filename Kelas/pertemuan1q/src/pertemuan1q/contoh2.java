package pertemuan1q;

import java.util.Scanner;

public class contoh2 {

    static class Hero {

        int HP;
        int Damage;

        public Hero() {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai HP Hero : ");
            int a = input.nextInt();
            System.out.print("Masukkan nilai Damage Hero : ");
            int b = input.nextInt();

            this.HP = a;
            this.Damage = b;
            System.out.println("========================================");
        }

        void cetak() {
            System.out.println("HP = " + HP);
            System.out.println("Damage = " + Damage);
        }

        void up_level() {
            this.HP = this.HP + 10;
            this.Damage = this.Damage + 10;
        }
    }

    public static void main(String[] args) {

        System.out.println("Axe");
        Hero axe = new Hero();
        axe.cetak();
        axe.up_level();
        axe.cetak();

        System.out.println("Layla");
        Hero layla = new Hero();
        layla.cetak();
        layla.up_level();
        layla.cetak();
    }
}
