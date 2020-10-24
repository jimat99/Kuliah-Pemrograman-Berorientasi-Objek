
package pertemuan8q;

class ModelPegawai {

    Pegawai[] data_pegawai = new Pegawai[100];
    private int index;
    
    public void insert(String nip,Pekerjaan[] pk,int n){
        Pegawai temp_pegawai = new Pegawai();
        temp_pegawai.insertNIP(nip);
        temp_pegawai.insertPekerjaan(pk);
        temp_pegawai.insertIndexPekerjaan(n);
        data_pegawai[index] = temp_pegawai;
        index++;
        
        // di bawah adalah cara pertemuan 6
        //data_pegawai[index] = new Pegawai();
    }
    
    public void view(){
        for(int i=0; i<index; i++){
            System.out.println("NIP pegawai : "+data_pegawai[i].getNIP());
            System.out.println("===========Data Pekerjaan===========");
            data_pegawai[i].viewPekerjaan();
        }
    }
    
}
