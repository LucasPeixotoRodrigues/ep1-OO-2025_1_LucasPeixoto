import java.util.ArrayList;

public class Turma {
    protected String professorResponsável;
    protected int semestre;
    protected char formaDeAvaliacao;
    protected String modeloDeEnsino;
    protected String sala;
    protected String horario;
    protected int capacidadeMáximaDeAlunos;
    protected ArrayList<String> alunosNaTurma = new ArrayList<String>();

    public void setTurma(String professorResponsável, int semestre, char formaDeAvaliacao, String modeloDeEnsino, String sala, String horario, int capacidadeMáximaDeAlunos){
        this.professorResponsável = professorResponsável;
        this.semestre = semestre;
        this.formaDeAvaliacao = formaDeAvaliacao;
        this.modeloDeEnsino = modeloDeEnsino;
        this.sala = sala;
        this.horario = horario;
        this.capacidadeMáximaDeAlunos = capacidadeMáximaDeAlunos;
    }
    public String getProfessorResponsável() {
        return professorResponsável;
    }
    public int getSemestre() {
        return semestre;
    }
    public char getFormaDeAvaliacao() {
        return formaDeAvaliacao;
    }
    public String isModeloDeEnsino() {
        return modeloDeEnsino;
    }
    public String getSala() {
        return sala;
    }
    public String getHorario() {
        return horario;
    }
    public int getCapacidadeMáximaDeAlunos() {
        return capacidadeMáximaDeAlunos;
    }

    
} 
