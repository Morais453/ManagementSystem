package main.model;

public class Administrador extends Usuario{
    public Administrador(int idUsuario, String nome, String email, String senha, String tipoUsuario) {
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
    public void gerenciarHistoricoPaciente(){}
    public void gerenciarHistoricoConsulta(){}
}