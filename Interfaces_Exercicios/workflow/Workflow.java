import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private List<Atividade> atividades;

    public Workflow() {
        atividades = new ArrayList<Atividade>();
    }

    public void registrarAtividade(Atividade atividade) {
        if (atividade != null) {
            atividades.add(atividade);
        }
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
