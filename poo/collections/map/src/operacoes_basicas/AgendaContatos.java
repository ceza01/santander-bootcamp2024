package operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> mapAgenda;

    public AgendaContatos() {
        this.mapAgenda = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        mapAgenda.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!mapAgenda.isEmpty()) {
            mapAgenda.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(mapAgenda);
    }

    public String pesquisarPorNome(String nome) {
        String numeroNome = null;
        if (!mapAgenda.isEmpty()) {
            numeroNome = mapAgenda.get(nome);
            if (numeroNome == null){
                return "Número não encontrado.";
            }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroNome;
    }
}
