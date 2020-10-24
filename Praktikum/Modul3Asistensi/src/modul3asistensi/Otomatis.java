package modul3asistensi;

import java.util.ArrayList;

class Otomatis extends Bahasa {

    ArrayList<String> kamus = new ArrayList<String>();

    public Otomatis(String kata) {
        super.kata = kata;
        kamus.add("white");
        kamus.add("black");
        kamus.add("putih");
        kamus.add("hitam");
    }

    String terjemahkan() {
        if (kata.equals(kamus.get(0))) {
            kata = kamus.get(0) + " : putih \nEx : Putih adalah warna";
        } else if (kata.equals(kamus.get(1))) {
            kata = kamus.get(1) + " : hitam \nEx : Hitam adalah warna";
        } else if (kata.equals(kamus.get(2))) {
            kata = kamus.get(2) + " : white \nEx : White is a color";
        } else if (kata.equals(kamus.get(3))) {
            kata = kamus.get(3) + " : black \nEx : Black is a color";
        } else {
            kata = "Kata dalam kamus tidak ada";
        }
        return kata;
    }

}
