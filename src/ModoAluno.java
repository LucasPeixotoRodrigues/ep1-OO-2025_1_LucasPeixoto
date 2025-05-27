import java.util.ArrayList;
import java.util.Scanner;

public class ModoAluno {
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarAluno() {
        System.out.println("\nCadastro de Aluno");
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula (9 dígitos): ");
        String matricula = scanner.nextLine();

        while (matricula.length() != 9 || !matricula.matches("\\d+")) {
            System.out.println("Matrícula inválida. Deve ter 9 dígitos numéricos.");
            System.out.print("Digite novamente: ");
            matricula = scanner.nextLine();
        }

        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                System.out.println("Matrícula já cadastrada.");
                return;
            }
        }

        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, curso);

        System.out.print("Quais disciplinas o aluno já fez? (separe por vírgula): ");
        String input = scanner.nextLine();

        if (!input.trim().isEmpty()) {
            String[] disciplinas = input.split(",");
            for (String nomeDisciplina : disciplinas) {
                Disciplina d = new Disciplina(nomeDisciplina.trim());
                aluno.adicionarDisciplinaFeita(d);
            }
        }

        listaDeAlunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCursoDeGraduacao());
        System.out.println("Disciplinas feitas: " + aluno.getDisciplinasFeitas());
        System.out.println("Turmas matriculadas: " + aluno.getTurmasMatriculadas());
    }

    public void listarAlunos() {
        System.out.println("\nAlunos cadastrados:");
        for (Aluno aluno : listaDeAlunos) {
            System.out.println("- " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void fazerMatricula(Aluno aluno, ArrayList<Disciplina> disciplinas) {
        System.out.print("\nDigite o nome da disciplina para matrícula: ");
        String nomeDisciplina = scanner.nextLine();

        Disciplina disciplinaSelecionada = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNomeDisciplina().equalsIgnoreCase(nomeDisciplina)) {
                disciplinaSelecionada = disciplina;
                break;
            }
        }

        if (disciplinaSelecionada == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        ArrayList<String> preRequisitos = disciplinaSelecionada.getPreRequisitos();
        boolean possuiTodos = true;

        for (String pre : preRequisitos) {
            boolean encontrou = false;
            for (Disciplina feita : aluno.getDisciplinasFeitas()) {
                if (pre.trim().equalsIgnoreCase(feita.getNomeDisciplina().trim())) {
                    encontrou = true;
                    break;
                }
            }
            if (!encontrou) {
                possuiTodos = false;
                break;
            }
        }

        if (!possuiTodos) {
            System.out.println("Você não possui todos os pré-requisitos.");
            return;
        }

        if (aluno.getTurmasMatriculadas().contains(nomeDisciplina)) {
            System.out.println("Você já está matriculado nessa disciplina.");
            return;
        }

        if (aluno.getTurmasMatriculadas().size() >= 6) {
            System.out.println("Limite de 6 disciplinas atingido.");
            return;
        }

        ArrayList<Turma> turmasDisponiveis = disciplinaSelecionada.getTurmas();
        if (turmasDisponiveis.isEmpty()) {
            System.out.println("Não há turmas disponíveis para essa disciplina.");
            return;
        }

        System.out.println("\nTurmas disponíveis:");
        for (Turma turma : turmasDisponiveis) {
            System.out.println("- Código: " + turma.getCodigoDisciplina() +
                               " | Horário: " + turma.getHorario() +
                               " | Vagas: " + (turma.getCapacidadeMaximaDeAlunos() - turma.getVagasOcupadas()));
        }

        System.out.print("Digite o código da turma: ");
        String codigoTurma = scanner.nextLine();

        boolean turmaEncontrada = false;
        for (Turma turma : turmasDisponiveis) {
            if (turma.getCodigoDisciplina().equalsIgnoreCase(codigoTurma)) {
                turmaEncontrada = true;
                if (turma.getVagasOcupadas() < turma.getCapacidadeMaximaDeAlunos()) {
                    aluno.adicionarTurma(nomeDisciplina);
                    turma.setVagasOcupadas(turma.getVagasOcupadas() + 1);
                    System.out.println("Matrícula realizada com sucesso.");
                } else {
                    System.out.println("Não há vagas disponíveis nesta turma.");
                }
                break;
            }
        }

        if (!turmaEncontrada) {
            System.out.println("Turma não encontrada.");
        }
    }
    public void trancarMatricula(Aluno aluno) {
        System.out.print("\nDigite o nome da disciplina para trancar matrícula: ");
        String nomeDisciplina = scanner.nextLine();

        if (!aluno.getTurmasMatriculadas().contains(nomeDisciplina)) {
            System.out.println("Você não está matriculado nessa disciplina.");
            return;
        }

        aluno.getTurmasMatriculadas().remove(nomeDisciplina);
        System.out.println("Matrícula em " + nomeDisciplina + " trancada com sucesso.");
    }
    public void trancarSemestre(Aluno aluno) {
        System.out.print("\nDeseja trancar o semestre? (s/n): ");
        char resposta = scanner.next().charAt(0);
        scanner.nextLine(); // Limpar o buffer do scanner

        if (resposta == 's' || resposta == 'S') {
            aluno.getTurmasMatriculadas().clear();
            System.out.println("Semestre trancado com sucesso.");
        } else if (resposta == 'n' || resposta == 'N') {
            System.out.println("Trancamento do semestre não realizado.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
