import java.util.Map;
import java.util.TreeMap;

public class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> map;

    public Armazem() {
        map = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        if (nome != null && valor != null) {
            map.put(nome, valor);
        }
    }

    @Override
    public T obterDoInventario(String nome) {
        return map.get(nome);
    }
}
