package br.ufjf.nikolas.impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Principal {

    public Secretario leituraSecretario() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do secretario: ");
        String nome = entrada.next();

        System.out.println("Digite o sexo do secretario: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Digite a data de nascimento do secretario (dd/MM/yyyy): ");
        String data = entrada.next();

        Date date =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        Period period = Period.between(givenDate, LocalDate.now());
        int idade = period.getYears();

        System.out.println("Digite a matricula do secretario: ");
        int matricula = entrada.nextInt();

        System.out.println("Digite a unidade do secretario: ");
        String unidade = entrada.next();

        System.out.println("Digite o departamento do secretario: ");
        String departamento = entrada.next();

        System.out.println("Digite o horario de trabalho do secretario: ");
        String horario = entrada.next();

        Secretario secretario = new Secretario(nome, sexo, date, idade, matricula, unidade, departamento, horario);
        return secretario;
    }

    public Aluno leituraAluno() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.next();

        System.out.println("Digite o sexo do aluno: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Digite a data de nascimento do aluno (dd/MM/yyyy): ");
        String data = entrada.next();

        Date date =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        Period period = Period.between(givenDate, LocalDate.now());
        int idade = period.getYears();

        System.out.println("Digite a matricula do aluno: ");
        int matricula = entrada.nextInt();

        System.out.println("Digite o curso do aluno");
        String curso = entrada.next();

        Aluno aluno = new Aluno(nome, sexo, date, idade, matricula, curso);
        return aluno;
    }


    public static Professor leituraProfessor() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String nome = entrada.next();

        System.out.println("Digite o sexo do professor: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Digite a data de nascimento do professor (dd/MM/yyyy): ");
        String data = entrada.next();

        Date date =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        Period period = Period.between(givenDate, LocalDate.now());
        int idade = period.getYears();

        System.out.println("Digite a matricula do professor: ");
        int matricula = entrada.nextInt();

        System.out.println("Digite a unidade do professor: ");
        String unidade = entrada.next();

        System.out.println("Digite o departamento do professor: ");
        String departamento = entrada.next();

        System.out.println("Digite os horarios de atendimento do professor: ");
        String hora = entrada.next();

        Professor professor = new Professor(nome, sexo, date, idade, matricula, unidade, departamento, hora);
        professor.AdicionaDisciplina();
        return professor;
    }

    public void menu() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;
        List<Pessoa> usuarios = new ArrayList<>();
        Secretario secretario = leituraSecretario();
        usuarios.add(secretario);
        while(sair == false)
        {
            System.out.println("Escolha 1 opcao:" +
                    "\n1. cadastrar aluno" +
                    "\n2. cadastrar professor" +
                    "\n3. cadastrar secretario" +
                    "\n4. pedido de impressao de aluno" +
                    "\n5. pedido de impressao de professor" +
                    "\n6. sair");
            int opcao = entrada.nextInt();
            switch (opcao)
            {
                case 1:
                    Aluno aluno = leituraAluno();
                    usuarios.add(aluno);
                    break;
                case 2:
                    Professor professor = leituraProfessor();
                    usuarios.add(professor);
                    break;
                case 3:
                    secretario = leituraSecretario();
                    usuarios.add(secretario);
                    break;
                case 4:
                    String s2 = "";
                    for (int i = 0; i < usuarios.size(); i++) {
                        String s1 = usuarios.get(i).getClass().getSimpleName();
                        if (s1.equals("Aluno")) {
                            s2 += ((i + 1) + ". " + usuarios.get(i).getNome() + "\n"); //adiciona
                        }
                    }
                        System.out.println("Digite o numero do aluno:\n\n"+s2);
                        int opAluno = entrada.nextInt();
                        opAluno--;
                        Aluno aluno1 = (Aluno) usuarios.get(opAluno);
                        secretario.pedidoImpressaoAluno(aluno1);
                case 5:
                    String s22 = "";
                    for (int i = 0; i < usuarios.size(); i++)
                    {
                        String s1 = usuarios.get(i).getClass().getSimpleName();
                        if(s1.equals("Professor"))
                        {
                            s22 += ((i + 1) + ". " + usuarios.get(i).getNome() + "\n"); //adiciona
                        }
                        System.out.println("Digite o numero do professor:\n\n"+s22);
                        int opProfessor = entrada.nextInt();
                        Professor professor1 = (Professor) usuarios.get(opProfessor);
                        //secretario.pedidoImpressaoProfessor(professor1);
                    }
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Principal principal = new Principal();
        principal.menu();
    }
}
