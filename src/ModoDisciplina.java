import java.util.Scanner;
import java.util.ArrayList;

public class ModoDisciplina {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    ArrayList<String> turmas = new ArrayList<String>();

    public void cadastrarDisciplina() {
        System.out.print("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código da disciplina: ");
        String codigo = scanner.nextLine();
        boolean codigoExistente;
        do {
            codigoExistente = false;
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getCódigo().equals(codigo)) {
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
        novaDisciplina.setDisciplina(nome, codigo, cargaHoraria, preRequisitos);
        disciplinas.add(novaDisciplina);
        System.out.println("Disciplina cadastrada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Pré-requisitos: " + preRequisitos);
    }
    public void cadastrarTurma() {
        System.out.print("Digite o nome da turma: ");
        String nomeTurma = scanner.nextLine();
        System.out.print("Digite o nome do professor:");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Digite o semestre: ");
        int semestre = scanner.nextInt();
        System.out.print("Digite o forma de avaliação: ");
        String formaDeAvaliacao = scanner.nextLine();
        System.out.print("Digite o modelo de ensino (remoto ou presencial): ");
        String modeloDeEnsino = scanner.nextLine();
        System.out.print("Digite o horário da turma: ");
        String horario = scanner.nextLine();
        turmas.add(nomeTurma);

        System.out.println("Turma cadastrada com sucesso!");
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Professor: " + nomeProfessor);
        System.out.println("Semestre: " + semestre);
        System.out.println("Forma de avaliação: " + formaDeAvaliacao);
        System.out.println("Modelo de ensino: " + modeloDeEnsino);
        System.out.println("Horário da aula: " + horario);
    }
    
}
