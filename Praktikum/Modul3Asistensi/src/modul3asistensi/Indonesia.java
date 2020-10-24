package modul3asistensi;

import java.util.ArrayList;

class Indonesia extends Bahasa {

    ArrayList<String> kamus = new ArrayList<String>();

    public Indonesia(String kata) {
        super.kata = kata;
        kamus.add("putih");
        kamus.add("hitam");
    }

    String keInggris() {
        if (kata.equals(kamus.get(0))) {
            kata = kamus.get(0) + " : white \nEx : White is a color";
        } else if (kata.equals(kamus.get(1))) {
            kata = kamus.get(1) + " : black \nEx : Black is a color";
        } else {
            kata = "Kata dalam kamus tidak ada";
        }
        return kata;
    }

}
