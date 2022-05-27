package br.ufjf.nikolas.impressao;

import java.util.Date;

public class Aluno extends Pessoa {

    private int matricula; //matricula
    private String curso; //curso
    private int numMaxcopias = 50; //numero maximo de copias
    private int numCopias = 0; //numero de copias efetuadas

    /**
     * Construtor
     * @param nome nome do aluno
     * @param sexo sexo do aluno
     * @param data_nascimento data de nascimento do aluno
     * @param idade idade do aluno
     * @param matricula matricula do aluno
     * @param curso curso do aluno
     */
    public Aluno(String nome, char sexo, Date data_nascimento, int idade, int matricula, String curso) {
        super(nome, sexo, data_nascimento, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumMaxcopias() {
        return numMaxcopias;
    }

    public void setNumMaxcopias(int numMaxcopias) {
        this.numMaxcopias = numMaxcopias;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
}
