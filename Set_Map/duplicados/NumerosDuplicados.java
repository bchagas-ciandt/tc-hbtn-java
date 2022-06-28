import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros) {
        HashSet<Integer> hash = new HashSet<>();
        TreeSet<Integer> a = new TreeSet<>();
        for (int numero : numeros) {
        boolean isRepetido = hash.add(numero);
        hash.add(numero);
        if (!isRepetido) {
            a.add(numero);
        }
        }
        return a;
    }
}
