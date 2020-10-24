package model;

import javax.swing.table.*;

public class ModelBeliHewan {

    public BeliHewan[] data_pembelian = new BeliHewan[100];
    private int index = 0;

    public int getIndex() {
        return index;
    }

    public void insert(String id, String nama, String umur, int harga_beli, String tgl_beli) {
        data_pembelian[index] = new BeliHewan(id, nama, umur, harga_beli, tgl_beli);
        index++;
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_beli_hewan = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model_beli_hewan.addColumn("ID Hewan");
        model_beli_hewan.addColumn("Nama Hewan");
        model_beli_hewan.addColumn("Umur Hewan");
        model_beli_hewan.addColumn("Harga Beli");
        model_beli_hewan.addColumn("Tanggal Beli");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[5];
            temp[0] = data_pembelian[i].getId();
            temp[1] = data_pembelian[i].getNama();
            temp[2] = data_pembelian[i].getUmur();
            temp[3] = data_pembelian[i].getHargaBeli();
            temp[4] = data_pembelian[i].getTanggalBeli();
            model_beli_hewan.addRow(temp);
        }
        return model_beli_hewan;
    }

    public void deleteHewan(String id) {
        int index_ketemu = cariIndexData(id);
        if (index_ketemu != -1) {
            for (int i = index_ketemu; i < index; i++) {
                if (id.equals(data_pembelian[i].getId())) {
                    for (int j = i; j < index; j++) {
                        if (j != index - 1) {
                            data_pembelian[j].setId(data_pembelian[j + 1].getId());
                            data_pembelian[j].setNama(data_pembelian[j + 1].getNama());
                            data_pembelian[j].setUmur(data_pembelian[j + 1].getUmur());
                            data_pembelian[j].setHargaBeli(data_pembelian[j + 1].getHargaBeli());
                            data_pembelian[j].setTanggalBeli(data_pembelian[j + 1].getTanggalBeli());
                        }
                    }
                    index--;
                }
            }
        }

    }

    public int cariIndexData(String id) {
        boolean ketemu = false;
        int index = 0;
        for (int i = 0; i < this.index; i++) {
            if (id.equals(data_pembelian[i].getId())) {
                ketemu = true;
                index = i;
            } else if (ketemu == false && i == this.index - 1) {
                index = -1;
            }
        }
        return index;
    }

}
