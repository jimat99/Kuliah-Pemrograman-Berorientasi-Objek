package modul4asistensi;

class Siswa extends Manusia implements Sekolah {

    String id;

    public Siswa() {

    }

    public Siswa(String id, String nama, String alamat, String jk) {
        this.id = id;
        super.nama = nama;
        super.alamat = alamat;
        super.jenis_kelamin = jk;
    }

    @Override
    public void defineName() {
        System.out.println(nama_sekolah);
    }

}
