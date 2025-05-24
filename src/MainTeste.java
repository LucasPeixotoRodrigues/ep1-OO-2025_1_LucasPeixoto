import java.util.ArrayList;
public class MainTeste {
    public static void main(String[] args) {
        ModoAluno modoAluno = new ModoAluno();
        Disciplina disciplinas = new Disciplina();
        AlunoEspecial alunoEspecial = new AlunoEspecial();
        ModoDisciplina modoDisciplina = new ModoDisciplina();
        modoAluno.cadastrarAluno();
        modoDisciplina.cadastrarDisciplina();
        modoDisciplina.cadastrarTurma();
        //System.out.println(modoDisciplina.disciplinas);
        //modoAluno.fazerMatricula(new ArrayList<Disciplina>());
        //alunoEspecial.fazerMatrícula();
        //modoAluno.trancarMatrícula();
        //modoAluno.trancarSemestre();
        //modoAluno.cadastrarAluno();
        modoAluno.listarAlunos();
    }
}
