public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(Integer xi) {
<<<<<<< HEAD
        this.setValor(xi);
=======
            this.setValor(xi);
>>>>>>> e6b8761fec26f7d1fa2a24d97bc271983b1ea360
    }
    public InteiroPositivo(String xs) {
        if (Integer.parseInt(xs) <= 0 || xs == null) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        } else {
            valor = new Integer(xs);
        }
    }

    public boolean ehPrimo() {
        int valorPrimo = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                valorPrimo++;
            }
        }
        if (valorPrimo == 2) {
            return true;
        } else {
            return false;
        }
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer xii) {
        if (xii.intValue() <= 0 || xii == null) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        } else {
            valor = xii;
        }
    }

}
