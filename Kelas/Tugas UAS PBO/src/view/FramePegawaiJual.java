package view;

import javax.swing.*;
import static javax.swing.JOptionPane.*;
import model.*;

public class FramePegawaiJual extends javax.swing.JFrame {

    public FramePegawaiJual() {
        initComponents();
        this.setTitle("Jual Hewan");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setTextTotalUntung();
        refreshFieldJual();
        tabel_jual.setModel(AllObject.data_jual_all.viewTabel());
    }

    private void setTextTotalUntung() {
        if (JualHewan.total_untung == 0) {
            text_total_untung.setText("");
        } else if (JualHewan.total_untung > 0) {
            text_total_untung.setText("" + JualHewan.total_untung);
        }
        text_total_untung.setEditable(false);
    }

    private void refreshFieldJual() {
        text_id.setText("");
        text_nama.setText("");
        text_nama.setEnabled(false);
        text_nama.setEditable(false);
        text_harga_beli.setText("");
        text_harga_beli.setEnabled(false);
        text_harga_beli.setEditable(false);
        text_tanggal_beli.setText("");
        text_tanggal_beli.setEnabled(false);
        text_tanggal_beli.setEditable(false);
        text_harga_jual.setText("");
        text_tahun_jual.setText("");
        combo_tanggal.setSelectedIndex(0);
        combo_bulan.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        text_nama = new javax.swing.JTextField();
        text_harga_beli = new javax.swing.JTextField();
        text_tanggal_beli = new javax.swing.JTextField();
        text_harga_jual = new javax.swing.JTextField();
        text_tahun_jual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_jual = new javax.swing.JTable();
        button_jual = new javax.swing.JButton();
        button_kembali = new javax.swing.JButton();
        button_cari = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        text_total_untung = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        combo_tanggal = new javax.swing.JComboBox<>();
        combo_bulan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Hewan");

        jLabel2.setText("Nama Hewan");

        jLabel3.setText("Harga Beli");

        jLabel4.setText("Tanggal Beli");

        jLabel5.setText("Harga Jual");

        jLabel6.setText("Tanggal Jual");

        text_tahun_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tahun_jualActionPerformed(evt);
            }
        });

        tabel_jual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabel_jual);

        button_jual.setText("Jual Hewan");
        button_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_jualActionPerformed(evt);
            }
        });

        button_kembali.setText("Kembali");
        button_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kembaliActionPerformed(evt);
            }
        });

        button_cari.setText("Cari Hewan");
        button_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cariActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Keuntungan");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel8.setText("                              Daftar Hewan yang Telah Terjual");

        combo_tanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        combo_bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_id)
                            .addComponent(text_nama)
                            .addComponent(text_tanggal_beli)
                            .addComponent(text_harga_jual)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_tahun_jual, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addComponent(text_harga_beli))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(text_total_untung, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button_jual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_id)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_tanggal_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_harga_jual, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_tahun_jual)
                            .addComponent(combo_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_cari)
                            .addComponent(button_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_jual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_total_untung, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cariActionPerformed
        boolean ketemu = false;
        if (AllObject.data_beli_all.getIndex() > 0) {
            String id = text_id.getText();
            int index_ketemu = AllObject.data_beli_all.cariIndexData(id);
            for (int i = 0; i < AllObject.data_beli_all.getIndex(); i++) {
                if (index_ketemu != -1) {
                    text_nama.setText(AllObject.data_beli_all.data_pembelian[index_ketemu].getNama());
                    text_harga_beli.setText(String.valueOf(AllObject.data_beli_all.data_pembelian[index_ketemu].getHargaBeli()));
                    text_tanggal_beli.setText(AllObject.data_beli_all.data_pembelian[index_ketemu].getTanggalBeli());
                    text_nama.setEnabled(true);
                    text_harga_beli.setEnabled(true);
                    text_tanggal_beli.setEnabled(true);
                    ketemu = true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hewan di dalam peternakan masih kosong",
                    "Peringatan", WARNING_MESSAGE);
        }
        if (!ketemu && AllObject.data_beli_all.getIndex() > 0) {
            JOptionPane.showMessageDialog(null, "Hewan yang dicari tidak ditemukan, "
                    + "silahkan masukkan ID yang benar", "Peringatan", WARNING_MESSAGE);
            refreshFieldJual();
        }
    }//GEN-LAST:event_button_cariActionPerformed

    private void button_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_jualActionPerformed

        if (text_id.getText().equals("") || text_nama.getText().equals("") || text_harga_beli.getText().equals("")
                || text_tanggal_beli.getText().equals("") || text_harga_jual.getText().equals("")
                || text_tahun_jual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi semua kolom isian");
        } else {
            boolean error_input = true;
            String id = text_id.getText();
            String nama = text_nama.getText();
            int harga_beli = Integer.parseInt(text_harga_beli.getText());
            String tanggal_beli = text_tanggal_beli.getText();
            int harga_jual = 0;
            try {
                harga_jual = Integer.parseInt(text_harga_jual.getText());
                error_input = false;
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Harga jual harus angka\n" + error);
            }
            String tanggal = (String) combo_tanggal.getSelectedItem() + " ";
            String bulan = (String) combo_bulan.getSelectedItem() + " ";
            String tahun = text_tahun_jual.getText();
            String tanggal_jual = tanggal + bulan + tahun;

            if (!error_input) {
                int untung = Integer.parseInt(text_harga_jual.getText())
                        - Integer.parseInt(text_harga_beli.getText());
                AllObject.data_jual_all.insert(id, harga_jual, tanggal_jual, untung);
                AllObject.data_beli_all.deleteHewan(id);
                tabel_jual.setModel(AllObject.data_jual_all.viewTabel());
                JualHewan.total_untung = JualHewan.total_untung + untung;
                text_total_untung.setText("" + JualHewan.total_untung);
                refreshFieldJual();
                JOptionPane.showMessageDialog(null, "Hewan telah berhasil dijual");
            }
        }
    }//GEN-LAST:event_button_jualActionPerformed

    private void button_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kembaliActionPerformed
        new FramePegawai();
        this.dispose();
    }//GEN-LAST:event_button_kembaliActionPerformed

    private void text_tahun_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tahun_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tahun_jualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cari;
    private javax.swing.JButton button_jual;
    private javax.swing.JButton button_kembali;
    private javax.swing.JComboBox<String> combo_bulan;
    private javax.swing.JComboBox<String> combo_tanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_jual;
    private javax.swing.JTextField text_harga_beli;
    private javax.swing.JTextField text_harga_jual;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_tahun_jual;
    private javax.swing.JTextField text_tanggal_beli;
    private javax.swing.JTextField text_total_untung;
    // End of variables declaration//GEN-END:variables
}
