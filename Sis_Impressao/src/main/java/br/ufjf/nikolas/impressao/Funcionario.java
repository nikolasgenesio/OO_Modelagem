package br.ufjf.nikolas.impressao;

import java.util.Date;

public class Funcionario extends Pessoa {
    private int matricula;
    private String unidade, departamento;


    public Funcionario(String nome, char sexo, Date data_nascimento, int idade, int matricula, String unidade, String departamento) {
        super(nome, sexo, data_nascimento, idade);
        this.matricula = matricula;
        this.unidade = unidade;
        this.departamento = departamento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
