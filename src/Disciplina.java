import java.util.ArrayList;

public class Disciplina {
    public static Object nomeDisciplina;
    protected String nomeDisciplna;
    protected String código;
    protected int cargaHorária;
    ArrayList<String> préRequisitos = new ArrayList<String>();

    public void setDisciplina(String nomeDisciplina, String código, int cargaHorária, ArrayList<String> préRequisitos){
        this.nomeDisciplna = nomeDisciplina;
        this.código = código;
        this.cargaHorária = cargaHorária;
        this.préRequisitos = préRequisitos;

    }
        public String getNomeDisciplina() {
        return nomeDisciplna;
    }
        public String getCódigo() {
        return código;
    }
    public int getCargaHorária() {
        return cargaHorária;
    }
    public ArrayList<String> getPréRequisitos(){
        return préRequisitos;
    }

}
