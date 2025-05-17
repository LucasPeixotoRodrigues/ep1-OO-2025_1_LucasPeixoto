import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplna;
    private String código;
    private int cargaHorária;
    ArrayList<String> préRequisitos = new ArrayList<String>();

    public void setDisciplina(String nomeDisciplina, String código, int cargaHorária){
        this.nomeDisciplna = nomeDisciplina;
        this.código = código;
        this.cargaHorária = cargaHorária;
    }
        public String getNomeDisciplna() {
        return nomeDisciplna;
    }
        public String getCódigo() {
        return código;
    }
    public int getCargaHorária() {
        return cargaHorária;
    }
}
