import java.util.Scanner;
import java.util.ArrayList;

public class ModoDisciplina {
    Scanner scanner = new Scanner(System.in);
    public void cadastrarDisciplina() {
        System.out.print("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código da disciplina: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite a carga horária da disciplina: ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite os pré-requisitos da disciplina (separe por vírgula): ");
        String prereqsInput = scanner.nextLine();
        ArrayList<String> prerequisitos = new ArrayList<>();
        if (!prereqsInput.trim().isEmpty()) {
            for (String prereq : prereqsInput.split(",")) {
                prerequisitos.add(prereq.trim());
            }
        }

        System.out.println("Disciplina cadastrada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Pré-requisitos: " + prerequisitos);
    }
    public void cadastrarTurma() {
        System.out.print("Digite o nome da turma: ");
        String nomeTurma = scanner.nextLine();
        System.out.print("Digite o nome do professor:");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Digite o código da turma: ");
        String codigoTurma = scanner.nextLine();
        System.out.print("Digite ")
        System.out.print("Digite o horário da turma: ");
        String horario = scanner.nextLine();

        System.out.println("Turma cadastrada com sucesso!");
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Professor: " + nomeProfessor);
        System.out.println("Código da Turma: " + codigoTurma);
        System.out.println("Horário da Turma: " + horario);
    }
    
}
