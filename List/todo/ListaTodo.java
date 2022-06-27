import java.util.ArrayList;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa tarefa1 : tarefas) {
            if (tarefa1.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador "+ tarefa.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean isMarcada = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                isMarcada = true;
                break;
            }
        }
        return isMarcada;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean isMarcada = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                isMarcada = true;
                break;
            }
        }
        return isMarcada;
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
}

