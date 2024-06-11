package operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()){
            if (palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto.");
            }
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)){
            System.out.println("A palavra " + palavra + " está no conjunto.");
        } else {
            System.out.println("A palavra " + palavra + " não está no conjunto.");
        }
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
