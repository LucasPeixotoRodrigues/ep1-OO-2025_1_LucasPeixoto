import java.util.Scanner;
import java.util.ArrayList;

public class ModoDisciplina extends Disciplina{

    Scanner scanner = new Scanner(System.in);
    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void cadastrarDisciplina() {
        System.out.print("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código da disciplina: ");
        String codigo = scanner.nextLine();
        boolean codigoExistente;
        do {
            codigoExistente = false;
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getCodigo().equals(codigo)) {
                    codigoExistente = true;
                    System.out.println("Código já cadastrado. Digite um código diferente.");
                    System.out.print("Digite outro código: ");
                    codigo = scanner.nextLine();
                    break;
                }
            }
        } while (codigoExistente);
        
        System.out.print("Digite a carga horária da disciplina (número de horas): ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite os pré-requisitos da disciplina (separe por vírgula): ");
        String prereqsInput = scanner.nextLine();
        ArrayList<String> preRequisitos = new ArrayList<>();
        if (!prereqsInput.trim().isEmpty()) {
            for (String prereq : prereqsInput.split(",")) {
                preRequisitos.add(prereq.trim());
            }
        }
        Disciplina novaDisciplina = new Disciplina();
        novaDisciplina.setDisciplina(nome, codigo, cargaHoraria, preRequisitos, turmas);
        disciplinas.add(novaDisciplina);
        System.out.println("Disciplina cadastrada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Pré-requisitos: " + preRequisitos);
    }
    public void cadastrarTurma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de turmas para a disciplina " + nomeDisciplina);

        char opcao;
        do {
            System.out.print("Digite o nome do professor: ");
            String professorResponsavel = scanner.nextLine();

            System.out.print("Digite o semestre (ex: 2025.1): ");
            String semestre = scanner.nextLine();

            System.out.println("Qual a forma de avaliação? ");
            System.out.println("a. Pesos iguais");
            System.out.println("b. Pesos diferentes");
            String formaDeAvaliacao = scanner.nextLine();
            boolean formaChar = formaDeAvaliacao.equalsIgnoreCase("a") || formaDeAvaliacao.equalsIgnoreCase("b");

            System.out.print("A turma é presencial? (s/n): ");
            String resp = scanner.nextLine();
            boolean presencial = resp.equalsIgnoreCase("s");

            String sala = "";
            if (presencial) {
                System.out.print("Digite a sala: ");
                sala = scanner.nextLine();
            }
            System.out.print("Digite o horário (ex: 246m2): ");
            String horario = scanner.nextLine();

            System.out.print("Digite a capacidade máxima de alunos: ");
            int capacidadeMaximaDeAlunos = Integer.parseInt(scanner.nextLine());

            // Criando e adicionando a turma na disciplina
            Turma turma = new Turma(professorResponsavel, semestre, formaDeAvaliacao, presencial, sala, horario, capacidadeMaximaDeAlunos);
            this.adicionarTurma(turma);

            System.out.print("Deseja cadastrar outra turma? (s/n): ");
            opcao = scanner.nextLine().charAt(0);

        } while (opcao == 's' || opcao == 'S');
    }
    public void listarDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            System.out.println("Disciplinas cadastradas: ");
            for (Disciplina disciplina : disciplinas) {
                System.out.print(disciplina.getNomeDisciplina() + " - " + disciplina.getCodigo());
            }
        }
    }
    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void listarTurmas() {
        System.out.println("Turmas da disciplina " + nomeDisciplna + ":");
        for (Turma turma : turmas) {
            System.out.println(turma);
        }
    }

    @Override
    public String toString() {
        return "Disciplina: " + nomeDisciplina + " | Código: " + codigo + " | Carga Horária: " + cargaHoraria;
    }
}
