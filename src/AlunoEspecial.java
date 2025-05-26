import java.util.ArrayList;

public class AlunoEspecial extends Aluno {
    protected ArrayList<String> turmasMatriculadas = new ArrayList<String>();
    protected ArrayList<String> disciplinasFeitas = new ArrayList<String>();

    
    public void setTurmasMatriculadas(ArrayList<String> turmasMatriculadas, ArrayList<String> disciplinasFeitas) {
        this.turmasMatriculadas = turmasMatriculadas;
        this.disciplinasFeitas = disciplinasFeitas;
    }
    public ArrayList<String> getTurmasMatriculadas() {
        return turmasMatriculadas;
    }
        public ArrayList<String> getDisciplinasFeitas() {
        return disciplinasFeitas;
    }
    
    public void fazerMatrícula(){
        if (turmasMatriculadas.size() < 3) {
            System.out.print("Fazer matrícula em:");
            String nomeDisciplina = scanner.nextLine();
            turmasMatriculadas.add(nomeDisciplina);
            System.out.format("Matrícula em %s realizada com sucesso", nomeDisciplina);
        } 
        else {
            System.out.println("Limite de disciplinas atingido");
        }
    }
    public void trancarMatrícula(){
        System.out.print("Trancar matrícula em:");
        String nomeDisciplina = scanner.nextLine();
        turmasMatriculadas.remove(nomeDisciplina);
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
