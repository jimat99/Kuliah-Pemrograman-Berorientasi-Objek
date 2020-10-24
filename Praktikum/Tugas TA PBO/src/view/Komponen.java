package view;

import javax.swing.*;
import javax.swing.table.*;

public class Komponen extends JFrame {

    // deklarasi komponen umum
    JMenuBar menu_bar = new JMenuBar();
    JMenu menu_file = new JMenu("Menu");
    JMenuItem menu_item_pemilik = new JMenuItem("Pemilik");
    JMenuItem menu_item_pegawai = new JMenuItem("Pegawai");
    JMenuItem menu_item_exit = new JMenuItem("Exit");
    JDesktopPane desktop_pane = new JDesktopPane();
    JInternalFrame in_frame_pegawai = new JInternalFrame("Menu Pegawai");
    JInternalFrame in_frame_pemilik = new JInternalFrame("Menu Pemilik");

    // deklarasi komponen sisi kiri pegawai
    JLabel label_id_kiri = new JLabel("ID Hewan");
    JLabel label_nama_kiri = new JLabel("Nama Hewan");
    JLabel label_umur_kiri = new JLabel("Umur Hewan");
    JLabel label_harga_beli_kiri = new JLabel("Harga Beli");
    JLabel label_tanggal_beli_kiri = new JLabel("Tanggal Beli");
    JTextField text_id_kiri = new JTextField();
    JTextField text_nama_kiri = new JTextField();
    JTextField text_umur_kiri = new JTextField();
    JTextField text_harga_beli_kiri = new JTextField();
    JTextField text_tanggal_beli_kiri = new JTextField();
    JButton button_beli_in_frame_pegawai = new JButton("Beli Hewan");
    JButton button_refresh_in_frame_pegawai = new JButton("Refresh Kolom Isian");
    JTable tabel_beli = new JTable();
    JScrollPane scroll_pane_kiri = new JScrollPane(tabel_beli);

    // deklarasi komponen sisi kanan pegawai
    JLabel label_id_kanan = new JLabel("ID Hewan");
    JLabel label_nama_kanan = new JLabel("Nama Hewan");
    JLabel label_harga_beli_kanan = new JLabel("Harga Beli");
    JLabel label_tanggal_beli_kanan = new JLabel("Tanggal Beli");
    JLabel label_harga_jual_kanan = new JLabel("Harga Jual");
    JLabel label_tanggal_jual_kanan = new JLabel("Tanggal Jual");
    JTextField text_id_kanan = new JTextField();
    JTextField text_nama_kanan = new JTextField();
    JTextField text_harga_beli_kanan = new JTextField();
    JTextField text_tanggal_beli_kanan = new JTextField();
    JTextField text_harga_jual_kanan = new JTextField();
    JTextField text_tanggal_jual_kanan = new JTextField();
    JButton button_cari_hewan = new JButton("Cari Hewan");
    JButton button_jual_in_frame_pegawai = new JButton("Jual Hewan");
    JButton button_refresh2_in_frame_pegawai = new JButton("Refresh Kolom Isian");
    JTable tabel_jual = new JTable();
    JScrollPane scroll_pane_kanan = new JScrollPane(tabel_jual);
    JLabel label_total_untung_pegawai = new JLabel("Total Keuntungan");
    JTextField text_total_untung_pegawai = new JTextField();

    // deklarasi komponen sisi bawah pegawai
    JButton button_tutup_in_frame_pegawai = new JButton("Tutup");

    // deklarasi komponen sisi kiri pemilik
    JLabel label_laporan_beli = new JLabel("Laporan Pembelian");
    JTable tabel_beli2 = new JTable();
    JScrollPane scroll_pane_kiri2 = new JScrollPane(tabel_beli2);

    // deklarasi komponen sisi kanan pemilik
    JLabel label_laporan_jual = new JLabel("Laporan Penjualan");
    JTable tabel_jual2 = new JTable();
    JScrollPane scroll_pane_kanan2 = new JScrollPane(tabel_jual2);

    // deklarasi komponen sisi bawah pemilik
    JLabel label_total_untung_pemilik = new JLabel("Total Keuntungan");
    JTextField text_total_untung_pemilik = new JTextField();
    JButton button_tutup_in_frame_pemilik = new JButton("Tutup");

}
