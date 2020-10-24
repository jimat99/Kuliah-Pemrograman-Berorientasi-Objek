package pertemuan4A;

public class ModelMahasiswa {

    int index = 0;

    NodeMahasiswa[] mahasiswa = new NodeMahasiswa[10];

    void insert(String a, int b, int c, int d) {
        mahasiswa[index] = new NodeMahasiswa(a, b, c, d);
        index++;
    }

    void update(String a, int b, int c, int d, String e) {
        for (int i = 0; i < index; i++) {
            if (e.equals(mahasiswa[i].nama)) {
                mahasiswa[i].nama = a;
                mahasiswa[i].npm = b;
                mahasiswa[i].nilai_uts = c;
                mahasiswa[i].nilai_uas = d;
                mahasiswa[i].nas = (c + d) / 2;
            }
        }
    }

    void delete(String hapus) {
        boolean ketemu = false;
        for (int i = 0; i < index; i++) {
            if (hapus.equals(mahasiswa[i].nama)) {
                ketemu = true;
                System.out.println("Data telah dihapus");
                for (int j = i; j < index; j++) {
                    if (j != index - 1) {
                        mahasiswa[j].nama = mahasiswa[j + 1].nama;
                        mahasiswa[j].npm = mahasiswa[j + 1].npm;
                        mahasiswa[j].nilai_uts = mahasiswa[j + 1].nilai_uts;
                        mahasiswa[j].nilai_uas = mahasiswa[j + 1].nilai_uas;
                        mahasiswa[j].nas = mahasiswa[j + 1].nas;
                    }
                }
                index--;
            } else if (ketemu == false && i == index - 1) {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    void view() {
        for (int i = 0; i < index; i++) {
            System.out.println("NPM Mahasiswa : " + mahasiswa[i].npm);
            System.out.println("Nama Mahasiswa : " + mahasiswa[i].nama);
            System.out.println("Nilai UTS : " + mahasiswa[i].nilai_uts);
            System.out.println("Nilai UAS : " + mahasiswa[i].nilai_uas);
            System.out.println("NAS : " + mahasiswa[i].nas);
            System.out.println("=================================");
        }
    }

}
