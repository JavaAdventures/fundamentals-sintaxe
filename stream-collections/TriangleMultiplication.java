import java.util.Scanner;
import java.util.stream.IntStream;

// Escreva um programa que imprima um triângulo de multiplicação, 
// onde cada linha contém os produtos dos números das colunas e 
// linhas até o valor da linha atual.

public class TriangleMultiplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("informe o numero de linhas do triangulo");
    int numero = sc.nextInt(); 

        IntStream.rangeClosed(1, numero).forEach(linha -> {
            IntStream.rangeClosed(1, linha)
                     .map(coluna -> linha * coluna) 
                     .forEach(produto -> System.out.print(produto + " "));
            System.out.println();
        });
  }
}
