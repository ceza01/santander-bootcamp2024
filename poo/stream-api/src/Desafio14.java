import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Desafio14 {
    /*Desafio 14 - Encontre o maior número primo da lista:
      Com a Stream API, encontre o maior número primo da lista
      e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                        .filter(Desafio14::isPrimo)
                                .max(Integer::compareTo);

        maiorPrimo.ifPresentOrElse(
                primo -> System.out.println("O maior número primo é: " + primo),
                () -> System.out.println("Não há número primos na lista.")
        );

    }

    public static boolean isPrimo(int number){
        return number > 1 && IntStream
                .range(2, number)
                .noneMatch(i -> number % i == 0 );
    }

}