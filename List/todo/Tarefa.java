public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        this.setDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricaoNova) {
        if (descricaoNova.isBlank() || descricaoNova == null) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = descricaoNova;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank() || descricao == null) {
            throw new IllegalArgumentException("Descricao de tarefa invalida\n");
        }
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }
}
