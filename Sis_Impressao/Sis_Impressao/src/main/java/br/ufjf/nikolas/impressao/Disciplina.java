package br.ufjf.nikolas.impressao;

public class Disciplina {
    private String nome; //nome da disciplina

    /**
     * Construtor
     * @param nome nome da disciplina
     */
    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
