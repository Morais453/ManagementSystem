package main.model;

public class Secretaria extends Usuario{
    public Secretaria(int idUsuario, String nome, String email, String senha, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    public void gerenciarConsultas(){}
    public void gerenciarPacientes(){}
    public void gerenciarMedicos(){}
    public void gerenciarUsuarios(){}
    public void gerenciarHistoricoMedico(){}
}