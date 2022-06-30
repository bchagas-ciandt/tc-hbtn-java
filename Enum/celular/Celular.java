import java.util.ArrayList;

public class Celular {

    ArrayList<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nomeContato) {
        int index = -1;
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomeContato)) {
                index = contatos.indexOf(contato);
                return index;
            }
        }
        return index;
    }

    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) != -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if (obterPosicaoContato(novoContato.getNome()) != -1 && !contatoAntigo.getNome().equals(novoContato.getNome())) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        contatos.set(contatos.indexOf(contatoAntigo), novoContato);
    }

    public void removerContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(contato);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumeroDeTelefone(), contato.getTipo());
        }
    }
}
