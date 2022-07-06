import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private double preco;
    private String nome;
    private double percentualMarkup = 10;
    public Supplier<Double> precoComMarkup = () -> preco + (percentualMarkup * preco / 100);
    public Consumer<Double> atualizarMarkup = x -> percentualMarkup = x;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }
}
