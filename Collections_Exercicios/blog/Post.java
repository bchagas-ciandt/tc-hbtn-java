public class Post {
    private String autor;
    private String titulo;
    private String corpo;
    private String categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Post{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", corpo='" + corpo + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        return getCategoria() != null ? getCategoria().equals(post.getCategoria()) : post.getCategoria() == null;
    }

    @Override
    public int hashCode() {
        int result = getAutor() != null ? getAutor().hashCode() : 0;
        result = 31 * result + (getCategoria() != null ? getCategoria().hashCode() : 0);
        return result;
    }
}
