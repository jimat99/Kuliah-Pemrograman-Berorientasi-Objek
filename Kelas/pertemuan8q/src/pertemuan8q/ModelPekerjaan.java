package pertemuan8q;

import javax.swing.table.*;

class ModelPekerjaan {

    private Pekerjaan[] data_pekerjaan = new Pekerjaan[100];
    private int index = 0;

    public void insert(String id, String nama, int harga) {
        data_pekerjaan[index] = new Pekerjaan(id, nama, harga);
        index++;
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_pekerjaan = new DefaultTableModel();
        model_pekerjaan.addColumn("Nomor Pekerjaan");
        model_pekerjaan.addColumn("Nama Pekerjaan");
        model_pekerjaan.addColumn("Gaji Pekerjaan");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[3];
            temp[0] = data_pekerjaan[i].getNoPekerjaan();
            temp[1] = data_pekerjaan[i].getNamaPekerjaan();
            temp[2] = data_pekerjaan[i].getHarga();
            model_pekerjaan.addRow(temp);
        }

        return model_pekerjaan;
    }

    public void view() {
        for (int i = 0; i < index; i++) {
            System.out.println("No pekerjaan : " + data_pekerjaan[i].getNoPekerjaan());
            System.out.println("Nama pekerjaan : " + data_pekerjaan[i].getNamaPekerjaan());
            System.out.println("Harga pekerjaan : " + data_pekerjaan[i].getHarga());
        }
    }

    public Pekerjaan searchObjek(String nomor) {
        Pekerjaan pk = null;
        for (int i = 0; i < index; i++) {
            if (nomor.equals(data_pekerjaan[i].getNoPekerjaan())) {
                pk = data_pekerjaan[i];
            }
        }

        return pk;
    }
}
