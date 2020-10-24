package pertemuan8q;

class Pegawai {

    private String nip;
    private Pekerjaan[] pk;
    private int index_pekerjaan;

    public Pegawai() {

    }

    public Pegawai(String nip) {
        this.nip = nip;
    }

//    public Pegawai(String nip,Pekerjaan[] pk){
//        this.nip = nip;
//        this.pk = pk;
//    }
    public void insertNIP(String nip) {
        this.nip = nip;
    }

    public void insertPekerjaan(Pekerjaan[] pek) {
        this.pk = pek;
    }

    public void insertIndexPekerjaan(int n) {
        this.index_pekerjaan = n;
    }

    public void viewPekerjaan() {
        for (int i = 0; i < index_pekerjaan; i++) {
            System.out.println("No pekerjaan : " + pk[i].getNoPekerjaan());
            System.out.println("Nama pekerjaan : " + pk[i].getNamaPekerjaan());
            System.out.println("Harga pekerjaan : " + pk[i].getHarga());
        }
    }

    public String getNIP() {
        return nip;
    }
}
