package main.model;

import java.util.Date;

public class Usuario {
    private int idUsuario;
    private boolean statusUsuario;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private final Date DATACADASTRO;
    private String tipoUsuario;


    public Usuario(int idUsuario, String nome, String telefone, String email, String senha) {
        this.idUsuario = idUsuario;
        this.statusUsuario = true;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.DATACADASTRO = new Date();
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    // Método de autenticação mais direto
    public boolean autenticar(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            return true;
        }else{
            return false;
        }
    }

    // Lógica de solicitação de consulta
    public void solicitarConsulta(int idUsuario, Date dataSolicitacao) {
        // TODO: Implementar lógica de solicitação de consulta
        System.out.println("Solicitação de consulta registrada para o usuário " + idUsuario + " na data " + dataSolicitacao);
    }

    // Lógica para verificar consultas do usuário
    public void verificarMinhasConsultas(int idUsuario) {
        // TODO: Implementar lógica para exibir consultas do usuário
        System.out.println("Consultas do usuário " + idUsuario + " verificadas.");
    }

    // Exibir informações do usuário
    public void exibirInfo() {
        System.out.println("ID: " + idUsuario);
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
