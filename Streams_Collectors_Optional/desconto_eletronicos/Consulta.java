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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> list, double precoMinimo) {
        return list.stream().filter(x -> x.getPreco() > precoMinimo).collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> list) {
        return list.stream().filter(x -> x.getProdutos().stream().anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO))).collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        produtos.stream()
                .map(
                x -> {
                    if (x.getCategoria().equals(CategoriaProduto.ELETRONICO)) {
                        x.setPreco(x.getPreco() * 0.85);
                    }
                    return null;
                }
        ).collect(Collectors.toList());

        return produtos;
    }
}
