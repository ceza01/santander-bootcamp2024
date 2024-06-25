import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    /*Desafio 18 - Verifique se todos os números da lista são iguais:
      Utilizando a Stream API, verifique se todos os números da lista são iguais
      e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .allMatch(num -> num.equals(numeros.get(0)));

        System.out.println("Os números são iguais? " + todosIguais);

//        maneira alternativa
//        boolean todosIguaisAlt = numeros.stream()
//                .distinct()
//                .count() == 1;
//
//        System.out.println("Os números são iguais? " + todosIguaisAlt);

    }
}