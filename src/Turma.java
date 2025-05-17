import java.util.ArrayList;

public class Turma {
    protected String professorResponsável;
    protected int semestre;
    protected char formaDeAvaliação;
    protected boolean presencial;
    protected String sala;
    protected String horário;
    protected int capacidadeMáximaDeAlunos;
    protected ArrayList<String> alunosNaTurma = new ArrayList<String>();

    public void setTurma(String professorResponsável, int semestre, char formaDeAvaliação, boolean presencial, String sala, String horário, int capacidadeMáximaDeAlunos){
        this.professorResponsável = professorResponsável;
        this.semestre = semestre;
        this.formaDeAvaliação = formaDeAvaliação;
        this.presencial = presencial;
        this.sala = sala;
        this.horário = horário;
        this.capacidadeMáximaDeAlunos = capacidadeMáximaDeAlunos;
    }
    public String getProfessorResponsável() {
        return professorResponsável;
    }
    public int getSemestre() {
        return semestre;
    }
    public char getFormaDeAvaliação() {
        return formaDeAvaliação;
    }
    public boolean isPresencial() {
        return presencial;
    }
    public String getSala() {
        return sala;
    }
    public String getHorário() {
        return horário;
    }
    public int getCapacidadeMáximaDeAlunos() {
        return capacidadeMáximaDeAlunos;
    }

    
}
