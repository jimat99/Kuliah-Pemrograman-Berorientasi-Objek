package modul3praktikum;

class Inggris extends Bahasa {

    String[] kamus = new String[3];

    public Inggris(String kata) {
        super.kata = kata;
        kamus[0] = "white";
        kamus[1] = "black";
    }

    String keIndonesia() {
        if (kata.equals(kamus[0])) {
            kata = kamus[0] + " : putih \nEx : Putih adalah warna";
        } else if (kata.equals(kamus[1])) {
            kata = kamus[1] + " : hitam \nEx : Hitam adalah warna";
        } else {
            kata = "Word in dictionary not found";
        }
        return kata;
    }
}
