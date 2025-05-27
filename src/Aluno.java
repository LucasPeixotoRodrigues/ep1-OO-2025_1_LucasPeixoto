import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private String cursoDeGraduacao;
    private ArrayList<String> turmasMatriculadas = new ArrayList<>();
    private ArrayList<Disciplina> disciplinasFeitas = new ArrayList<>();

    public Aluno(String nome, String matricula, String cursoDeGraduacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursoDeGraduacao = cursoDeGraduacao;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCursoDeGraduacao() {
        return cursoDeGraduacao;
    }

    public ArrayList<String> getTurmasMatriculadas() {
        return turmasMatriculadas;
    }
    
    public ArrayList<Disciplina> getDisciplinasFeitas() {
        return disciplinasFeitas;
    }

    public void adicionarDisciplinaFeita(Disciplina disciplina) {
        disciplinasFeitas.add(disciplina);
    }

    public void adicionarTurma(String nomeDisciplina) {
        turmasMatriculadas.add(nomeDisciplina);
    }
}

