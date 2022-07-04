package provedores;

public class Sedex implements ProvedorFrete{

    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorTotal;
        if (peso > 1000) {
            valorTotal = valor * 0.1;
            return new Frete(valorTotal, TipoProvedorFrete.SEDEX);
        } else {
            valorTotal = valor * 0.05;
            return new Frete(valorTotal, TipoProvedorFrete.SEDEX);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
