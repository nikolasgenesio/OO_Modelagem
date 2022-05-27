package br.ufjf.nikolas.impressao;

public class DisciplinaSemestre {
    private int anoSemestre; //semestre da disciplina
    private Disciplina disciplina; //Disciplina
    private Professor professor; //Professor

    /**
     * Construtor
     * @param anoSemestre semestre da disciplina
     * @param disciplina Disciplina
     * @param professor Professor
     */
    public DisciplinaSemestre(int anoSemestre, Disciplina disciplina, Professor professor) {
        this.anoSemestre = anoSemestre;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public int getAnoSemestre() {
        return anoSemestre;
    }

    public void setAnoSemestre(int anoSemestre) {
        this.anoSemestre = anoSemestre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
