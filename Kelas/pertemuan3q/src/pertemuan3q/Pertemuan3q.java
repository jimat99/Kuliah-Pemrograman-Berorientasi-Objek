package pertemuan3q;

import java.util.Scanner;

public class Pertemuan3q {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input output class lingkaran
//        System.out.print("Masukkan jari-jari : ");
//        int jari = input.nextInt();
//        lingkaran ling = new lingkaran(jari);
//        double keliling = ling.keliling();
//        System.out.ran adalah : "+keliling);
//        System.out.println("Luas lingkaran adalah : "+ling.luas());
//        
//        double[] hasil = new double[2];
//        hasil = ling.proses();
//        System.out.println("Keliling lingkaran adalah : "+hasil[0]);
//        System.out.println("Luas lingkaran adalah : "+hasil[1]);
        //input output tabung
        tabung[] tbg = new tabung[3];
        tbg[0] = new tabung(5, 10);
        tbg[1] = new tabung(7, 4);
        tbg[2] = new tabung(3, 12);

        System.out.println("Volume tabung 1 adalah : " + tbg[0].volume());
        System.out.println("Volume tabung 2 adalah : " + tbg[1].volume());
        System.out.println("Volume tabung 3 adalah : " + tbg[2].volume());

        //input output balok
        balok blk = new balok(2, 4, 10);
        System.out.println("Volume balok adalah : " + blk.volume());
    }
}
