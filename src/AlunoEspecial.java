import java.util.Scanner;

public class AlunoEspecial extends Aluno {
    Scanner scanner = new Scanner(System.in);

    public AlunoEspecial(String nome, String matricula, String cursoDeGraduacao) {
        super(nome, matricula, cursoDeGraduacao);
    }

    public void fazerMatricula() {
        if (getTurmasMatriculadas().size() < 3) {
            System.out.print("Fazer matrícula em: ");
            String nomeDisciplina = scanner.nextLine();
            getTurmasMatriculadas().add(nomeDisciplina);
            System.out.printf("Matrícula em %s realizada com sucesso.\n", nomeDisciplina);
        } else {
            System.out.println("Limite de disciplinas atingido (máximo 3).");
        }
    }

    public void trancarMatricula() {
        System.out.print("Trancar matrícula em: ");
        String nomeDisciplina = scanner.nextLine();
        if (getTurmasMatriculadas().remove(nomeDisciplina)) {
            System.out.printf("Matrícula em %s foi trancada com sucesso.\n", nomeDisciplina);
        } else {
            System.out.println("Você não está matriculado nessa disciplina.");
        }
    }

    public void trancarSemestre() {
        System.out.print("Deseja trancar o semestre? (s/n): ");
        char resposta = scanner.next().charAt(0);
        scanner.nextLine(); // consumir quebra de linha pendente

        if (resposta == 's' || resposta == 'S') {
            getTurmasMatriculadas().clear();
            System.out.println("Trancamento do semestre realizado com sucesso.");
        } else if (resposta == 'n' || resposta == 'N') {
            System.out.println("Trancamento do semestre não realizado.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}