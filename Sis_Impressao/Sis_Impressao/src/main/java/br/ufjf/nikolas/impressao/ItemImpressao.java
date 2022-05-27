package br.ufjf.nikolas.impressao;

public class ItemImpressao {

    private String arquivo; //arquivo
    private int numCopias; //numero de copias

    /**
     * Construtor
     * @param arquivo aquivo
     * @param numCopias numero de copias
     */
    public ItemImpressao(String arquivo, int numCopias) {
        this.arquivo = arquivo;
        this.numCopias = numCopias;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
}
