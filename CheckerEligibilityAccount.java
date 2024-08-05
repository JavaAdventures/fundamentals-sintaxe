import java.util.Scanner;

// Você está desenvolvendo um programa simples 
// em Java para verificar se um cliente é elegível 
// para criar uma conta bancária. A condição é 
// que o cliente deve ter pelo menos 18 anos de idade.


public class CheckerEligibilityAccount {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe sua idade");
    int age = scanner.nextInt();

    if (age >= 18) {
      System.out.println("Você tem idade para criar uma conta bancaria em nosso banco");
    } else {
      System.out.println("Você não tem a idade mínima para criar uma conta");
    }

    scanner.close();
  }

}
