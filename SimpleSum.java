import java.util.Scanner;

// Desafio
// Leia dois valores inteiros identificados como variáveis A e B.
// Calcule a soma entre elas e chame essa variável de SOMA.
// A seguir escreva o valor desta variável.

public class SimpleSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A, B, soma;
    String startText = """
        Bem vindo ao soma simples! 
        Para iniciar digite o primeiro valor:
        """;

    System.out.print(startText);
    A = sc.nextInt();
    System.out.println("Agora digite o segundo valor:");
    B = sc.nextInt();

    soma = A + B;
    System.out.println("SOMA = "+ soma);

    sc.close();
  }
}