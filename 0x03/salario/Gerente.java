public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if(departamento.alcancouMeta()) {
            bonus = super.getSalarioFixo() * 0.2;
            if (departamento.getValorAtingidoMeta() > departamento.getValorMeta()) {
                bonus += (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
            }
        }
        return bonus;
    }
}
