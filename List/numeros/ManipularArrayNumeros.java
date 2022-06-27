import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        return lista.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> lista, int numero) {
        if (buscarPosicaoNumero(lista, numero) != -1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
        lista.add(numero);
    }

    public static void removerNumero(List<Integer> lista, int numero) {
        if (buscarPosicaoNumero(lista, numero) == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        lista.remove(buscarPosicaoNumero(lista, numero));
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        if (buscarPosicaoNumero(lista, numeroSubstituir) != -1) {
            lista.set(buscarPosicaoNumero(lista, numeroSubstituir), numeroSubstituto);
        } else {
            lista.add(numeroSubstituto);
        }
    }
}
