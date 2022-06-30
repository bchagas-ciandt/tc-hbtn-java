public class Autor implements Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor autor) {
       return toString().compareTo(autor.toString());
    }

    @Override
    public boolean equals(Object o) {
        Autor autor = (Autor) o;

        if (getNome().equals(autor.getNome()) && getSobrenome().equals(autor.getSobrenome())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getSobrenome() != null ? getSobrenome().hashCode() : 0);
        return result;
    }
}
