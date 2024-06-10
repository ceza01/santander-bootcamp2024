package operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t : listaTarefas ) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }
}

