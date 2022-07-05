public class Comida {
    private String nome;
    private double calorias;
    private double preço;

    public Comida(String nome, int calorias, double preço) {
        this.nome = nome;
        this.calorias = calorias;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return String.format("[%s] %f R$ %f", nome, calorias, preço);
    }
}
