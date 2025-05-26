

public class Turma extends Disciplina{

    protected String professorResponsavel;
    protected String semestre;
    protected String formaDeAvaliacao;
    protected boolean presencial;
    protected String sala;
    protected String horario;
    protected int capacidadeMaximaDeAlunos;
    protected int vagasOcupadas;

    public Turma(String professorResponsavel, String semestre, String formaDeAvaliacao, boolean presencial, String sala, String horario, int capacidadeMaximaDeAlunos){
        this.professorResponsavel = professorResponsavel;
        this.semestre = semestre;
        this.formaDeAvaliacao = formaDeAvaliacao;
        this.presencial = presencial;
        this.sala = sala;
        this.horario = horario;
        this.capacidadeMaximaDeAlunos = capacidadeMaximaDeAlunos;
    }
    public String getProfessorResponsavel() {
        return professorResponsavel;
    }
    public String getSemestre() {
        return semestre;
    }
    public String getFormaDeAvaliacao() {
        return formaDeAvaliacao;
    }
    public boolean ispresencial() {
        return presencial;
    }
    public String getSala() {
        return sala;
    }
    public String getHorario() {
        return horario;
    }
    public int getCapacidadeMaximaDeAlunos() {
        return capacidadeMaximaDeAlunos;
    }
    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }
    public int getVagasOcupadas() {
        return vagasOcupadas;
    }
    @Override
    public String toString() {
        return "Turma | Professor: " + professorResponsavel +
               " | Semestre: " + semestre +
               " | Horário: " + horario +
               " | " + (presencial ? "Sala: " + sala : "Remota") +
               " | Capacidade: " + capacidadeMaximaDeAlunos;
    }
} 
