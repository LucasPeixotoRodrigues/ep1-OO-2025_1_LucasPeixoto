import java.util.Scanner;

public class Main {
    static ModoAluno modoAluno = new ModoAluno();
    static ModoDisciplina modoDisciplina = new ModoDisciplina();
    static ModoAvaliacao modoAvaliacao = new ModoAvaliacao();
    static Aluno aluno = new Aluno();
    static AlunoEspecial alunoEspecial = new AlunoEspecial();
    static Disciplina disiplina = new Disciplina();
    static Avaliacao avaliacao = new Avaliacao();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean executando = true;

        while (executando) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Modo Aluno");
            System.out.println("2 - Modo Disciplina/Turma");
            System.out.println("3 - Modo Avaliação/Frequência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    menuAluno(scanner);
                    break;
                case "2":
                    menuDisciplinaTurma(scanner);
                    break;
                case "3":
                    menuAvaliacaoFrequencia(scanner);
                    break;
                case "0":
                    executando = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    // ================= MENU ALUNO ====================
    public static void menuAluno(Scanner Scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n--- MENU ALUNO ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Matricular em Disciplina");
            System.out.println("4 - Trancar Disciplina");
            System.out.println("5 - Trancar Semestre");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            String opcao = Scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Função de cadastrar aluno.");
                    modoAluno.cadastrarAluno();
                    break;
                case "2":
                    System.out.println("Função de listar alunos.");
                    modoAluno.listarAlunos();
                    break;
                case "3":
                    System.out.println("Função de matricular aluno em disciplina.");
                    modoAluno.fazerMatricula(modoDisciplina.disciplinas);
                    break;
                case "4":
                    System.out.println("Função de trancar disciplina.");
                    modoAluno.trancarMatrícula();
                    break;
                case "5":
                    System.out.println("Função de trancar semestre.");
                    modoAluno.trancarSemestre();
                    break;
                case "0":
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // ================ MENU DISCIPLINA/TURMA =================
    public static void menuDisciplinaTurma(Scanner scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n--- MENU DISCIPLINA/TURMA ---");
            System.out.println("1 - Cadastrar Disciplina");
            System.out.println("2 - Cadastrar Turma");
            System.out.println("3 - Listar Turmas");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Função de cadastrar disciplina.");
                    break;
                case "2":
                    System.out.println("Função de cadastrar turma.");
                    break;
                case "3":
                    System.out.println("Função de listar turmas.");
                    break;
                case "0":
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // ================ MENU AVALIAÇÃO/FREQUÊNCIA =================
    public static void menuAvaliacaoFrequencia(Scanner scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n--- MENU AVALIAÇÃO/FREQUÊNCIA ---");
            System.out.println("1 - Lançar Notas");
            System.out.println("2 - Lançar Frequência");
            System.out.println("3 - Gerar Relatórios");
            System.out.println("4 - Emitir Boletim");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Função de lançar notas.");
                    break;
                case "2":
                    System.out.println("Função de lançar frequência.");
                    break;
                case "3":
                    System.out.println("Função de gerar relatórios.");
                    break;
                case "4":
                    System.out.println("Função de emitir boletim.");
                    break;
                case "0":
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}