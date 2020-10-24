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
public class FramePegawai extends javax.swing.JFrame {

    public FramePegawai() {
        initComponents();
        this.setTitle("Menu Pegawai");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_beli = new javax.swing.JButton();
        button_jual = new javax.swing.JButton();
        button_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_beli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button_beli.setText("Beli Hewan");
        button_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_beliActionPerformed(evt);
            }
        });

        button_jual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button_jual.setText("Jual Hewan");
        button_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_jualActionPerformed(evt);
            }
        });

        button_logout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button_logout.setText("Logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_beli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_jual, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(button_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(button_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_beliActionPerformed
        new FramePegawaiBeli();
        this.dispose();
    }//GEN-LAST:event_button_beliActionPerformed

    private void button_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_jualActionPerformed
        new FramePegawaiJual();
        this.dispose();
    }//GEN-LAST:event_button_jualActionPerformed

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        new FrameLoginPegawai();
        this.dispose();
    }//GEN-LAST:event_button_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_beli;
    private javax.swing.JButton button_jual;
    private javax.swing.JButton button_logout;
    // End of variables declaration//GEN-END:variables
}
