/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author DELL
 */
public class FramePemilik extends javax.swing.JFrame {

    public FramePemilik() {
        initComponents();
        this.setTitle("Menu Pemilik");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_laporan_beli = new javax.swing.JButton();
        button_laporan_jual = new javax.swing.JButton();
        button_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_laporan_beli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button_laporan_beli.setText("Lihat Laporan Pembelian");
        button_laporan_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_laporan_beliActionPerformed(evt);
            }
        });

        button_laporan_jual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button_laporan_jual.setText("Lihat Laporan Penjualan");
        button_laporan_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_laporan_jualActionPerformed(evt);
            }
        });

        button_kembali.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button_kembali.setText("Kembali");
        button_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_laporan_beli, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(button_laporan_jual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(button_laporan_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_laporan_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kembaliActionPerformed
        new FrameUtama();
        this.dispose();
    }//GEN-LAST:event_button_kembaliActionPerformed

    private void button_laporan_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_laporan_beliActionPerformed
        new FramePemilikLaporanBeli();
        this.dispose();
    }//GEN-LAST:event_button_laporan_beliActionPerformed

    private void button_laporan_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_laporan_jualActionPerformed
        new FramePemilikLaporanJual();
        this.dispose();
    }//GEN-LAST:event_button_laporan_jualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_kembali;
    private javax.swing.JButton button_laporan_beli;
    private javax.swing.JButton button_laporan_jual;
    // End of variables declaration//GEN-END:variables
}
