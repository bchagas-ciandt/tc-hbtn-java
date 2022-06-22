import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    protected String numeracao;
    protected double saldo;
    protected double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor < 1) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor < 1) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double tarifa = 0;
        if ((saldo * 0.1) < 10.00) {
            tarifa = saldo * 0.1;
        } else {
            tarifa = 10.00;
        }
        return tarifa;
    }

    public double calcularJurosMensal() {
        double juros = 0;
        if (saldo <= 0) {
            return juros;
        }
        juros = (saldo * (taxaJurosAnual/100)) / 12;
        return juros;
    }

    public void aplicarAtualizacaoMensal() {
        saldo = (saldo - calcularTarifaMensal()) + calcularJurosMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
