package modul3praktikum;

class Indonesia extends Bahasa {

    String[] kamus = new String[3];

    public Indonesia(String kata) {
        super.kata = kata;
        kamus[0] = "putih";
        kamus[1] = "hitam";
    }

    String keInggris() {
        if (kata.equals(kamus[0])) {
            kata = kamus[0] + " : white \nEx : White is a color";
        } else if (kata.equals(kamus[1])) {
            kata = kamus[1] + " : black \nEx : Black is a color";
        } else {
            kata = "Kata dalam kamus tidak ada";
        }
        return kata;
    }
}
