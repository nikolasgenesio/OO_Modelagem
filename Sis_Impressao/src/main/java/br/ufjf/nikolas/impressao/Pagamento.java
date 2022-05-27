package br.ufjf.nikolas.impressao;

public class Pagamento {
    private float valor;
    private String formaPagamento;
    private PedidoImpressao pedidoImpressao;

    public Pagamento() {
    }

    public Pagamento(float valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public float calculaValor()
    {
        //System.out.println(pedidoImpressao.getPessoa().getClass().getName());
        return (float) 1;
    }
}
