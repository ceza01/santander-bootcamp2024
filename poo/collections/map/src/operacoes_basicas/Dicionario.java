package operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> mapDicionario;

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
        String palavraPesquisa = null;
        if (!mapDicionario.isEmpty()) {
            palavraPesquisa = mapDicionario.get(palavra);
            if (palavraPesquisa == null){
                return "Palavra não encontrada.";
            }
        } else {
            return "Dicionário vazio.";
        }
        return palavraPesquisa;
    }
}
