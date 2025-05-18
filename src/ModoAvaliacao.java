import java.util.Scanner;

public class ModoAvaliacao {

    Scanner scanner = new Scanner(System.in);

    public void lancarNota() {
        System.out.print("Forma de avaliação(a ou b):");
        char formaDeAvaliacao = scanner.next().charAt(0);
        System.out.print("Digite a nota da P1:");
        float p1 = scanner.nextFloat();
        System.out.print("Digite a nota da P2:");
        float p2 = scanner.nextFloat();
        System.out.print("Digite a nota da P3:");
        float p3 = scanner.nextFloat();
        System.out.print("Digite a nota da lista de exercícios:");
        float listaDeExercícios = scanner.nextFloat();
        System.out.print("Digite a nota do seminário:");
        float seminário = scanner.nextFloat();
    
    
    if (formaDeAvaliacao == 'a') {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setAvaliacao(p1, p2, p3, listaDeExercícios, seminário);
        avaliacao.médiaFinalA();
        System.out.println("Média final: " + avaliacao.médiaFinal);
    } else if (formaDeAvaliacao == 'b') {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setAvaliacao(p1, p2, p3, listaDeExercícios, seminário);
        avaliacao.médiaFinalB();
        System.out.println("Média final: " + avaliacao.médiaFinal);
    } else {
        System.out.println("Forma de avaliação inválida.");
    }
}
}
