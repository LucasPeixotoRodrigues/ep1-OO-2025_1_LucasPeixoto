import java.util.ArrayList;

public class Disciplina {
    private String nomeDisciplina;
    private String codigo;
    private int cargaHoraria;
    private ArrayList<String> preRequisitos = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public ArrayList<String> getPreRequisitos() {
        return preRequisitos;
    }
    public void adicionarPreRequisito(String nomeDisciplina) {
        preRequisitos.add(nomeDisciplina);
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}
