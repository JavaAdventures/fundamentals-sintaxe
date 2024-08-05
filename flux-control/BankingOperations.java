// Você está desenvolvendo um programa simples em Java 
// para simular operações bancárias básicas. A aplicação
// deve permitir ao usuário realizar depósitos, saques e 
// consultar o saldo em uma conta bancária virtual.
// O programa exibirá um menu com as seguintes opções:

// Depositar
// Sacar
// Consultar Saldo
// Encerrar
// O usuário escolherá uma dessas opções digitando o número correspondente.

import java.util.Scanner;

public class BankingOperations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double balance = 0;
    String menu = """
        Escolha a opção desejada:
        1 - Depositar
        2 - Sacar
        3 - Consultar Saldo
        0 - Encerrar
        """;

    while (true) {
      System.out.println(menu);
      int option = sc.nextInt();
      switch (option) {
        case 1:
          double depositAmount = 0;
          System.out.println("Valor do deposito: ");
          depositAmount = sc.nextDouble();
          balance += depositAmount;
          System.out.println("Saldo atual: "+balance+"\n");          
          break;
        
        case 2:
          double withdrawalAmount = 0;
          System.out.println("Valor do saque: ");
          withdrawalAmount = sc.nextDouble();
          if (withdrawalAmount > balance) {
            System.out.println("Saldo insuficiente \n");
          } else {
            balance = balance - withdrawalAmount;
            System.out.println("Saldo atual: "+balance+"\n");
          }
          break;
        case 3: 
          System.out.println("Saldo atual: "+balance+"\n");
          break;

        case 0:
          System.out.println("Progama encerrado.");
          System.exit(0);
        default:
          System.out.println("Opção invalida. Tente novamente.");
          break;
      }
      
    }
  }  
}

