package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatos){
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public void atualizarNumeroContato(String nome, String novoNumero) {
        for (Contato c : contatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                break;
            }
        }
    }
}
