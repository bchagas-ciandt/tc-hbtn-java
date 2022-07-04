package provedores;

public class JadLog implements ProvedorFrete{

    public JadLog() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorTotal;
        if (peso > 2000) {
            valorTotal = valor * 0.07;
            return new Frete(valorTotal, TipoProvedorFrete.JADLOG);
        } else {
            valorTotal = valor * 0.045;
            return new Frete(valorTotal, TipoProvedorFrete.JADLOG);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
