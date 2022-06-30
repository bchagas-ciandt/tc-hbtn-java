import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valor) {
        if (valor > 0) {
            transacoes.add(valor);
        }
    }
}
