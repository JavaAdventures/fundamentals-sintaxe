
// Desafio
// Imprima os primeiros números 
// da série de Fibonacci com o limite definido pelo usuario

import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Fibonnaci {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Defina até onde você deseja ver a sequencia de Fibonacci");
    int limit = sc.nextInt();

    Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
          .limit(limit)
          .map(f -> f[0])
          .forEach(System.out::println);
  }
}