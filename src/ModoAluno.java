
import java.util.ArrayList;
import java.util.Scanner;

public class ModoAluno extends Aluno{

    public void fazerMatricula(ArrayList<Disciplina> disciplinas) {
        System.out.print("Fazer matrícula em:");
        String nomeDisciplina = scanner.nextLine();
        Disciplina disciplinaSelecionada = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNomeDisciplina().equalsIgnoreCase(nomeDisciplina)) {
                disciplinaSelecionada = disciplina;
                break;
            }
        }
        ArrayList<String> preRequisitos = disciplinaSelecionada.getPréRequisitos();
        boolean possuiTodosPreRequisitos = true;
        for (String pre : preRequisitos) {
            if (!disciplinasFeitas.contains(pre)) {
                possuiTodosPreRequisitos = false;
                break;
            }
        }
        if (possuiTodosPreRequisitos) {
            turmasMatriculadas.add(nomeDisciplina);
            System.out.format("Matrícula em %s realizada com sucesso", nomeDisciplina);
        } else {
            System.out.println("Você não possui todos os pré-requisitos para essa disciplina.");
        }
    }
    public void trancarMatrícula(){
        System.out.print("Trancar matrícula em:");
        String nomeDisciplina = scanner.nextLine();
        turmasMatriculadas.remove(nomeDisciplna);
        System.out.format("Matrícula em %s realizada com sucesso", nomeDisciplina);
    }
    public void trancarSemestre(){
        System.out.print("Deseja trancar semestre? (s/n):");
        char resposta = scanner.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            turmasMatriculadas.clear();
            System.out.println("Trancamento do semestre realizado com sucesso");
        }
        else if (resposta == 'n' || resposta == 'N') {
            System.out.print("Trancamento do semstre não realizado");
        }
        else {
            System.out.print("Opção inválida");
        }
    }

    Scanner scanner = new Scanner(System.in);

    boolean matriculaExistente = false;
    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        if (matricula.length() != 9) {
            while (matricula.length() != 9) {
                System.out.println("Matrícula inválida. A matrícula deve ter 9 dígitos.");
                System.out.print("Digite outra matrícula: ");
                matricula = scanner.nextLine();
            }
        }
        if (!matricula.matches("[0-9]+")) {
            System.out.println("Matrícula inválida. A matrícula deve conter apenas números.");
            System.out.println("Digite a matrícula: ");
            matricula = scanner.nextLine();
        }
        do {
            for (String matriculaExistenteStr : matriculas) {
                if (matriculaExistenteStr.equals(matricula)) {
                    matriculaExistente = true;
                    System.out.println("Matrícula já cadastrada. Digite uma matrícula diferente.");
                    System.out.print("Digite outra matrícula: ");
                    matricula = scanner.nextLine();
                    break;
                }
            }
        } while (matriculaExistente);
        alunos.add(nome);
        matriculas.add(matricula);
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.println("Quais disciplinas o aluno já fez? (Separe por vírgula) ");
        ArrayList<String> disciplinasFeitas = new ArrayList<>();
        String disciplinasInput = scanner.nextLine();
        if (!disciplinasInput.trim().isEmpty()) {
            for (String disciplina : disciplinasInput.split(",")) {
                disciplinasFeitas.add(disciplina.trim());
            }
        }
        
        System.out.println("Informe o tipo de aluno:");
        System.out.println("1. Aluno Regular");
        System.out.println("2. Aluno Especial");
        int tipoAluno = scanner.nextInt();

        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Disciplinas feitas: " + disciplinasFeitas);
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

        public void listarAlunos() {
        System.out.println("Lista de alunos cadastrados:");
        for (int i = 0; i < matriculas.size(); i++) {
            System.out.println("Nome: " + alunos.get(i) + " | Matrícula: " + matriculas.get(i));
        }
    }
}
