import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio04 {
    /*Desafio 4 - Remova todos os valores ímpares:
      Utilize a Stream API para remover os valores ímpares da lista
      e imprima a lista resultante no console.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        List<Integer> novaLista = numeros.stream()
                .filter(isPar)
                .toList();

        System.out.println(novaLista);

    }
}
