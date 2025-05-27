import java.util.ArrayList;

public class GerenciadorDeAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Aluno buscarAluno(String matricula) {
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
