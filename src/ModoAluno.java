import java.util.Scanner;

public class ModoAluno{
    Scanner scanner = new Scanner(System.in);
    public void cadastrarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.println("Informe o tipo de aluno:");
        System.out.println("1. Aluno Regular");
        System.out.println("2. Aluno Especial");
        int tipoAluno = scanner.nextInt();

        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        if (tipoAluno == 1) {
            System.out.println("Aluno regular");
        }
        else if (tipoAluno == 2) {
            System.out.println("Aluno especial");
        }
        else {
            while (tipoAluno != 1 && tipoAluno != 2) {
                System.out.println("Tipo de aluno inválido. Tente novamente.");
                tipoAluno = scanner.nextInt();
            }
        }
    }
}
