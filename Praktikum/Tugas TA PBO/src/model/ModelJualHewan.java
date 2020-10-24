package model;

import javax.swing.table.*;

public class ModelJualHewan {

    public JualHewan[] data_penjualan = new JualHewan[100];
    private int index = 0;

    public void insert(String id, String nama, int harga_beli, String tgl_beli,
            int harga_jual, String tgl_jual, int untung) {
        data_penjualan[index] = new JualHewan(id, nama, harga_beli, tgl_beli, harga_jual, tgl_jual, untung);
        index++;
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_jual_hewan = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model_jual_hewan.addColumn("ID Hewan");
        model_jual_hewan.addColumn("Nama Hewan");
        model_jual_hewan.addColumn("Harga Beli");
        model_jual_hewan.addColumn("Tanggal Beli");
        model_jual_hewan.addColumn("Harga Jual");
        model_jual_hewan.addColumn("Tanggal Jual");
        model_jual_hewan.addColumn("Keuntungan");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[7];
            temp[0] = data_penjualan[i].getId();
            temp[1] = data_penjualan[i].getNama();
            temp[2] = data_penjualan[i].getHargaBeli();
            temp[3] = data_penjualan[i].getTanggalBeli();
            temp[4] = data_penjualan[i].getHargaJual();
            temp[5] = data_penjualan[i].getTanggalJual();
            temp[6] = data_penjualan[i].getUntung();
            model_jual_hewan.addRow(temp);
        }
        return model_jual_hewan;
    }

}
