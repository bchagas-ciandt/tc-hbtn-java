import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        List<Produto> listAuxiliar = new ArrayList<>();
        for (Produto produto : produtos) {
            if (criterioFiltro.testar(produto)) {
                listAuxiliar.add(produto);
            }
        }
        return listAuxiliar;
    }
}
