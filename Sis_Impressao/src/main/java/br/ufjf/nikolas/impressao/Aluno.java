package br.ufjf.nikolas.impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;
    private int numMaxcopias = 50;
    private int numCopias = 0;

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
