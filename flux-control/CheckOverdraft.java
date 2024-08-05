import java.util.Random;
import java.util.Scanner;

public class CheckOverdraft {

   public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    Random random = new Random();
    double balance = random.nextDouble(10000);
    System.out.println(balance);
    System.out.println("Informe o valor do saque.");
    double withdraw = scanner.nextDouble();
    double limitOverdraft = 500;
    double balanceTotalAvailable = balance + limitOverdraft;

    if (balance > withdraw) {
      System.out.println("Transação realizada com sucesso.");
    } else if((withdraw > limitOverdraft) && (withdraw < balanceTotalAvailable)) {
      System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
    } else {
      System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
    }
     scanner.close();
  }
}
