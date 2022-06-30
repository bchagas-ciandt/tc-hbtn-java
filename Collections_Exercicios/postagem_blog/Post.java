import java.util.Objects;

public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (getAutor() != null ? !getAutor().equals(post.getAutor()) : post.getAutor() != null) return false;
        if (getTitulo() != null ? !getTitulo().equals(post.getTitulo()) : post.getTitulo() != null) return false;
        return getCategoria() == post.getCategoria();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((corpo == null) ? 0 : corpo.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        return result;
    }

    @Override
    public int compareTo(Post post) {
        int result = -1;
        if (titulo.equals(post.titulo)) {
            result = 0 ;
        }
        if (titulo.charAt(0) > (post.titulo.charAt(0))) {
            result = 1 ;
        }
        if (titulo.charAt(0) < (post.titulo.charAt(0))) {
            result = -1 ;
        }

        return result;
    }
}
