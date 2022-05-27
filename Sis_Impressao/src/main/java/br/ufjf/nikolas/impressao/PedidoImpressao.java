package br.ufjf.nikolas.impressao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PedidoImpressao {
    private int numero;
    private Date dataPedido, dataEntrega;
    private String corImpressao, impressora, status;
    private Secretario secretario;
    private Pessoa pessoa;
    private Pagamento pagamento;
    private List<ItemImpressao> itens = new ArrayList<>();
    private static int numeroImpressoes = 0;

    public PedidoImpressao() {
    }

    public PedidoImpressao(int numero, Date dataPedido, String corImpressao, String impressora, String status, Date dataEntrega, Secretario secretario, Pessoa pessoa, Pagamento pagamento) {
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.corImpressao = corImpressao;
        this.impressora = impressora;
        this.status = status;
        this.dataEntrega = dataEntrega;
        this.secretario = secretario;
        this.pessoa = pessoa;
        this.pagamento = pagamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getCorImpressao() {
        return corImpressao;
    }

    public void setCorImpressao(String corImpressao) {
        this.corImpressao = corImpressao;
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getNumeroImpressoes() {
        return numeroImpressoes;
    }

    public void setNumeroImpressoes(int numeroImpressoes) {
        this.numeroImpressoes = numeroImpressoes;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<ItemImpressao> getItens() {
        return itens;
    }

    public void setItens(List<ItemImpressao> itens) {
        this.itens = itens;
    }

    public int adicionaItemAluno(Aluno aluno)
    {
        boolean sair = false;
        Scanner entrada = new Scanner(System.in);

        while(sair == false)
        {
            System.out.println("MENU:" +
                    "\n1. Adicionar item" +
                    "\n2. Sair");
            int opcao = entrada.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Digite o nome do arquivo: ");
                    String arq = entrada.next();
                    System.out.println("Digite o numero de copias: ");
                    int num = entrada.nextInt();
                    if(num <= aluno.getNumMaxcopias())
                    {
                        itens.add(new ItemImpressao(arq, num));
                        System.out.println("Item adicionado");
                        aluno.setNumMaxcopias(aluno.getNumMaxcopias() - num);
                        return 0;
                    }
                    else
                    {
                        aluno.setNumCopias(aluno.getNumCopias() + (num - aluno.getNumMaxcopias()));
                        aluno.setNumMaxcopias(0);
                        return aluno.getNumCopias();
                    }
                case 2:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }
        return -1;
    }

    public int adicionaItemProfessor(Professor professor)
    {
        boolean sair = false;
        Scanner entrada = new Scanner(System.in);

        while(sair == false)
        {
            System.out.println("MENU:" +
                    "\n1. Adicionar item" +
                    "\n2. Sair");
            int opcao = entrada.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Digite o nome do arquivo: ");
                    String arq = entrada.next();
                    System.out.println("Digite o numero de copias: ");
                    int num = entrada.nextInt();
                    if(num <= professor.getNumMaxcopias())
                    {
                        itens.add(new ItemImpressao(arq, num));
                        System.out.println("Item adicionado");
                        professor.setNumMaxcopias(professor.getNumMaxcopias() - num);
                        return 0;
                    }
                    else
                    {
                        professor.setNumCopias(professor.getNumCopias() + (num - professor.getNumMaxcopias()));
                        professor.setNumMaxcopias(0);
                        return professor.getNumCopias();
                    }
                case 2:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }
        return -1;
    }

    public void imprimePedido()
    {
        String dataPed = new SimpleDateFormat("dd/MM/yyyy").format(this.getDataPedido());
        String dataEnt = new SimpleDateFormat("dd/MM/yyyy").format(this.getDataEntrega());
        System.out.println("Pedido de impressao n: "+this.getNumero()+
                "\nData do pedido: "+dataPed+
                "\nCor da Impressao: "+this.getCorImpressao()+
                "\nImpressora: "+this.getImpressora()+
                "\nStatus: "+this.getStatus()+
                "\nData de entrega: "+dataEnt+
                "\nSecretario: "+this.getSecretario().getNome()+
                "\nPessoa: "+this.getPessoa().getNome()+
                "\nFuncao: "+this.getPessoa().getClass().getSimpleName()+
                "\nPagamento: "+this.getPagamento().getValor());
    }
}
