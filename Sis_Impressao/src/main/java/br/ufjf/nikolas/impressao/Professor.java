package br.ufjf.nikolas.impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Professor extends Funcionario {

    private int numMaxcopias = 200;
    private int numCopias = 0;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private String horarioAtendimento;
    private List<DisciplinaSemestre> disciplinaSemestres = new ArrayList<>();

    public Professor(String nome, char sexo, Date data_nascimento, int idade, int matricula, String unidade, String departamento, String horarioAtendimento) {
        super(nome, sexo, data_nascimento, idade, matricula, unidade, departamento);
        this.horarioAtendimento = horarioAtendimento;
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

    public void AdicionaDisciplina(Professor professor)
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

                    System.out.println("Digite o periodo: ");
                    int periodo = entrada.nextInt();

                    Disciplina disciplina1 = new Disciplina(disciplina);
                    DisciplinaSemestre disciplinaSemestre = new DisciplinaSemestre(periodo, disciplina1, professor);
                    disciplinaSemestres.add(disciplinaSemestre);

                    boolean discMin = false;
                    for (DisciplinaSemestre semestre : disciplinaSemestres) {
                        if (semestre.getDisciplina().getNome() == disciplina
                                && semestre.getAnoSemestre() == periodo) {
                            System.out.println("Disciplina ja ministrada");
                            discMin = true;
                            disciplinaSemestres.remove(disciplinaSemestre);
                            break;
                        }
                    }

                    if (!discMin)
                    {
                        professor.disciplinas.add(disciplina1);
                        System.out.println("Disciplina adicionada");
                    }
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
