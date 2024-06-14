package operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapDicionario;

    public Dicionario() {
        this.mapDicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        mapDicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        mapDicionario.remove(palavra);
    }

    public void exibirPalavras(){
        if (!mapDicionario.isEmpty()){
            System.out.println(mapDicionario);
        } else {
            System.out.println("Dicionário vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = mapDicionario.get(palavra);
        return (definicao != null) ? definicao : "Palavra não encontrada.";
    }
}
