/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan82;

/**
 *
 * @author kurniawan
 */
public class pegawai extends Manusia {

    private String nip;
    private pekerjaan[] pk;
    private int indexPekerjaan;

    public pegawai() {

    }

    public pegawai(String nip) {
        this.nip = nip;
    }

//    public pegawai(String nip,pekerjaan [] pk)
//    {
//        this.nip=nip;
//        this.pk=pk;
//    }
    public void insertNIP(String nip) {
        this.nip = nip;
    }

    public void insertPekerjaan(pekerjaan[] pek) {
        this.pk = pek;
    }

    public void insertIndexPekerjaan(int n) {
        this.indexPekerjaan = n;
    }

    public void viewPekerjaan() {
        for (int i = 0; i < indexPekerjaan; i++) {
            System.out.println("no pekerjaan :" + pk[i].getNoPekerjaan());
            System.out.println("nama pekerjaan :" + pk[i].getNamaPekerjaan());
            System.out.println("harga pekerjaan :" + pk[i].getHarga());
        }
    }

    public String getNIP() {
        return nip;
    }
}
