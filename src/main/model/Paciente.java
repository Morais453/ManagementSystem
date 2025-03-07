package main.model;

import java.util.Date;

public class Paciente extends Pessoa {
    public Paciente(String nome, String telefone, String email, String endereco, String cidade, String estado, String cep, String rg, String cpf, Date dataNascimento, String sexo) {
        super(nome, telefone, email, endereco, cidade, estado, cep, rg, cpf, dataNascimento, sexo);
    }
}
