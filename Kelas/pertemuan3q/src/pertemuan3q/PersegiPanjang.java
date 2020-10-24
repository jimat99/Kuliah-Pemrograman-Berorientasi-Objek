package pertemuan3q;

public class PersegiPanjang {

    int p;
    int l;

    public PersegiPanjang(int a, int b) {
        this.p = a;
        this.l = b;
    }

    int kll() {
        int kll = 2 * (p + l);
        return kll;
    }

    int luas() {
        int luas = p * l;
        return luas;
    }
}
