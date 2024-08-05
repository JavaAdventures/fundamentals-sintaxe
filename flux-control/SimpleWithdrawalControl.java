import java.util.Random;
import java.util.Scanner;

// Você está desenvolvendo um programa simples em 
// Java para auxiliar um cliente a realizar saques 
// de uma conta bancária. O cliente pode fazer saques 
// até atingir um limite diário predefinido.


public class SimpleWithdrawalControl {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    Random random = new Random();
    double dailyLimit = random.nextDouble(2000);
    for (double withdraw = 0; dailyLimit >= withdraw;) {
      System.out.println("Informe o valor do saque.");
      withdraw = scanner.nextDouble();

      if (withdraw == 0) {
        System.out.println("Transações encerradas.");
        break;
      } else if (withdraw <= dailyLimit) {
        dailyLimit -= withdraw;
        System.out.printf("Saque realizado. Limite restante: %.1f\n", dailyLimit);
      } else {
        System.out.printf("Limite diario de saque atingido. Transações encerradas.");
      }
    }

   scanner.close();
  }

}
