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
public class pekerjaan {

    private String noPekerjaan;
    private String namaPekerjaan;
    private int harga;

    public pekerjaan(String no, String nama, int harga) {
        this.noPekerjaan = no;
        this.namaPekerjaan = nama;
        this.harga = harga;
    }

    public String getNoPekerjaan() {
        return noPekerjaan;
    }

    public String getNamaPekerjaan() {
        return namaPekerjaan;
    }

    public int getHarga() {
        return harga;
    }
}
