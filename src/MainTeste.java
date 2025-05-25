import java.util.ArrayList;
import java.util.Scanner;
public class MainTeste {
    public static void main(String[] args) {
        ModoAluno modoAluno = new ModoAluno();
        Disciplina disciplinas = new Disciplina();
        AlunoEspecial alunoEspecial = new AlunoEspecial();
        ModoDisciplina modoDisciplina = new ModoDisciplina();
        //modoAluno.cadastrarAluno();
        modoDisciplina.cadastrarDisciplina();
        Scanner sc = new Scanner(System.in);

        // Cadastro de uma disciplina

        System.out.println("Cadastro de turmas para a disciplina " + modoDisciplina);

        char opcao;
        do {
            System.out.print("Digite o nome do professor: ");
            String professorResponsavel = sc.nextLine();

            System.out.print("Digite o semestre (ex: 2025.1): ");
            String semestre = sc.nextLine();

            System.out.print("Qual a forma de avaliação? ");
            System.out.println("a. Pesos iguais");
            System.out.println("b. Pesos diferentes");
            String formaDeAvaliacao = sc.nextLine();
            boolean formaChar = formaDeAvaliacao.equalsIgnoreCase("a") || formaDeAvaliacao.equalsIgnoreCase("b");

            System.out.print("A turma é presencial? (s/n): ");
            String resp = sc.nextLine();
            boolean presencial = resp.equalsIgnoreCase("s");

            String sala = "";
            if (presencial) {
                System.out.print("Digite a sala: ");
                sala = sc.nextLine();
            }
            System.out.print("Digite o horário (ex: Terça 10h-12h): ");
            String horario = sc.nextLine();

            System.out.print("Digite a capacidade máxima de alunos: ");
            int capacidadeMaximaDeAlunos = Integer.parseInt(sc.nextLine());

            // Criando e adicionando a turma na disciplina
            Turma turma = new Turma(professorResponsavel, semestre, formaDeAvaliacao, presencial, sala, horario, capacidadeMaximaDeAlunos);
            modoDisciplina.adicionarTurma(turma);

            System.out.print("Deseja cadastrar outra turma? (s/n): ");
            opcao = sc.nextLine().charAt(0);

        } while (opcao == 's' || opcao == 'S');

        // Listando turmas cadastradas
        modoDisciplina.listarTurmas();

        sc.close();
    }
        //modoDisciplina.cadastrarTurma();
        //System.out.println(modoDisciplina.disciplinas);
        //modoAluno.fazerMatricula(new ArrayList<Disciplina>());
        //alunoEspecial.fazerMatrícula();
        //modoAluno.trancarMatrícula();
        //modoAluno.trancarSemestre();
        //modoAluno.cadastrarAluno();
        //modoAluno.listarAlunos();
        //modoDisciplina.listarDisciplinas();
        //modoDisciplina.listarTurmas();
    }
