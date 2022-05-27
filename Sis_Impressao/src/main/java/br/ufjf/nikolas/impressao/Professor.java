package br.ufjf.nikolas.impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Professor extends Funcionario {

    private static int numeroMaxCopias = 200;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private String horarioAtendimento;

    public Professor(String nome, char sexo, Date data_nascimento, int idade, int matricula, String unidade, String departamento, String horarioAtendimento) {
        super(nome, sexo, data_nascimento, idade, matricula, unidade, departamento);
        this.horarioAtendimento = horarioAtendimento;
    }

    public int getNumeroMaxCopias() {
        return numeroMaxCopias;
    }

    public void setNumeroMaxCopias(int numeroMaxCopias) {
        this.numeroMaxCopias = numeroMaxCopias;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public void AdicionaDisciplina()
    {
        boolean sair = false;
        Scanner entrada = new Scanner(System.in);

        while(sair == false)
        {
            System.out.println("MENU:" +
                    "\n1. Adicionar disciplina" +
                    "\n2. Sair");
            int opcao = entrada.nextInt();

            switch (opcao)
            {
                case 1:

                    System.out.println("Digite o nome da disciplina ministrada pelo professor: ");
                    String disciplina = entrada.next();
                    disciplinas.add(new Disciplina(disciplina));
                    System.out.println("Disciplina adicionada");
                    break;
                case 2:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }
    }
}
