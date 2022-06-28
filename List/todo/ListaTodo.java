import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa tarefa1 : tarefas) {
            if (tarefa.getIdentificador() == tarefa1.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() +  " ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean isFeita = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                isFeita = true;
            }
        }
        return isFeita;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean isNaoFeita = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                isNaoFeita = true;
            }
        }
        return isNaoFeita;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isEstahFeita()) {
                System.out.printf("[X]  Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
            } else {
                System.out.printf("[ ]  Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
            }
        }
    }
    public List<Tarefa> getTarefas() {
        return Collections.unmodifiableList(tarefas);
    }
}
