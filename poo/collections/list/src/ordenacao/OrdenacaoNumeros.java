package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> ordenarNumeros;

    public OrdenacaoNumeros() {
        this.ordenarNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        ordenarNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numAscendente = new ArrayList<>(ordenarNumeros);
        if (!ordenarNumeros.isEmpty()){
            Collections.sort(numAscendente);
            return numAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numDescendente = new ArrayList<>(ordenarNumeros);
        if (!ordenarNumeros.isEmpty()){
            numDescendente.sort(Collections.reverseOrder());
            return numDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

}
