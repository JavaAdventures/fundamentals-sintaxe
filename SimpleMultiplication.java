import java.util.Scanner;

// Desafio
// Você receberá dois valores inteiros. 
// Faça a leitura e em seguida calcule o produto
// entre estes dois valores. 
// Atribua esta operação à variável PROD


public class SimpleMultiplication {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int A, B, prod;
    
    String startText = """
      Bem vindo ao multiplicação simples! 
      Para iniciar digite o primeiro valor:
      """;
    System.out.print(startText);
    A = sc.nextInt();
    System.out.println("Agora digite o segundo valor:");
    B = sc.nextInt();
    prod = A * B;
    System.out.printf("%d * %d = %d", A, B, prod);
    sc.close();
  }
}