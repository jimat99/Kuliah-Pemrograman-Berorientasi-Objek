package pertemuan82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Login
 */
public class Login extends JFrame {

    private JLabel labelUsername, labelPassword;
    private JTextField username;
    private JPasswordField password;
    private JButton login;
    private modelPegawai pegawaiMdl = new modelPegawai();

    public Login(modelPegawai pegawaiMdl) {
        this.pegawaiMdl = pegawaiMdl;
        setTitle("Login");
        setSize(300, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelUsername = new JLabel();
        labelUsername.setText("Username");
        labelUsername.setBounds(25, 25, 100, 30);
        add(labelUsername);
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(25, 95, 100, 30);
        add(labelPassword);
        password = new JPasswordField();
        password.setBounds(25, 130, 100, 30);
        add(password);
        username = new JTextField();
        username.setBounds(25, 60, 100, 30);
        add(username);
        login = new JButton("Login");
        login.setBounds(25, 200, 100, 30);
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                try {
                    pegawaiMdl.setNama(username.getText());
                    // JOptionPane.showMessageDialog(null,"sesuai");
                    pegawai temp;
                    temp = pegawaiMdl.login(username.getText(), Integer.parseInt(password.getText()));
                    if (temp != null) {
                        JOptionPane.showMessageDialog(null, temp.getNama());
                    } else {
                        JOptionPane.showMessageDialog(null, "Username atau Password salah");
                    }
                } catch (PegawaiException e) {
                    //TODO: handle exception
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        });
        add(login);
    }

}
