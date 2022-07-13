import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> list) {
        TreeMap<String, TreeSet<Pessoa>> retorno = list.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                () -> new TreeMap<>(Comparator.reverseOrder()),
                Collectors.toCollection(TreeSet::new)));
        return retorno;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> list) {
        return list.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> list) {
        return list.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
                Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
    }
}
