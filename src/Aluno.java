import java.util.ArrayList;

public class Aluno extends Disciplina{
    private String nome;
    private int matricula;
    private String cursoDeGraduação;
    private ArrayList<String> turmasMatriculadas = new ArrayList<String>();
    private ArrayList<String> disciplinasFeitas = new ArrayList<String>();

    
    public void setTurmasMatriculadas(ArrayList<String> turmasMatriculadas) {
        this.turmasMatriculadas = turmasMatriculadas;
    }
    public void setDisciplinasFeitas(ArrayList<String> disciplinasFeitas) {
        this.disciplinasFeitas = disciplinasFeitas;
    }
    public void setAluno(String nome, int matricula, String cursoDeGraduação){
        this.nome = nome;
        this.matricula = matricula;
        this.cursoDeGraduação = cursoDeGraduação;
    }
    public String getNome(){
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
        public String getCursoDeGraduação() {
        return cursoDeGraduação;
    }
    public ArrayList<String> getTurmasMatriculadas() {
        return turmasMatriculadas;
    }
        public ArrayList<String> getDisciplinasFeitas() {
        return disciplinasFeitas;
    }

    public void fazerMatrícula(){
        System.out.format("Fazer matrícula em %s", Disciplina.nomeDisciplina);
        turmasMatriculadas.add(nomeDisciplna);
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
