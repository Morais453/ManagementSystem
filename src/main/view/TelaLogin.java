package main.view;

import javax.management.remote.JMXAuthenticator;
import javax.swing.*;

public class TelaLogin {

    public static void janelaShow() {
        JFrame janelaLogin = new JFrame();
        janelaLogin.setLayout(null);

        janelaLogin.setTitle("Login System");
        janelaLogin.setSize(500, 500);
        janelaLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel labelNome = new JLabel("Usuário");
        labelNome.setBounds(20, 20, 100, 20);
        janelaLogin.getContentPane().add(labelNome);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(20, 60, 100, 20);
        janelaLogin.getContentPane().add(labelSenha);

        JTextField campoTextoUsuario = new JTextField();
        campoTextoUsuario.setBounds(20, 40, 100, 20);
        janelaLogin.getContentPane().add(campoTextoUsuario);

        JTextField campoTextoSenha = new JTextField();
        campoTextoSenha.setBounds(20, 80, 100, 20);
        janelaLogin.getContentPane().add(campoTextoSenha);

        JButton botaoLogin = new JButton();
        botaoLogin.setText("Login");
        botaoLogin.setBounds(20, 120, 100, 20);
        botaoLogin.addActionListener(e -> {
            String usuarioDigitado = campoTextoUsuario.getText();
            String senhaDigitada = campoTextoSenha.getText();

        });
        janelaLogin.getContentPane().add(botaoLogin);

        janelaLogin.setVisible(true);
    }
}
