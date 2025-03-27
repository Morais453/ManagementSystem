package main.model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuario {
    private List<String> historicoMedico;
    private List<String> agendaConsultas;

    public Paciente(int idUsuario, String nome, String email, String senha) {
        super(idUsuario, nome, email, senha, "Paciente");
        this.historicoMedico = new ArrayList<>();
        this.agendaConsultas = new ArrayList<>();
    }

    // Método para adicionar histórico médico
    public void adicionarHistorico(String historico) {
        historicoMedico.add(historico);
        System.out.println("Histórico médico adicionado.");
    }

    // Método para listar histórico médico
    public void listarHistorico() {
        if (historicoMedico.isEmpty()) {
            System.out.println("Nenhum histórico médico registrado.");
        } else {
            System.out.println("Histórico Médico:");
            for (String h : historicoMedico) {
                System.out.println(h);
            }
        }
    }

    // Método para adicionar consulta à agenda
    public void adicionarConsulta(String consulta) {
        agendaConsultas.add(consulta);
        System.out.println("Consulta adicionada à agenda.");
    }

    // Método para listar consultas agendadas
    public void listarConsultas() {
        if (agendaConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta agendada.");
        } else {
            System.out.println("Consultas Agendadas:");
            for (String c : agendaConsultas) {
                System.out.println(c);
            }
        }
    }


}
