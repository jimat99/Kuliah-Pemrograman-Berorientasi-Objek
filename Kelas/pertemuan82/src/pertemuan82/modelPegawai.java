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
public class modelPegawai {

    private pegawai[] dataPegawai = new pegawai[100];
    private int index = 0;

    public void insert(String nip, pekerjaan[] pk, int n, String nama, int tglLahir) {
        pegawai tempPeg = new pegawai();
        tempPeg.insertNIP(nip);
        tempPeg.insertPekerjaan(pk);
        tempPeg.insertIndexPekerjaan(n);
        tempPeg.setNama(nama);
        tempPeg.setTglLahir(tglLahir);
        dataPegawai[index] = tempPeg;
        index++;
    }

    public void view() {
        for (int i = 0; i < index; i++) {
            System.out.println("nip pegawai =" + dataPegawai[i].getNIP());
            System.out.println("====DATA PEKERJAAN=======");
            dataPegawai[i].viewPekerjaan();
            System.out.println("=========================");
        }
    }

    public pegawai login(String nip, int tglLahir) {
        for (int i = 0; i < index; i++) {
            if (nip.equals(dataPegawai[i].getNIP()) && tglLahir == dataPegawai[i].getTglLahir()) {
                return dataPegawai[i];
            }
        }
        return null;
    }

    public void setNama(String nama) throws PegawaiException {
        int kata;
        for (char c : nama.toCharArray()) {
            kata = c;
            if (!((kata > 64 && kata < 91) || (kata > 96 && kata < 123))) {
                throw new PegawaiException("Nama harus menggunakan huruf");
            }
        }
    }
}
