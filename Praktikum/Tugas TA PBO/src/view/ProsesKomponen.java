package view;

import model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import javax.swing.table.*;

public class ProsesKomponen extends SetKomponen {

    boolean is_frame_pegawai_aktif = false;
    boolean is_frame_pemilik_aktif = false;

    public ProsesKomponen() {
        // proses komponen
        menu_item_pemilik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pemilik_aktif = true;
                if (is_frame_pegawai_aktif == true) {
                    in_frame_pegawai.setVisible(false);
                    in_frame_pemilik.setVisible(true);
                } else {
                    in_frame_pemilik.setVisible(true);
                }
            }
        });

        menu_item_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pegawai_aktif = true;
                if (is_frame_pemilik_aktif == true) {
                    in_frame_pemilik.setVisible(false);
                    in_frame_pegawai.setVisible(true);
                } else {
                    in_frame_pegawai.setVisible(true);
                }
            }
        });

        menu_item_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button_beli_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text_id_kiri.getText().equals("") || text_nama_kiri.equals("")
                        || text_umur_kiri.getText().equals("") || text_harga_beli_kiri.getText().equals("")
                        || text_tanggal_beli_kiri.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Isi semua kolom isian terlebih dahulu", "Gagal Insert", WARNING_MESSAGE);
                } else {
                    String id = text_id_kiri.getText();
                    String nama = text_nama_kiri.getText();
                    String umur = text_umur_kiri.getText();
                    int harga_beli = Integer.parseInt(text_harga_beli_kiri.getText());
                    String tanggal_beli = text_tanggal_beli_kiri.getText();
                    AllObject.data_beli.insert(id, nama, umur, harga_beli, tanggal_beli);
                    AllObject.data_laporan_beli.insert(id, nama, umur, harga_beli, tanggal_beli);
                    tabel_beli.setModel(AllObject.data_beli.viewTabel());
                    tabel_beli2.setModel(AllObject.data_laporan_beli.viewTabel());
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                    refreshFieldBeli();
                }
            }
        });

        button_refresh_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshFieldBeli();
            }
        });

        button_cari_hewan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ketemu = false;
                if (AllObject.data_beli.getIndex() > 0) {
                    String id = text_id_kanan.getText();
                    int index_ketemu = AllObject.data_beli.cariIndexData(id);
                    for (int i = 0; i < AllObject.data_beli.getIndex(); i++) {
                        if (index_ketemu != -1) {
                            text_nama_kanan.setText(AllObject.data_beli.data_pembelian[index_ketemu].getNama());
                            text_harga_beli_kanan.setText(String.valueOf(AllObject.data_beli.data_pembelian[index_ketemu].getHargaBeli()));
                            text_tanggal_beli_kanan.setText(AllObject.data_beli.data_pembelian[index_ketemu].getTanggalBeli());
                            text_nama_kanan.setEnabled(true);
                            text_harga_beli_kanan.setEnabled(true);
                            text_tanggal_beli_kanan.setEnabled(true);
                            ketemu = true;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak ada hewan di dalam kandang",
                            "Peringatan", WARNING_MESSAGE);
                }
                if (!ketemu && AllObject.data_beli.getIndex() > 0) {
                    JOptionPane.showMessageDialog(null, "Hewan yang dicari tidak ditemukan, "
                            + "silahkan masukkan ID yang benar", "Peringatan", WARNING_MESSAGE);
                }
            }
        });

        button_jual_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total_untung = 0;
                String id = text_id_kanan.getText();
                String nama = text_nama_kanan.getText();
                int harga_beli = Integer.parseInt(text_harga_beli_kanan.getText());
                String tanggal_beli = text_tanggal_beli_kanan.getText();
                int harga_jual = Integer.parseInt(text_harga_jual_kanan.getText());
                String tanggal_jual = text_tanggal_jual_kanan.getText();
                int untung = Integer.parseInt(text_harga_jual_kanan.getText())
                        - Integer.parseInt(text_harga_beli_kanan.getText());
                AllObject.data_beli.deleteHewan(id);
                AllObject.data_jual.insert(id, nama, harga_beli, tanggal_beli, harga_jual, tanggal_jual, untung);
                tabel_beli.setModel(AllObject.data_beli.viewTabel());
                tabel_beli2.setModel(AllObject.data_beli.viewTabel());
                tabel_jual.setModel(AllObject.data_jual.viewTabel());
                tabel_jual2.setModel(AllObject.data_jual.viewTabel());
                total_untung = Integer.parseInt(text_total_untung_pegawai.getText()) + untung;
                text_total_untung_pegawai.setText("" + total_untung);
                text_total_untung_pemilik.setText("" + total_untung);
                refreshFieldJual();
            }
        });

        button_refresh2_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshFieldJual();
            }
        });

        button_tutup_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pegawai_aktif = false;
                in_frame_pegawai.setVisible(false);
            }
        });

        button_tutup_in_frame_pemilik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pemilik_aktif = false;
                in_frame_pemilik.setVisible(false);
            }
        });
    }

    private void refreshFieldBeli() {
        text_id_kiri.setText("");
        text_nama_kiri.setText("");
        text_umur_kiri.setText("");
        text_harga_beli_kiri.setText("");
        text_tanggal_beli_kiri.setText("");
    }

    private void refreshFieldJual() {
        text_id_kanan.setText("");
        text_nama_kanan.setText("");
        text_nama_kanan.setEnabled(false);
        text_harga_beli_kanan.setText("");
        text_harga_beli_kanan.setEnabled(false);
        text_tanggal_beli_kanan.setText("");
        text_tanggal_beli_kanan.setEnabled(false);
        text_harga_jual_kanan.setText("");
        text_tanggal_jual_kanan.setText("");
    }

}
