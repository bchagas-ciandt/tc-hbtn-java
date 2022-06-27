import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int valor = cookies.stream().mapToInt(PedidoCookie::getQuantidadeCaixas).sum();
        return valor;
    }

    public int removerSabor(String sabor) {
        int contador = 0;
        for(int i=0; i<cookies.size(); i++) {
            if(cookies.get(i).getSabor().equals(sabor)) {
                contador += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(cookies.get(i));
            }
        }
        return contador;
    }
}
