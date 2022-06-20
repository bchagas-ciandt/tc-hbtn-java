import comida.*;
import humor.*;

public class Personagem {
    int pontosDeFelicidade;

    public Humor obterHumorAtual() {
        if (pontosDeFelicidade > 15) {
            return new MuitoFeliz();
        } else if (pontosDeFelicidade > 0) {
            return new Feliz();
        } else if (pontosDeFelicidade > -5) {
            return new Triste();
        } else {
            return new Irritado();
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            switch(comida.getClass().getSimpleName()) {
                case "Cram" :
                    pontosDeFelicidade += 2;
                    break;
                case "Lembas" :
                    pontosDeFelicidade += 3;
                    break;
                case "Maca" :
                    pontosDeFelicidade += 1;
                    break;
                case "Melao" :
                    pontosDeFelicidade += 1;
                    break;
                case "BoloDeMel" :
                    pontosDeFelicidade += 5;
                    break;
                case "Cogumelo" :
                    pontosDeFelicidade += -10;
                    break;
                case "OutraComida" :
                    pontosDeFelicidade += -1;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + comida.getClass().getName());
            }
        }

    }

    @Override
    public String toString() {
        return Integer.toString(pontosDeFelicidade) + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
