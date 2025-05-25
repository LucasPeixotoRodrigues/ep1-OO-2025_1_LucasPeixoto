import java.util.ArrayList;
import java.util.Scanner;
public class MainTeste {
    public static void main(String[] args) {
        ModoAluno modoAluno = new ModoAluno();
        Disciplina disciplinas = new Disciplina();
        AlunoEspecial alunoEspecial = new AlunoEspecial();
        ModoDisciplina modoDisciplina = new ModoDisciplina();

        modoDisciplina.cadastrarDisciplina();
        modoDisciplina.cadastrarTurma();
        // Listando turmas cadastradas
        modoDisciplina.listarTurmas();
        //modoDisciplina.cadastrarTurma();
        //System.out.println(modoDisciplina.disciplinas);
        //modoAluno.fazerMatricula(new ArrayList<Disciplina>());
        //alunoEspecial.fazerMatrícula();
        //modoAluno.trancarMatrícula();
        //modoAluno.trancarSemestre();
        //modoAluno.cadastrarAluno();
        //modoAluno.listarAlunos();
        modoDisciplina.listarDisciplinas();
        modoDisciplina.listarTurmas();
    }
}
