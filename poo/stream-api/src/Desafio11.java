import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Desafio11 {
    /*Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
      Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista
      e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Integer> quadrado = numero ->
                numero * numero;

        int somaQuadrados = numeros.stream()
                .mapToInt(quadrado::apply)
                .sum();

        System.out.println("A soma dos quadrados é: " + somaQuadrados);

    }
}