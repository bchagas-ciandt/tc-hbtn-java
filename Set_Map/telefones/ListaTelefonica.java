import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        telefones.putIfAbsent(nome, new ArrayList<Telefone>());
        telefones.get(nome).add(telefone);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return telefones.get(nome);
    }
}
