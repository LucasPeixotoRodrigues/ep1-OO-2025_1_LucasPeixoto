import java.util.ArrayList;
import java.util.Scanner;
public class Aluno extends Disciplina{
    protected String nome;
    protected int matricula;
    protected String cursoDeGraduação;
    protected ArrayList<String> turmasMatriculadas = new ArrayList<String>();
    protected ArrayList<String> disciplinasFeitas = new ArrayList<String>();
    Scanner scanner = new Scanner (System.in);
    Disciplina disciplina = new Disciplina();
    
    public void setAluno(String nome, int matricula, String cursoDeGraduação, ArrayList<String> turmasMatriculadas, ArrayList<String> disciplinasFeitas){
        this.nome = nome;
        this.matricula = matricula;
        this.cursoDeGraduação = cursoDeGraduação;
        this.turmasMatriculadas = turmasMatriculadas;
        this.disciplinasFeitas = disciplinasFeitas;
    }
    public String getNome(){
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
        public String getCursoDeGraduação() {
        return cursoDeGraduação;
    }
    public ArrayList<String> getTurmasMatriculadas() {
        return turmasMatriculadas;
    }
        public ArrayList<String> getDisciplinasFeitas() {
        return disciplinasFeitas;
    }

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
            System.out.print("Trancamneto do semstre não realizado");
        }
        else {
            System.out.print("Opção inválida");
        }
    }
}
