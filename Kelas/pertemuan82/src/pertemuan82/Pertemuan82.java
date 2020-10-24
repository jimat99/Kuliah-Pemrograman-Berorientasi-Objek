/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan82;

import java.util.Scanner;

/**
 *
 * @author kurniawan
 */
public class Pertemuan82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelPekerjaan pekerjaan = new modelPekerjaan();
        pekerjaan.insert("pekerjaan 1", "cangkul", 3000);
        pekerjaan.insert("pekerjaan 2", "menanam", 4000);
        pekerjaan.insert("pekerjaan 3", "memanen", 5000);
        pekerjaan.insert("pekerjaan 4", "membajak", 6000);
        pekerjaan.view();
        System.out.println("===== TES PEGAwai +++++++++");
        modelPegawai pegawai = new modelPegawai();
        String nip = "fiki";
        String nama = "futaikhi";
        int tglLahir = 25011998;
        int n = 2;
        pekerjaan[] arrayPk = new pekerjaan[n];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            // System.out.print("masukkan nomer pekerjaan :" );
            // String nomer=inp.nextLine();
            pekerjaan pk = pekerjaan.searchObj("pekerjaan " + (i + 1));
            arrayPk[i] = pk;
        }
        pegawai.insert(nip, arrayPk, n, nama, tglLahir);
        new Login(pegawai).setVisible(true);

        //     String nip2="nip 02";
        //     int n2=3;
        //     pekerjaan []arrayPk2=new pekerjaan[n2];
        //     for (int i=0;i<n2;i++)
        //     {
        //         System.out.print("masukkan nomer pekerjaan :" );
        //         String nomer=inp.nextLine();
        //         pekerjaan pk2=pekerjaan.searchObj(nomer);
        //         arrayPk2[i]=pk2;
        //     }
        //     pegawai.insert(nip2, arrayPk2, n2);
        //    pegawai.view();
    }

}
