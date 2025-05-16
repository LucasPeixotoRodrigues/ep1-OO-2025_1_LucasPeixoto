import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean rodagem = true;
        Scanner scanner = new Scanner(System.in);
        String modo;

        while (rodagem) {
            System.out.println("Seja bem vindo ao SIGAA 2.0! Em qual modo você gostaria de operar?");
            System.out.println("1 - Modo Aluno");
            System.out.println("2 - Modo Disciplina");
            System.out.println("3 - Modo Avaliação");
            System.out.println("0 - Sair");
            modo = scanner.nextLine();

            if (modo != "0") {
                
            }
            else {
                break;
            }
        }
    }
}
