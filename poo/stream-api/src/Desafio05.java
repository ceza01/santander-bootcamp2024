import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio05 {
    /*Desafio 5 - Calcule a média dos números maiores que 5:
      Com a Stream API, calcule a média dos números maiores que 5
      e exiba o resultado no console.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaiorQueCinco = numeros.stream()
                .filter(numero -> numero > 5)
                .toList();

        OptionalDouble media = numerosMaiorQueCinco.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (media.isPresent()) {
            System.out.println("Média dos números maiores que 5: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 para calcular a média.");
        }
    }
}
