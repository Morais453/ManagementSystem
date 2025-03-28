package main.model;

import java.util.List;
import java.util.ArrayList;

public class Administrador extends Usuario {

    // Lista para armazenar usuários cadastrados (simulação de um banco de dados)
    private List<Usuario> usuarios;
    private List<String> consultas;

    // Construtor chamando a superclasse Usuario
    public Administrador(int idUsuario, String nome, String email, String senha) {
        super(idUsuario, nome, email, senha, "Administrador");
        this.usuarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    // Método para cadastrar um novo usuário
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " cadastrado com sucesso.");
    }

    // Método para verificar um usuário pelo ID
    public Usuario verificarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getID_USUARIO() == id) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado.");
        return null;
    }

    // Método para alterar informações de um usuário
    public void alterarUsuario(int id, String novoNome, String novoEmail) {
        Usuario usuario = verificarUsuario(id);
        if (usuario != null) {
            usuario.setNome(novoNome);
            usuario.setEmail(novoEmail);
            System.out.println("Usuário " + id + " atualizado com sucesso.");
        }
    }

    // Método para remover um usuário pelo ID
    public void removerUsuario(int id) {
        Usuario usuario = verificarUsuario(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuário removido com sucesso.");
        }
    }

    // Método para listar todos os usuários cadastrados
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de usuários:");
            for (Usuario usuario : usuarios) {
                usuario.informacaoUsuario();
            }
        }
    }

    // Método para listar todas as consultas
    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta registrada.");
        } else {
            System.out.println("Consultas agendadas:");
            for (String consulta : consultas) {
                System.out.println(consulta);
            }
        }
    }

    // Método para alterar uma consulta (exemplo básico)
    public void alterarConsulta(int index, String novaConsulta) {
        if (index >= 0 && index < consultas.size()) {
            consultas.set(index, novaConsulta);
            System.out.println("Consulta atualizada com sucesso.");
        } else {
            System.out.println("Consulta não encontrada.");
        }
    }

    // Método para remover uma consulta
    public void removerConsulta(int index) {
        if (index >= 0 && index < consultas.size()) {
            consultas.remove(index);
            System.out.println("Consulta removida com sucesso.");
        } else {
            System.out.println("Consulta não encontrada.");
        }
    }
}
