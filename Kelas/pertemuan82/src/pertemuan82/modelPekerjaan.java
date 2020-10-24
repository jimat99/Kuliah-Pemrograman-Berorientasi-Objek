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
public class modelPekerjaan {

    private pekerjaan[] dataPekerjaan = new pekerjaan[100];
    private int index = 0;

    public void insert(String no, String nama, int harga) {
        dataPekerjaan[index] = new pekerjaan(no, nama, harga);
        index++;
    }

    public void view() {
        for (int i = 0; i < index; i++) {
            System.out.println("no pekerjaan :" + dataPekerjaan[i].getNoPekerjaan());
            System.out.println("nama pekerjaan :" + dataPekerjaan[i].getNamaPekerjaan());
            System.out.println("harga pekerjaan :" + dataPekerjaan[i].getHarga());
        }
    }

    public pekerjaan searchObj(String nomer) {
        pekerjaan pk = null;
        for (int i = 0; i < index; i++) {
            if (nomer.equals(dataPekerjaan[i].getNoPekerjaan())) {
                pk = dataPekerjaan[i];
            }
        }

        return pk;
    }
}
