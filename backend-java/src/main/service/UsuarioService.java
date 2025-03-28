package main.service;

public class UsuarioService {
    // Método de autenticação mais direto
    public boolean autenticar(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            return true;
        }else{
            return false;
        }
    }
}
