package br.ufjf.nikolas.impressao;

import java.util.Date;

public class Funcionario extends Pessoa {
    private int matricula; //matricula
    private String unidade, departamento; //unidade e departamento

    /**
     * Constutor
     * @param nome nome do funcionario
     * @param sexo sexo do funcionario
     * @param data_nascimento data de nascimento do funcionario
     * @param idade idade do funcionario
     * @param matricula matricula do funcionario
     * @param unidade unidade do funcionario
     * @param departamento departamento do funcionario
     */
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
