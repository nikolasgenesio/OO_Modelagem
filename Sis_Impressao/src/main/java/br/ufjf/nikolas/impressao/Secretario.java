package br.ufjf.nikolas.impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Secretario extends Funcionario {
    private static String horario;

    public Secretario(String nome, char sexo, Date data_nascimento, int idade, int matricula, String unidade, String departamento, String horario) {
        super(nome, sexo, data_nascimento, idade, matricula, unidade, departamento);
        this.horario = horario;
    }

    public void pedidoImpressaoAluno(Aluno aluno) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero do pedido: ");
        int numero = entrada.nextInt();

        System.out.println("Digite a data do pedido (dd/MM/yyyy): ");
        String data = entrada.next();
        Date data_Pedido =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        System.out.println("Digite a cor da impressão: ");
        String cor = entrada.next();

        System.out.println("Digite a impressora: ");
        String impressora = entrada.next();

        System.out.println("Digite o status do pedido: ");
        String status = entrada.next();

        System.out.println("Digite a data do pedido (dd/MM/yyyy): ");
        data = entrada.next();
        Date data_Entrega =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        PedidoImpressao pedidoImpressao = null;

        System.out.println("Digite a forma de pagamento: ");
        String forma = entrada.next();


        pedidoImpressao = new PedidoImpressao(numero, data_Pedido,
                cor, impressora, status, data_Entrega, this,
                aluno, new Pagamento(1, forma));
    }

    /*
    public void pedidoImpressaoProfessor(Professor professor)
    {
        PedidoImpressao pedidoImpressao = new PedidoImpressao(1, "21/12/2020",
                "pb", "i", "i", "12/12/2012", this,
                professor, new Pagamento(4, "credito"));
        pedidoImpressao.adicionaItemProfessor(professor);
    }

     */
}
