import java.util.Locale;

public class Retangulo extends FormaGeometrica{
    protected double largura;
    protected double altura;

    @Override
    public double area() {
        return largura * altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    public String toString() {
        return String.format(Locale.US, "[Retangulo] %.2f / %.2f", largura, altura);
    }
}
