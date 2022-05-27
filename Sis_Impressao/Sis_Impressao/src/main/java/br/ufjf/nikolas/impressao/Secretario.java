package br.ufjf.nikolas.impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Secretario extends Funcionario {
    private static String horario; //hoario

    /**
     * Construtor
     * @param nome nome do secretario
     * @param sexo sexo do secretario
     * @param data_nascimento data de nascimento do secretario
     * @param idade idade do secretario
     * @param matricula matricula do secretario
     * @param unidade unidade do secretario
     * @param departamento departamento do secretario
     * @param horario horario do secretario
     */
    public Secretario(String nome, char sexo, Date data_nascimento, int idade, int matricula, String unidade, String departamento, String horario) {
        super(nome, sexo, data_nascimento, idade, matricula, unidade, departamento);
        this.horario = horario;
    }

    /**
     * Registrar pedido de impressao do aluno
     * @param aluno aluno
     * @throws ParseException
     */
    public void pedidoImpressaoAluno(Aluno aluno) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero do pedido: ");
        int numero = entrada.nextInt();

        System.out.println("Digite a data do pedido (dd/MM/yyyy): ");
        String data = entrada.next();
        Date data_Pedido =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        System.out.println("Digite a cor da impressao: ");
        String cor = entrada.next();

        System.out.println("Digite a impressora: ");
        String impressora = entrada.next();

        System.out.println("Digite o status do pedido: ");
        String status = entrada.next();

        System.out.println("Digite a data de entrega do pedido (dd/MM/yyyy): ");
        data = entrada.next();
        Date data_Entrega =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        System.out.println("Digite a forma de pagamento: ");
        String forma = entrada.next();

        status = "entregue";

        PedidoImpressao pedidoImpressao = new PedidoImpressao();
        int val = pedidoImpressao.adicionaItemAluno(aluno);

        PedidoImpressao pedidoImpressao1 = new PedidoImpressao(numero, data_Pedido,
                cor, impressora, status, data_Entrega, this,
                aluno, new Pagamento((float) (val * 0.25), forma));

        pedidoImpressao1.imprimePedido();
    }

    /**
     * Registrar pedido de impressao do professor
     * @param professor professor
     * @throws ParseException
     */
    public void pedidoImpressaoProfessor(Professor professor) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero do pedido: ");
        int numero = entrada.nextInt();

        System.out.println("Digite a data do pedido (dd/MM/yyyy): ");
        String data = entrada.next();
        Date data_Pedido =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        System.out.println("Digite a cor da impressao: ");
        String cor = entrada.next();

        System.out.println("Digite a impressora: ");
        String impressora = entrada.next();

        System.out.println("Digite o status do pedido: ");
        String status = entrada.next();

        System.out.println("Digite a data de entrega do pedido (dd/MM/yyyy): ");
        data = entrada.next();
        Date data_Entrega =new SimpleDateFormat("dd/MM/yyyy").parse(data);

        System.out.println("Digite a forma de pagamento: ");
        String forma = entrada.next();

        status = "entregue";

        PedidoImpressao pedidoImpressao = new PedidoImpressao();
        int val = pedidoImpressao.adicionaItemProfessor(professor);

        PedidoImpressao pedidoImpressao1 = new PedidoImpressao(numero, data_Pedido,
                cor, impressora, status, data_Entrega, this,
                professor, new Pagamento((float) (val * 0.25), forma));

        pedidoImpressao1.imprimePedido();
    }

}
