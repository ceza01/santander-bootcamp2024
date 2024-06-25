import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Desafio09 {
    /*Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
      Com a Stream API, verifique se todos os números da lista são distintos (não se repetem)
      e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean isDistinto = numeros.stream()
                .allMatch(new HashSet<>()::add);

        if (isDistinto) {
            System.out.println("Todos os números são distintos!");
        } else {
            System.out.println("Existem números repetidos!");
        }

//        maneira alternativa
//        int countOriginal = numeros.size();
//        long countDistinct = numeros.stream().distinct().count();
//
//        if (countOriginal == countDistinct) {
//            System.out.println("Todos os números são distintos.");
//        } else {
//            System.out.println("Existem números repetidos na lista.");
//        }

    }
}