import java.util.ArrayList;

public class GerenciadorDeAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Aluno buscarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public ArrayList<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }
}
