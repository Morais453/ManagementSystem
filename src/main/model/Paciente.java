package main.model;
public class Paciente{
    int idPaciente;
    String nome;
    String cpf;
    String telefone;
    String email;
    int fk_historico_medico;
    public Paciente(int idPaciente, String nome, String cpf, String telefone, String email, int fk_historico_medico) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.fk_historico_medico = fk_historico_medico;
    }
    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public int getFk_historico_medico() {
        return fk_historico_medico;
    }
    public void setFk_historico_medico(int fk_historico_medico) {
        this.fk_historico_medico = fk_historico_medico;
    }
    public void solicitarConsulta(){

    }
}
