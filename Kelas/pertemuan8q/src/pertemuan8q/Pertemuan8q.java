package pertemuan8q;

import java.util.Scanner;

public class Pertemuan8q {

    public static void main(String[] args) {
        AllObject.data_pekerjaan.insert("Pekerjaan 1", "Cangkul", 3000);
        AllObject.data_pekerjaan.insert("Pekerjaan 2", "Menanam", 4000);
        AllObject.data_pekerjaan.insert("Pekerjaan 3", "Memanen", 5000);
        AllObject.data_pekerjaan.insert("Pekerjaan 4", "Membajak", 6000);

        new FramePekerjaan().setVisible(true);

//        Scanner input = new Scanner(System.in);
//        ModelPekerjaan pekerjaan = new ModelPekerjaan();
//        pekerjaan.insert("Pekerjaan 1","Cangkul",3000);
//        pekerjaan.insert("Pekerjaan 2","Menanam",4000);
//        pekerjaan.insert("Pekerjaan 3","Memanen",5000);
//        pekerjaan.insert("Pekerjaan 4","Membajak",5000);
//        pekerjaan.view();
//        
//        System.out.println("========Tes Pegawai========");
//        ModelPegawai pegawai = new ModelPegawai();
//        String nip = "NIP 01";
//        int n = 2;
//        Pekerjaan[] array_pk = new Pekerjaan[n];
//        for(int i=0; i<n; i++){
//            System.out.print("Masukkan nomor pekerjaan : ");
//            String nomor = input.nextLine();
//            Pekerjaan pk = pekerjaan.searchObjek(nomor);
//            array_pk[i] = pk;
//        }
//        pegawai.insert(nip, array_pk, n);
//        
//        String nip2 = "NIP 02";
//        int n2 = 3;
//        Pekerjaan[] array_pk2 = new Pekerjaan[n2];
//        for(int i=0; i<n2; i++){
//            System.out.print("Masukkan nomor pekerjaan : ");
//            String nomor = input.nextLine();
//            Pekerjaan pk2 = pekerjaan.searchObjek(nomor);
//            array_pk2[i] = pk2;
//        }
//        pegawai.insert(nip2, array_pk2, n2);
//        
//        pegawai.view();
    }

}
