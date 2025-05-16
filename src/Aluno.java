public class Aluno {
    private String nome;
    private int matricula;
    private String cursoDeGraduação;

    public void setAluno(String nome, int matricula, String cursoDeGraduação){
        this.nome = nome;
        this.matricula = matricula;
        this.cursoDeGraduação = cursoDeGraduação;
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
}
