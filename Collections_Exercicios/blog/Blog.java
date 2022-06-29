import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        if(post != null) {
            postagens.add(post);
        }
    }

    public Set<String> obterTodosAutores() {
    Set<String> nomes = new TreeSet<>();
    postagens.forEach(x -> nomes.add(x.getAutor()));
    return nomes;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagemMap = new TreeMap<>();
        List<String> listAuxiliar = new ArrayList<>();
        for (Post post : postagens) {
            listAuxiliar.add(post.getCategoria());
        }
        for (String s : listAuxiliar) {
            int frequencia = Collections.frequency(listAuxiliar, s);
            contagemMap.put(s, frequencia);
        }
        return contagemMap;
    }

    public List<Post> getPostagens() {
       return Collections.unmodifiableList(postagens);
    }
}
