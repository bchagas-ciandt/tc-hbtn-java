import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca<T extends Midia> {
    private List<T> valores;

    public Biblioteca() {
        valores = new ArrayList<>();
    }

    public void adicionarMidia(T valor)  {
        if (valor != null) {
            valores.add(valor);
        }
    }

    public List<T> obterListaMidias() {
        return Collections.unmodifiableList(valores);
    }
}
