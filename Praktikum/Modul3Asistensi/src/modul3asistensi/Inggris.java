package modul3asistensi;

import java.util.ArrayList;

class Inggris extends Bahasa {

    ArrayList<String> kamus = new ArrayList<String>();

    public Inggris(String kata) {
        super.kata = kata;
        kamus.add("white");
        kamus.add("black");
    }

    String keIndonesia() {
        if (kata.equals(kamus.get(0))) {
            kata = kamus.get(0) + " : putih \nEx : Putih adalah warna";
        } else if (kata.equals(kamus.get(1))) {
            kata = kamus.get(1) + " : hitam \nEx : Hitam adalah warna";
        } else {
            kata = "Word in dictionary not found";
        }
        return kata;
    }

}
