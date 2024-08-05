import java.util.Scanner;

// Você está desenvolvendo um programa simples 
// em Java para verificar se um número de conta 
// bancária é válido. O número da conta deve ter 
// exatamente 8 dígitos.


public class AccountNumberVerifier {
 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número da conta");
    String accountNumber = scanner.nextLine();
    try {
      checkAccountNumber(accountNumber);
      System.out.println("Número da conta válido");
    } catch (Exception e) {
      System.out.println("Erro: "+ e.getMessage());
    } finally {
      scanner.close();
    }
  }

  private static void checkAccountNumber(String numberAccount) {
    if (numberAccount.length() != 8) {
      throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos");
    }
  }

}
