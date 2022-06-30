import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        if (postagens.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        if(post != null) {
            postagens.add(post);
        }
    }

    public Set<Autor> obterTodosAutores() {
    Set<Autor> nomes = new TreeSet<>();
    postagens.forEach(x -> nomes.add(x.getAutor()));
    return nomes;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagemMap = new TreeMap<>();
        List<Categorias> listAuxiliar = new ArrayList<>();
        for (Post post : postagens) {
            listAuxiliar.add(post.getCategoria());
        }
        for (Categorias s : listAuxiliar) {
            int frequencia = Collections.frequency(listAuxiliar, s);
            contagemMap.put(s, frequencia);
        }
        return contagemMap;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> stRetorno = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getAutor().equals(autor)) {
                stRetorno.add(post);
            }
        }
        return stRetorno;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> stRetorno = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getCategoria().equals(categoria)) {
                stRetorno.add(post);
            }
        }
        return stRetorno;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> mapRetorno = new TreeMap<>();
        for (Post post : postagens) {
            switch (post.getCategoria()) {
                case DEVOPS:
                    mapRetorno.putIfAbsent(Categorias.DEVOPS, new TreeSet<Post>());
                    mapRetorno.get(post.getCategoria()).add(post);
                    break;
                case DESENVOLVIMENTO:
                    mapRetorno.putIfAbsent(Categorias.DESENVOLVIMENTO, new TreeSet<Post>());
                    mapRetorno.get(post.getCategoria()).add(post);
                    break;
                case DATA_SCIENCE:
                    mapRetorno.putIfAbsent(Categorias.DATA_SCIENCE, new TreeSet<Post>());
                    mapRetorno.get(post.getCategoria()).add(post);
                    break;
                default:
                    break;
            }
        }
        return mapRetorno;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> mapRetorno = new TreeMap<>();
        for (Post post : postagens) {
            mapRetorno.putIfAbsent(post.getAutor(), new TreeSet<>());
            mapRetorno.get(post.getAutor()).add(post);
        }
        return mapRetorno;
    }

    public List<Post> getPostagens() {
       return Collections.unmodifiableList(postagens);
    }
}
