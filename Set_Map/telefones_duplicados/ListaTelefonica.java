import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        telefones.putIfAbsent(nome, new HashSet<Telefone>());
        if (telefones.get(nome).contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        for (Map.Entry<String, HashSet<Telefone>> e : telefones.entrySet()) {
            String key = e.getKey();
            HashSet<Telefone> value = e.getValue();
            if (telefones.get(key).contains(telefone) && !key.equals(nome)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }
        telefones.get(nome).add(telefone);
        return telefones.get(nome);
    }

    public HashSet<Telefone> buscar(String nome) {
        return telefones.get(nome);
    }
}
