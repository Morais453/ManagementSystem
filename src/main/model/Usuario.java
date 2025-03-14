package main.model;

public class Usuario {
    int idUsuario;
    String nome;
    String email;
    String senha;
    String tipoUsuario;
    public Usuario(int idUsuario, String nome, String email, String senha, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    protected boolean autenticar(String usuario, String senha){
        if(usuario.equals(this.email) && senha.equals(this.senha)){
            return true;
        }else{
            return false;
        }
    }
}
