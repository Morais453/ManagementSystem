package main.model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Usuario {
    private String especialidade;
    private List<String> agendaConsultas;

    // Construtor
    public Medico(int idUsuario, String nome, String email, String senha, String especialidade) {
        super(idUsuario, nome, email, senha, "Medico");
        this.especialidade = especialidade;
        this.agendaConsultas = new ArrayList<>();
    }

    // Método para adicionar uma consulta à agenda do médico
    public void adicionarConsulta(String consulta) {
        agendaConsultas.add(consulta);
        System.out.println("Consulta adicionada à agenda do médico " + getNome());
    }

    // Método para consultar a agenda do médico
    public void consultarAgenda() {
        if (agendaConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta agendada para o Dr. " + getNome());
        } else {
            System.out.println("Agenda do Dr. " + getNome() + " - Especialidade: " + especialidade);
            for (String consulta : agendaConsultas) {
                System.out.println(consulta);
            }
        }
    }

    // Método para obter a especialidade do médico
    public String getEspecialidade() {
        return especialidade;
    }

    // Método para alterar a especialidade do médico
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
