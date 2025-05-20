import java.util.ArrayList;
public class MainTeste {
    public static void main(String[] args) {
        ModoAluno modoAluno = new ModoAluno();
        Aluno aluno = new Aluno();
        AlunoEspecial alunoEspecial = new AlunoEspecial();
        ModoDisciplina modoDisciplina = new ModoDisciplina();
        modoDisciplina.cadastrarDisciplina();
        aluno.fazerMatricula(new ArrayList<Disciplina>());
    }
}
