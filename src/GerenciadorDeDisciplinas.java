import java.util.ArrayList;

public class GerenciadorDeDisciplinas {
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(String codigo) {
        disciplinas.removeIf(disciplina -> disciplina.getCodigo().equals(codigo));
    }

    public Disciplina buscarDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }

    public ArrayList<Disciplina> listarDisciplinas() {
        return new ArrayList<>(disciplinas);
    }
}
