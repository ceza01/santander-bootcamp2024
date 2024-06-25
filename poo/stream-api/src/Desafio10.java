import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio10 {
    /*Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
      Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5
      e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> imparesMultiplos = numero ->
                (numero % 2 != 0) && (numero % 3 == 0 || numero % 5 == 0);

        List<Integer> listaImpares = numeros.stream()
                .filter(imparesMultiplos)
                .toList();

        System.out.println(listaImpares);
    }
}