package modul6praktikum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.*;
import javax.swing.border.*;
import javax.swing.table.*;

public class MainFrame extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Biodata Mahasiswa");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Sisi kiri
        JLabel label_npm = new JLabel("NPM");
        label_npm.setFont(new Font("Arial", Font.PLAIN, 12));
        label_npm.setBounds(30, 30, 100, 30);
        frame.add(label_npm);
        JLabel labelnpm2 = new JLabel(":");
        labelnpm2.setFont(new Font("Arial", Font.PLAIN, 12));
        labelnpm2.setBounds(120, 30, 100, 30);
        frame.add(labelnpm2);

        JLabel label_nama = new JLabel("Nama");
        label_nama.setFont(new Font("Arial", Font.PLAIN, 12));
        label_nama.setBounds(30, 80, 100, 30);
        frame.add(label_nama);
        JLabel label_nama2 = new JLabel(":");
        label_nama2.setFont(new Font("Arial", Font.PLAIN, 12));
        label_nama2.setBounds(120, 80, 100, 30);
        frame.add(label_nama2);

        JLabel label_telp = new JLabel("Telp");
        label_telp.setFont(new Font("Arial", Font.PLAIN, 12));
        label_telp.setBounds(30, 130, 100, 30);
        frame.add(label_telp);
        JLabel label_telp2 = new JLabel(":");
        label_telp2.setFont(new Font("Arial", Font.PLAIN, 12));
        label_telp2.setBounds(120, 130, 100, 30);
        frame.add(label_telp2);

        JLabel label_jk = new JLabel("Jenis Kelamin    :");
        label_jk.setFont(new Font("Arial", Font.PLAIN, 12));
        label_jk.setBounds(30, 180, 100, 30);
        frame.add(label_jk);
        JLabel label_jk2 = new JLabel(":");
        label_jk2.setFont(new Font("Arial", Font.PLAIN, 12));
        label_jk2.setBounds(120, 180, 100, 30);
        frame.add(label_jk2);

        JLabel label_ttl = new JLabel("TTL");
        label_ttl.setFont(new Font("Arial", Font.PLAIN, 12));
        label_ttl.setBounds(30, 230, 100, 30);
        frame.add(label_ttl);
        JLabel label_ttl2 = new JLabel(":");
        label_ttl2.setFont(new Font("Arial", Font.PLAIN, 12));
        label_ttl2.setBounds(120, 230, 100, 30);
        frame.add(label_ttl2);

        JLabel label_hobi = new JLabel("Hobby");
        label_hobi.setFont(new Font("Arial", Font.PLAIN, 12));
        label_hobi.setBounds(30, 280, 100, 30);
        frame.add(label_hobi);
        JLabel label_hobi2 = new JLabel(":");
        label_hobi2.setFont(new Font("Arial", Font.PLAIN, 12));
        label_hobi2.setBounds(120, 280, 100, 30);
        frame.add(label_hobi2);

        JLabel label_alamat = new JLabel("Alamat");
        label_alamat.setFont(new Font("Arial", Font.PLAIN, 12));
        label_alamat.setBounds(30, 430, 100, 30);
        frame.add(label_alamat);
        JLabel label_alamat2 = new JLabel(":");
        label_alamat2.setFont(new Font("Arial", Font.PLAIN, 12));
        label_alamat2.setBounds(120, 430, 100, 30);
        frame.add(label_alamat2);

        // Sisi kanan
        JTextField text_npm = new JTextField();
        text_npm.setBounds(150, 30, 200, 30);
        frame.add(text_npm);
        JTextField text_nama = new JTextField();
        text_nama.setBounds(150, 80, 200, 30);
        frame.add(text_nama);
        JTextField text_telp = new JTextField();
        text_telp.setBounds(150, 130, 200, 30);
        frame.add(text_telp);

        JRadioButton rbutton_pria = new JRadioButton("Pria");
        rbutton_pria.setBounds(150, 180, 100, 30);
        rbutton_pria.setActionCommand("Pria");
        frame.add(rbutton_pria);
        JRadioButton rbutton_wanita = new JRadioButton("Wanita");
        rbutton_wanita.setBounds(250, 180, 100, 30);
        rbutton_wanita.setActionCommand("Wanita");
        frame.add(rbutton_wanita);
        ButtonGroup grup_button = new ButtonGroup();
        grup_button.add(rbutton_pria);
        grup_button.add(rbutton_wanita);

        JTextField text_ttl = new JTextField();
        text_ttl.setBounds(150, 230, 200, 30);
        frame.add(text_ttl);

        String tanggal[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
            "27", "28", "29", "30", "31"};
        JComboBox combo_tanggal = new JComboBox(tanggal);
        combo_tanggal.setBounds(370, 230, 50, 30);
        frame.add(combo_tanggal);
        String bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        JComboBox combo_bulan = new JComboBox(bulan);
        combo_bulan.setBounds(430, 230, 100, 30);
        frame.add(combo_bulan);
        String tahun[] = {"2000", "2001", "2002", "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010"};
        JComboBox combo_tahun = new JComboBox(tahun);
        combo_tahun.setBounds(540, 230, 70, 30);
        frame.add(combo_tahun);

        JCheckBox check_ngoding = new JCheckBox("Ngoding");
        check_ngoding.setBounds(150, 280, 120, 30);
        frame.add(check_ngoding);
        JCheckBox check_novel = new JCheckBox("Baca Novel");
        check_novel.setBounds(300, 280, 150, 30);
        frame.add(check_novel);
        JCheckBox check_design = new JCheckBox("Design");
        check_design.setBounds(150, 330, 150, 30);
        frame.add(check_design);
        JCheckBox check_bakso = new JCheckBox("Makan Bakso");
        check_bakso.setBounds(300, 330, 150, 30);
        frame.add(check_bakso);
        JCheckBox check_game = new JCheckBox("Game");
        check_game.setBounds(150, 380, 150, 30);
        frame.add(check_game);
        JCheckBox check_dll = new JCheckBox("Dll");
        check_dll.setBounds(300, 380, 150, 30);
        frame.add(check_dll);

        JTextArea texta_alamat = new JTextArea();
        Border border = BorderFactory.createLineBorder(Color.gray, 1);
        texta_alamat.setBorder(border);
        texta_alamat.setBounds(150, 430, 380, 80);
        frame.add(texta_alamat);

        JButton button_insert = new JButton("Insert");
        button_insert.setFont(new Font("Arial", Font.PLAIN, 12));
        button_insert.setBounds(150, 520, 80, 20);
        frame.add(button_insert);
        button_insert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String npm = text_npm.getText();
                String nama = text_nama.getText();
                String telp = text_telp.getText();
                String jk = grup_button.getSelection().getActionCommand();
                String tempat_lahir = text_ttl.getText();
                String tanggal = (String) combo_tanggal.getSelectedItem() + " ";
                String bulan = (String) combo_bulan.getSelectedItem() + " ";
                String tahun = (String) combo_tahun.getSelectedItem() + " ";
                String hobi = "";
                if (check_ngoding.isSelected()) {
                    hobi += check_ngoding.getText() + ", ";
                }
                if (check_novel.isSelected()) {
                    hobi += check_novel.getText() + ", ";
                }
                if (check_design.isSelected()) {
                    hobi += check_design.getText() + ", ";
                }
                if (check_bakso.isSelected()) {
                    hobi += check_bakso.getText() + ", ";
                }
                if (check_game.isSelected()) {
                    hobi += check_game.getText() + ", ";
                }
                if (check_dll.isSelected()) {
                    hobi += check_dll.getText() + ", ";
                }
                hobi = hobi.substring(0, hobi.length() - 2);
                String alamat = texta_alamat.getText();
                String output = "NPM : " + npm + "\nNama : " + nama
                        + "\nNomor telepon : " + telp + "\nJenis kelamin : " + jk
                        + "\nTempat & tanggal lahir : " + tempat_lahir + ", "
                        + tanggal + bulan + tahun + "\nHobi : " + hobi + "\nAlamat : "
                        + alamat;
                JOptionPane.showMessageDialog(null, output, "Hasil Insert Data", INFORMATION_MESSAGE);
            }
        });
        JButton button_cancel = new JButton("Cancel");
        button_cancel.setFont(new Font("Arial", Font.PLAIN, 12));
        button_cancel.setBounds(240, 520, 80, 20);
        frame.add(button_cancel);
        button_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
