package main.model;

import java.util.ArrayList;
import java.util.List;

public class Recepcionista extends Usuario {

    private List<Usuario> pacientes;
    private List<String> agendaConsultas;

    // Construtor correto
    public Recepcionista(int idUsuario, String nome, String email, String senha) {
        super(idUsuario, nome, email, senha, "Recepcionista");
        this.pacientes = new ArrayList<>();
        this.agendaConsultas = new ArrayList<>();
    }

    // Método para cadastrar apenas pacientes
    public void cadastrarPaciente(int idPaciente, String nome, String email, String senha) {
        Paciente paciente = new Paciente(idPaciente, nome, email, senha);

        pacientes.add(paciente);
        System.out.println("Paciente " + nome + " cadastrado com sucesso.");
    }

    // Método para listar pacientes cadastrados
    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Usuario paciente : pacientes) {
                paciente.informacaoUsuario();
            }
        }
    }

    // Método para verificar se um paciente está cadastrado pelo email
    public boolean verificarUsuario(String email) {
        for (Usuario paciente : pacientes) {
            if (paciente.getEmail().equals(email)) {
                System.out.println("Usuário encontrado: ");
                paciente.informacaoUsuario();
                return true;
            }
        }
        System.out.println("Usuário não encontrado.");
        return false;
    }

    // Método para alterar dados de um paciente cadastrado
    public void alterarUsuario(String email, String novoNome, String novoEmail, String novaSenha) {
        for (Usuario paciente : pacientes) {
            if (paciente.getEmail().equals(email)) {
                paciente.setNome(novoNome);
                paciente.setEmail(novoEmail);
                paciente.setSenha(novaSenha);
                System.out.println("Dados do paciente " + novoNome + " foram atualizados.");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    // Método para consultar a agenda de consultas do dia
    public void consultarAgenda() {
        if (agendaConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta agendada.");
        } else {
            System.out.println("Agenda de Consultas:");
            for (String consulta : agendaConsultas) {
                System.out.println(consulta);
            }
        }
    }

    // Método para adicionar uma consulta na agenda
    public void adicionarConsulta(String consulta) {
        agendaConsultas.add(consulta);
        System.out.println("Consulta adicionada à agenda.");
    }
}
