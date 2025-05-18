import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ModoAluno modoAluno = new ModoAluno();
    static ModoDisciplina modoDisciplina = new ModoDisciplina();
    static ModoAvaliacao modoAvaliacao = new ModoAvaliacao();
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Disciplina");
            System.out.println("3. Lançar Nota");
            System.out.println("4. Sair");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    modoAluno.cadastrarAluno();
                    break;
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
