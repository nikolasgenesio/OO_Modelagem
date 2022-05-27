package br.ufjf.nikolas.impressao;

import java.util.Date;

public class Pessoa {

    private String nome;
    private char sexo;
    private Date data_nascimento;
    private int idade;

    public Pessoa(String nome, char sexo, Date data_nascimento, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
