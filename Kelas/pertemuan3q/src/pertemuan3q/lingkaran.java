package pertemuan3q;

public class lingkaran {

    int r;
    double phi = 3.14;

    public lingkaran(int a) {
        this.r = a;
    }

    double keliling() {
        double kll = 2 * phi * r;
        return kll;
    }

    double luas() {
        double luas = phi * r * r;
        return luas;
    }

    double[] proses() {
        double kll = 2 * phi * r;
        double luas = phi * r * r;
        double[] hasil = new double[2];
        hasil[0] = kll;
        hasil[1] = luas;
        return hasil;
    }
}
