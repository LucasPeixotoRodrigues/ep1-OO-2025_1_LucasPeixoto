import java.util.Scanner;
import java.util.ArrayList;

public class ModoDisciplina {

    private GerenciadorDeDisciplinas gerenciadorDeDisciplinas;
    Scanner scanner = new Scanner(System.in);

    public ModoDisciplina(GerenciadorDeDisciplinas gerenciador) {
        this.gerenciadorDeDisciplinas = gerenciador;
    }
    
    public void cadastrarDisciplina() {
        System.out.print("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código da disciplina: ");
        String codigo = scanner.nextLine();

         while (gerenciadorDeDisciplinas.buscarDisciplina(codigo) != null) {
            System.out.println("Código já cadastrado. Digite um código diferente.");
            System.out.print("Digite outro código: ");
            codigo = scanner.nextLine();
        }

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
        novaDisciplina.setDisciplina(nome, codigo, cargaHoraria, preRequisitos, new ArrayList<>());
        gerenciadorDeDisciplinas.adicionarDisciplina(novaDisciplina);
        System.out.println("Disciplina cadastrada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Pré-requisitos: " + preRequisitos);
    }
    public void cadastrarTurma() {
        listarDisciplinas();

        System.out.print("Digite o código da disciplina para cadastrar a turma: ");
        String codigo = scanner.nextLine();
        Disciplina disciplina = gerenciadorDeDisciplinas.buscarDisciplina(codigo);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }
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
            System.out.print("A turma é presencial? (s/n): ");
            boolean presencial = scanner.nextLine().equalsIgnoreCase("s");
            String sala = "";

            if (presencial) {
                System.out.print("Digite a sala: ");
                sala = scanner.nextLine();
            }

            System.out.print("Digite o horário (ex: 246m2): ");
            String horario = scanner.nextLine();
            System.out.print("Digite a capacidade máxima de alunos: ");
            int capacidadeMaximaDeAlunos = Integer.parseInt(scanner.nextLine());
            Turma turma = new Turma(
                professorResponsavel,
                semestre,
                formaDeAvaliacao,
                presencial,
                sala,
                horario,
                capacidadeMaximaDeAlunos
            );
            disciplina.adicionarTurma(turma);
            System.out.println("Turma cadastrada com sucesso!");
            System.out.print("Deseja cadastrar outra turma? (s/n): ");
            opcao = scanner.nextLine().charAt(0);
        } while (opcao == 's' || opcao == 'S');
    }

    public void listarDisciplinas() {
        ArrayList<Disciplina> disciplinas = gerenciadorDeDisciplinas.listarDisciplinas();

        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            System.out.println("Disciplinas cadastradas:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(disciplina);
            }
        }
    }
    public void adicionarTurma(String codigoDisciplina, Turma turma) {
    Disciplina d = null;
    for (Disciplina disciplina : gerenciadorDeDisciplinas.listarDisciplinas()) {
        if (disciplina.getCodigo().equalsIgnoreCase(codigoDisciplina)) {
            d = disciplina;
            break;
        }
    }
    if (d!= null) {
        d.adicionarTurma(turma);
        System.out.println("Turma adicionada com sucesso na disciplina " + d.getNomeDisciplina());
    } else {
        System.out.println("Disciplina com código " + codigoDisciplina + " não encontrada.");
    }
}

    public void listarTurmas(Disciplina disciplina) {
    System.out.println("Turmas da disciplina " + disciplina.getNomeDisciplina() + ":");
    for (Turma turma : disciplina.getTurmas()) {
        System.out.println(turma);
    }
}
}
