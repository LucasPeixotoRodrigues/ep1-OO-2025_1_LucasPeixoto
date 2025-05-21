import java.util.ArrayList;
public class MainTeste {
    public static void main(String[] args) {
        ModoAluno modoAluno = new ModoAluno();
        Aluno aluno = new Aluno();
        Disciplina disciplinas = new Disciplina();
        AlunoEspecial alunoEspecial = new AlunoEspecial();
        ModoDisciplina modoDisciplina = new ModoDisciplina();
        modoAluno.cadastrarAluno();
        //modoDisciplina.cadastrarDisciplina();
        //System.out.println(disciplinas);
        //aluno.fazerMatricula(new ArrayList<Disciplina>());
    }
}
