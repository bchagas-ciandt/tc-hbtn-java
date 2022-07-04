package provedores;

public class Loggi implements ProvedorFrete{

    public Loggi() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorTotal;
        if (peso > 5000) {
            valorTotal = valor * 0.12;
            return new Frete(valorTotal, TipoProvedorFrete.LOGGI);
        } else {
            valorTotal = valor * 0.04;
            return new Frete(valorTotal, TipoProvedorFrete.LOGGI);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
