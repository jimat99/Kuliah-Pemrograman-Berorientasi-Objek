package view;

import model.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameLoginPegawai {

    public FrameLoginPegawai() {
        JFrame frame = new JFrame();
        frame.setTitle("Login Pegawai");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label_judul = new JLabel("Silahkan Login");
        label_judul.setFont(new Font("Garamond", Font.BOLD, 40));
        label_judul.setBounds(180, 10, 300, 50);

        // sisi kiri
        JLabel label_nama = new JLabel("Nama");
        label_nama.setFont(new Font("Garamond", Font.BOLD, 26));
        label_nama.setBounds(10, 80, 120, 30);
        JLabel label_nama2 = new JLabel(":");
        label_nama2.setFont(new Font("Garamond", Font.BOLD, 26));
        label_nama2.setBounds(140, 80, 10, 30);

        JLabel label_password = new JLabel("Password");
        label_password.setFont(new Font("Garamond", Font.BOLD, 26));
        label_password.setBounds(10, 130, 120, 30);
        JLabel label_password2 = new JLabel(":");
        label_password2.setFont(new Font("Garamond", Font.BOLD, 26));
        label_password2.setBounds(140, 130, 10, 30);

        // sisi kanan
        JTextField text_nama = new JTextField();
        text_nama.setBounds(160, 80, 400, 30);
        JPasswordField text_password = new JPasswordField();
        text_password.setBounds(160, 130, 400, 30);

        // sisi bawah
        JButton button_login = new JButton("Login");
        button_login.setBounds(10, 170, 100, 30);

        JButton button_kembali = new JButton("Kembali");
        button_kembali.setBounds(120, 170, 100, 30);

        // semua proses
        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (text_nama.getText().equals("") || text_password.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Isi semua kolom isian");
                } else {
                    boolean ketemu = false;
                    for (int i = 0; i < AllObject.data_pegawai_all.nama.length; i++) {
                        if (text_nama.getText().equalsIgnoreCase(AllObject.data_pegawai_all.nama[i])
                                && text_password.getText().equalsIgnoreCase(AllObject.data_pegawai_all.password[i])) {
                            ketemu = true;
                        }
                    }
                    if (ketemu == true) {
                        new FramePegawai();
                        frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Nama atau password salah, silahkan masukkan lagi");
                    }
                }

            }
        });

        button_kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new FrameUtama();
                frame.dispose();
            }
        });

        frame.add(label_judul);
        frame.add(label_nama);
        frame.add(label_nama2);
        frame.add(label_password);
        frame.add(label_password2);
        frame.add(text_nama);
        frame.add(text_password);
        frame.add(button_kembali);
        frame.add(button_login);
        frame.setVisible(true);
    }
}
