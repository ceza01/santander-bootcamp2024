package pesquisa;

import java.util.Formattable;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> mapPalavras;

    public ContagemPalavras() {
        this.mapPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        mapPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (mapPalavras.isEmpty()){
            System.out.println("Nenhuma palavra armazenada.");
        }else {
            mapPalavras.remove(palavra);
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : mapPalavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int quantidade = 0;
        if (!mapPalavras.isEmpty()){
            for (Map.Entry<String, Integer> palavras : mapPalavras.entrySet()){
                int contagemMaisUsada = palavras.getValue();
                if (contagemMaisUsada > quantidade){
                    quantidade = contagemMaisUsada;
                    palavraMaisFrequente = palavras.getKey();
                }
            }
        }
        return palavraMaisFrequente + "Número de vezes: " + quantidade;
    }
}
