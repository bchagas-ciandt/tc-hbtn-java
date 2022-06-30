import java.util.ArrayList;
import java.util.Collections;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacao) {
        if (buscarCliente(nomeCliente) == null) {
            clientes.add(new Cliente(nomeCliente));
            buscarCliente(nomeCliente).adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valor) {
        if (buscarCliente(nomeCliente) != null) {
            buscarCliente(nomeCliente).adicionarTransacao(valor);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public void imprimirClientes() {
        for (Cliente cliente : clientes) {
            System.out.printf("Cliente: %s [%d]", cliente.getNome(), clientes.indexOf(cliente));
        }
    }
}
