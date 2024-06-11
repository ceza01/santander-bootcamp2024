package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> setTarefas;

    public ListaTarefas() {
        this.setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!setTarefas.isEmpty()){
            for (Tarefa t : setTarefas){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            setTarefas.remove(tarefaParaRemover);
        } else {
            System.out.println("Não há tarefas na lista.");
        }
        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (setTarefas.isEmpty()){
            System.out.println("Lista de tarefas vazia.");
        } else {
            System.out.println(setTarefas);
        }
    }

    public int contarTarefas(){
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : setTarefas){
            if (t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            } else {
                System.out.println("Nenhuma tarefa foi concluída.");
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : setTarefas){
            if (!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            } else {
                System.out.println("Não há tarefas pendentes.");
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : setTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
                break;
            } else {
                System.out.println("Tarefa não encontrada!");
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendende = null;
        for (Tarefa t : setTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendende = t;
                break;
            }
        }
            if (tarefaPendende != null){
                if (tarefaPendende.isTarefaConcluida()){
                    tarefaPendende.setTarefaConcluida(false);
                }
            } else {
                System.out.println("Tarefa não encontrada!");
        }
    }

    public void limparListaTarefas() {
        if (setTarefas.isEmpty()){
            System.out.println("Lista já está vazia.");
        } else {
            setTarefas.clear();
        }
    }
}
