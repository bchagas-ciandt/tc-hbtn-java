import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nome) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nome)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome) {
        if (buscarAgencia(nome) == null) {
            agencias.add(new Agencia(nome));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agenciaRetorno = buscarAgencia(nomeAgencia);
        Cliente clienteRetorno = agenciaRetorno.buscarCliente(nomeCliente);
        if (agenciaRetorno != null && clienteRetorno == null) {
                agenciaRetorno.getClientes().add(new Cliente(nomeCliente));
                buscarAgencia(nomeAgencia).buscarCliente(nomeCliente).adicionarTransacao(valor);
                return true;
            }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valor) {
        Cliente clienteRetorno = buscarAgencia(nomeAgencia).buscarCliente(nomeCliente);
        if (clienteRetorno != null) {
            clienteRetorno.adicionarTransacao(valor);
            return true;
        }
        return false;
    }

    public boolean listarClientes(String nome, boolean imprime) {
        if (buscarAgencia(nome) == null) {
            return false;
        }
        if (imprime) {
            for (Cliente cliente : buscarAgencia(nome).getClientes()) {
                System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), buscarAgencia(nome).getClientes().indexOf(cliente) + 1);
                for (Double transacoe : cliente.getTransacoes()) {
                    System.out.printf("  [%d] valor %.2f\n", cliente.getTransacoes().indexOf(transacoe) + 1, transacoe);
                }
            }
            return true;
        }
        return true;
    }
}
