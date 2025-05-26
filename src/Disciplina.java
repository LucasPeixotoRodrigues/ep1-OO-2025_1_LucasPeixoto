import java.util.ArrayList;

public class Disciplina {

    protected String nomeDisciplina;
    protected String codigo;
    protected int cargaHoraria;
    ArrayList<String> préRequisitos = new ArrayList<String>();
    ArrayList<Turma> turmas = new ArrayList<>();

    public void setDisciplina(String nomeDisciplina, String codigo, int cargaHoraria, ArrayList<String> préRequisitos, ArrayList<Turma> turmas) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.préRequisitos = préRequisitos;
        this.turmas = new ArrayList<>(); 
    }

        public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

        public String getNomeDisciplina() {
        return nomeDisciplina;
    }
        public String getCodigo() {
        return codigo;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public ArrayList<String> getPréRequisitos(){
        return préRequisitos;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nomeDisciplina + " | Código: " + codigo + " | Carga Horária: " + cargaHoraria;
    }
}
