package pertemuan1q;

public class Pertemuan1q {

    static class BangunDatar {

        int panjang = 5;
        int lebar = 2;

        void luas() {
            int LUAS = panjang * lebar;
            System.out.println("Luas adalah " + LUAS);
        }

        void keliling() {
            int kll = panjang * lebar * 2;
            System.out.println("Keliling adalah " + kll);
        }

        void luasSegitiga() {
            double luasSegitiga = panjang * lebar / 2;
            System.out.println("Luas segitiga adalah " + luasSegitiga);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar persegipanjang = new BangunDatar();
        persegipanjang.luas();
        persegipanjang.keliling();

        BangunDatar segitiga = new BangunDatar();
        segitiga.panjang = 10;
        segitiga.lebar = 5;
        segitiga.luasSegitiga();
    }
}
