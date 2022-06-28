import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        String fraseNova = frase.replaceAll("[?!.]*", "").toLowerCase();
        int quantidadeOcorrencia;
        Map<String, Integer> mapRetorno = new TreeMap<String, Integer> ();
        List<String> list = List.of(fraseNova.split(" "));
        for (String s : list) {
            int frequencia = Collections.frequency(list, s);
            mapRetorno.put(s, frequencia);
        }
        return (TreeMap<String, Integer>) mapRetorno;
    }
}
