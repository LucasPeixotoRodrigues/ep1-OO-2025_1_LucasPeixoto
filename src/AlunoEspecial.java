import java.util.ArrayList;

public class AlunoEspecial extends Aluno {
    protected ArrayList<String> turmasMatriculadas = new ArrayList<String>();
    protected ArrayList<String> disciplinasFeitas = new ArrayList<String>();

    
    public void setTurmasMatriculadas(ArrayList<String> turmasMatriculadas, ArrayList<String> disciplinasFeitas) {
        this.turmasMatriculadas = turmasMatriculadas;
        this.disciplinasFeitas = disciplinasFeitas;
    }
    public ArrayList<String> getTurmasMatriculadas() {
        return turmasMatriculadas;
    }
        public ArrayList<String> getDisciplinasFeitas() {
        return disciplinasFeitas;
    }

    public void fazerMatrícula(){
        if (turmasMatriculadas.size() < 3) {
            System.out.format("Fazer matrícula em %s", Disciplina.nomeDisciplina);
            turmasMatriculadas.add(nomeDisciplna);
        } 
        else {
            System.out.println("Limite de disciplinas atingido");
        }
    }
    public void trancarMatrícula(){
        System.out.format("Trancar matrícula em %s", Disciplina.nomeDisciplina);
        turmasMatriculadas.remove(nomeDisciplina);
    }
    public void trancarSemestre(){
        turmasMatriculadas.clear();
        System.out.println("Trancamento do semestre realizado com sucesso");
    }
}
