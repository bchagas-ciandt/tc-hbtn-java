import java.util.Locale;

public class Quadrado extends Retangulo{
    private double lado;

    public static double area(double lado) {
        if(lado <= 0) {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
        super.altura = lado;
        super.largura = lado;
    }

    public String toString() {
        return String.format(Locale.US, "[Quadrado] %.2f", lado);
    }
}
