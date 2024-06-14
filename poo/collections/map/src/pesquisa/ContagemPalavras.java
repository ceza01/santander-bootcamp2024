package pesquisa;

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

    public void removerPalavra(String palavra) {
        if (mapPalavras.remove(palavra) == null) {
            System.out.println("Palavra não encontrada: " + palavra);
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : mapPalavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int quantidade = 0;

        for (Map.Entry<String, Integer> palavras : mapPalavras.entrySet()) {
            if (palavras.getValue() > quantidade) {
                quantidade = palavras.getValue();
                palavraMaisFrequente = palavras.getKey();
            }
        }
        if (palavraMaisFrequente == null){
            return "Nenhuma palavra armazenada";
        }

        return palavraMaisFrequente + "\nNúmero de vezes: " + quantidade;
    }
}
