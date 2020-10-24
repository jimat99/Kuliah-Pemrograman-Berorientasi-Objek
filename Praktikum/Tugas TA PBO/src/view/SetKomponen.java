package view;

import model.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class SetKomponen extends Komponen {

    public SetKomponen() {

        setSize(1200, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set komponen umum
        desktop_pane.setBounds(0, 0, 1200, 700);
        desktop_pane.setBackground(Color.gray);
        in_frame_pegawai.setBackground(Color.LIGHT_GRAY);
        in_frame_pegawai.setLayout(null);
        in_frame_pegawai.setBounds(0, 0, 1150, 640);
        in_frame_pemilik.setBackground(Color.LIGHT_GRAY);
        in_frame_pemilik.setLayout(null);
        in_frame_pemilik.setBounds(0, 0, 1150, 640);

        // set komponen sisi kiri pegawai
        label_id_kiri.setBounds(10, 10, 100, 30);
        label_nama_kiri.setBounds(10, 50, 100, 30);
        label_umur_kiri.setBounds(10, 90, 100, 30);
        label_harga_beli_kiri.setBounds(10, 130, 100, 30);
        label_tanggal_beli_kiri.setBounds(10, 170, 100, 30);
        text_id_kiri.setBounds(120, 10, 200, 30);
        text_nama_kiri.setBounds(120, 50, 200, 30);
        text_umur_kiri.setBounds(120, 90, 200, 30);
        text_harga_beli_kiri.setBounds(120, 130, 200, 30);
        text_tanggal_beli_kiri.setBounds(120, 170, 200, 30);
        button_beli_in_frame_pegawai.setBounds(10, 220, 150, 30);
        button_refresh_in_frame_pegawai.setBounds(170, 220, 150, 30);
        tabel_beli.setModel(AllObject.data_beli.viewTabel());
        scroll_pane_kiri.setBounds(10, 300, 480, 300);

        // set komponen sisi kanan pegawai
        label_id_kanan.setBounds(520, 10, 100, 30);
        label_nama_kanan.setBounds(520, 50, 100, 30);
        label_harga_beli_kanan.setBounds(520, 90, 100, 30);
        label_tanggal_beli_kanan.setBounds(520, 130, 100, 30);
        label_harga_jual_kanan.setBounds(520, 170, 100, 30);
        label_tanggal_jual_kanan.setBounds(520, 210, 100, 30);
        text_id_kanan.setBounds(630, 10, 200, 30);
        text_nama_kanan.setBounds(630, 50, 200, 30);
        text_harga_beli_kanan.setBounds(630, 90, 200, 30);
        text_tanggal_beli_kanan.setBounds(630, 130, 200, 30);
        text_harga_jual_kanan.setBounds(630, 170, 200, 30);
        text_tanggal_jual_kanan.setBounds(630, 210, 200, 30);
        button_cari_hewan.setBounds(840, 10, 100, 30);
        button_jual_in_frame_pegawai.setBounds(520, 260, 150, 30);
        button_refresh2_in_frame_pegawai.setBounds(680, 260, 150, 30);
        tabel_jual.setModel(AllObject.data_jual.viewTabel());
        scroll_pane_kanan.setBounds(520, 300, 480, 300);
        label_total_untung_pegawai.setBounds(930, 130, 200, 30);
        text_total_untung_pegawai.setBounds(930, 170, 200, 30);
        text_total_untung_pegawai.setText("0");

        // set komponen sisi bawah pegawai
        button_tutup_in_frame_pegawai.setBounds(1035, 570, 100, 30);

        // set komponen sisi kiri pemilik
        label_laporan_beli.setFont(new Font("Tahoma", Font.BOLD, 20));
        label_laporan_beli.setBounds(200, 20, 200, 30);
        tabel_beli2.setModel(AllObject.data_jual.viewTabel());
        scroll_pane_kiri2.setBounds(10, 100, 550, 300);

        // set komponen sisi kanan pemilik
        label_laporan_jual.setFont(new Font("Tahoma", Font.BOLD, 20));
        label_laporan_jual.setBounds(750, 20, 200, 30);
        tabel_jual2.setModel(AllObject.data_jual.viewTabel());
        scroll_pane_kanan2.setBounds(580, 100, 550, 300);

        // set komponen sis bawah pemilik
        label_total_untung_pemilik.setFont(new Font("Tahoma", Font.BOLD, 20));
        label_total_untung_pemilik.setBounds(500, 420, 200, 30);
        text_total_untung_pemilik.setBounds(480, 460, 220, 30);
        text_total_untung_pemilik.setBackground(Color.DARK_GRAY);
        text_total_untung_pemilik.setForeground(Color.white);
        button_tutup_in_frame_pemilik.setBounds(1035, 570, 100, 30);

        // add semua komponen
        menu_file.add(menu_item_pemilik);
        menu_file.add(menu_item_pegawai);
        menu_file.add(menu_item_exit);
        menu_bar.add(menu_file);
        setJMenuBar(menu_bar);
        desktop_pane.add(in_frame_pegawai);
        desktop_pane.add(in_frame_pemilik);
        in_frame_pegawai.add(label_id_kiri);
        in_frame_pegawai.add(button_cari_hewan);
        in_frame_pegawai.add(label_nama_kiri);
        in_frame_pegawai.add(label_umur_kiri);
        in_frame_pegawai.add(label_harga_beli_kiri);
        in_frame_pegawai.add(label_tanggal_beli_kiri);
        in_frame_pegawai.add(text_id_kiri);
        in_frame_pegawai.add(text_nama_kiri);
        in_frame_pegawai.add(text_umur_kiri);
        in_frame_pegawai.add(text_harga_beli_kiri);
        in_frame_pegawai.add(text_tanggal_beli_kiri);
        in_frame_pegawai.add(button_beli_in_frame_pegawai);
        in_frame_pegawai.add(button_refresh_in_frame_pegawai);
        in_frame_pegawai.add(scroll_pane_kiri);
        in_frame_pegawai.add(label_id_kanan);
        in_frame_pegawai.add(label_nama_kanan);
        in_frame_pegawai.add(label_harga_beli_kanan);
        in_frame_pegawai.add(label_tanggal_beli_kanan);
        in_frame_pegawai.add(label_harga_jual_kanan);
        in_frame_pegawai.add(label_tanggal_jual_kanan);
        in_frame_pegawai.add(text_id_kanan);
        in_frame_pegawai.add(text_nama_kanan);
        in_frame_pegawai.add(text_harga_beli_kanan);
        in_frame_pegawai.add(text_tanggal_beli_kanan);
        in_frame_pegawai.add(text_harga_jual_kanan);
        in_frame_pegawai.add(text_tanggal_jual_kanan);
        in_frame_pegawai.add(button_jual_in_frame_pegawai);
        in_frame_pegawai.add(button_refresh2_in_frame_pegawai);
        in_frame_pegawai.add(scroll_pane_kanan);
        in_frame_pegawai.add(label_total_untung_pegawai);
        in_frame_pegawai.add(text_total_untung_pegawai);
        in_frame_pegawai.add(button_tutup_in_frame_pegawai);
        in_frame_pemilik.add(label_laporan_beli);
        in_frame_pemilik.add(label_laporan_jual);
        in_frame_pemilik.add(scroll_pane_kiri2);
        in_frame_pemilik.add(scroll_pane_kanan2);
        in_frame_pemilik.add(label_total_untung_pemilik);
        in_frame_pemilik.add(text_total_untung_pemilik);
        in_frame_pemilik.add(button_tutup_in_frame_pemilik);
        add(desktop_pane);

        setVisible(true);
    }
}
