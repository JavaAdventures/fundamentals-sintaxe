
// Desafio
// Imprima os fatoriais dos numeros informado por usuarios:

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String starText = """
      Este programa é para calcular o fatorial 
      no intervalo entre dois numeros informado,
      informe o primeiro:
    """;

    System.out.print(starText);
    int firstNumber = sc.nextInt();

    System.out.println("Agora o final do intervalo:");
    int secondNumber = sc.nextInt();

    IntStream.rangeClosed(firstNumber, secondNumber)
             .mapToObj(n -> new Object(){
              int number = n;
              long factorial = IntStream.range(firstNumber, number)
                                        .asLongStream()
                                        .reduce(firstNumber, (a, b) -> a * b);
             })
             .forEach(o -> System.out.println("fat("+o.number+ ") = "+o.factorial));    
  }
}