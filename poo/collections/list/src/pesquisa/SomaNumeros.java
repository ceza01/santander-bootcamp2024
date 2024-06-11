package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma(){
        int somaNumeros = 0;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                somaNumeros += numero;
            }
        }
        return somaNumeros;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(numeros);
        }
    }
}
