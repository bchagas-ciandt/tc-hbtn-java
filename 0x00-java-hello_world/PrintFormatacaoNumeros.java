import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.printf(new Locale("US"), "Valor: R$ %,3.2f\n", valor);
        System.out.printf(new Locale("US"),"Taxa: %.2f%%\n", taxa);
    }
}
