package main.model;

import java.util.Date;

public class Pessoa {

    String nome;
    String telefone;
    String email;
    String endereco;
    String cidade;
    String estado;
    String cep;
    String rg;
    String cpf;
    Date dataNascimento;
    String sexo;

    public Pessoa(String nome, String telefone, String email, String endereco, String cidade, String estado, String cep, String rg, String cpf, Date dataNascimento, String sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }
}
