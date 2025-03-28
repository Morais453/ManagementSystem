package main.model;

import java.util.Date;

public class Usuario {
    private final int ID_USUARIO;
    private boolean statusUsuario;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private final Date DATACADASTRO;
    private String tipoUsuario;


    public Usuario(int idUsuario, String nome, String telefone, String email, String senha) {
        this.ID_USUARIO = idUsuario;
        this.statusUsuario = true;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.DATACADASTRO = new Date();
    }

    // Getters e Setters
    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Exibir informações do usuário
    public void informacaoUsuario() {
        System.out.println("ID: " + ID_USUARIO);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Tipo: " + tipoUsuario);  // Exibe tipo do usuário (Administrador, Paciente, etc.)
    }

    // Método para retornar a data de cadastro
    public Date getDataCadastro() {
        return DATACADASTRO;
    }

    // Método para alterar a senha do usuário
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método para verificar o status do usuário

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    // Método para alterar o status do usuário
    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
}
