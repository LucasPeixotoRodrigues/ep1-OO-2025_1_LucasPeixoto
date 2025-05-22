import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ModoAluno modoAluno = new ModoAluno();
    static ModoDisciplina modoDisciplina = new ModoDisciplina();
    static ModoAvaliacao modoAvaliacao = new ModoAvaliacao();
    static Aluno aluno = new Aluno();
    static AlunoEspecial alunoEspecial = new AlunoEspecial();
    static Disciplina disiplina = new Disciplina();
    static Avaliacao avaliacao = new Avaliacao();
    static Turma turma = new Turma();
    protected ArrayList<String> turmasMatriculadas = new ArrayList<String>();
    protected ArrayList<String> disciplinasFeitas = new ArrayList<String>();
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Modo Aluno");
            System.out.println("2. Modo Disciplina");
            System.out.println("3. Modo Avaliação");
            System.out.println("4. Sair");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Cadastrar aluno");
                    System.out.println("2. Fazer matrícula em disciplina");
                    System.out.println("3. Trancar matríula em disciplina");
                    System.out.println("4. Trancar semestre");
                    System.out.println("5. Voltar");
                    int opcaoAluno = scanner.nextInt();
                    switch(opcaoAluno) {
                        case 1:
                            modoAluno.cadastrarAluno();
                            scanner.close();
                            return;
                        case 2:
                            System.out.println("Informe o tipo de aluno (1 - Aluno regular, 2 - Aluno especial):");
                            int tipoAluno = scanner.nextInt();
                            if (tipoAluno == 1) {
                                aluno.fazerMatricula(modoDisciplina.disciplinas);
                            } else if (tipoAluno == 2) {
                                alunoEspecial.fazerMatrícula();
                            } else {
                                System.out.println("Tipo de aluno inválido.");
                            }
                            scanner.close();
                            return;
                        case 3:
                            aluno.trancarMatrícula();
                            scanner.close();
                            return;
                        case 4:
                            aluno.trancarSemestre();
                            scanner.close();
                            return;
                        case 5:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    scanner.close();
                    return;
                case 2:
                
                    modoDisciplina.cadastrarDisciplina();
                    break;
                case 3:
                    modoAvaliacao.lancarNota();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            scanner.close();
            modoAluno.scanner.close();
            modoDisciplina.scanner.close();
            modoAvaliacao.scanner.close();
        }
    }
}
