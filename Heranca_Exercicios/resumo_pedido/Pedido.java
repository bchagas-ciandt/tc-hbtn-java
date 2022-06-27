public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return total - (total * percentualDesconto / 100);
    }

    public void apresentarResumoPedido() {
        double valor = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), item.getProduto().obterPrecoLiquido() * item.getQuantidade());
            valor += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", valor * percentualDesconto / 100);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", valor);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}
