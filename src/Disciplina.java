import java.util.ArrayList;

public class Disciplina {
    public static Object nomeDisciplina;
    protected String nomeDisciplna;
    protected String codigo;
    protected int cargaHoraria;
    ArrayList<String> préRequisitos = new ArrayList<String>();
    ArrayList<Turma> turmas = new ArrayList<>();

    public void setDisciplina(String nomeDisciplina, String codigo, int cargaHoraria, ArrayList<String> préRequisitos, ArrayList<Turma> turmas) {
        this.nomeDisciplna = nomeDisciplina;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.préRequisitos = préRequisitos;
        this.turmas = new ArrayList<>();

    }
        public String getNomeDisciplina() {
        return nomeDisciplna;
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

}
