import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
       return pedido.getProdutos().stream().filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> list) {
        return list.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().get();
    }
}
