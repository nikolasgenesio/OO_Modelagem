package br.ufjf.nikolas.impressao;

public class Pagamento {
    private float valor; //valor toal
    private String formaPagamento; //forma de pagamento

    /**
     * Constutor
     * @param valor valor total
     * @param formaPagamento forma de pagamento
     */
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
}
