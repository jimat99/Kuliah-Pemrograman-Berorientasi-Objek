package model;

import javax.swing.table.*;

public class ModelLaporanBeli {

    public BeliHewan[] data_laporan_beli = new BeliHewan[1000];
    private int index = 0;

    public void insert(String id, String nama, String umur, int harga_beli, String tgl_beli) {
        data_laporan_beli[index] = new BeliHewan(id, nama, umur, harga_beli, tgl_beli);
        index++;
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_laporan_beli = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model_laporan_beli.addColumn("ID Hewan");
        model_laporan_beli.addColumn("Nama Hewan");
        model_laporan_beli.addColumn("Umur Hewan");
        model_laporan_beli.addColumn("Harga Beli");
        model_laporan_beli.addColumn("Tanggal Beli");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[5];
            temp[0] = data_laporan_beli[i].getId();
            temp[1] = data_laporan_beli[i].getNama();
            temp[2] = data_laporan_beli[i].getUmur();
            temp[3] = data_laporan_beli[i].getHargaBeli();
            temp[4] = data_laporan_beli[i].getTanggalBeli();
            model_laporan_beli.addRow(temp);
        }
        return model_laporan_beli;
    }
}
