import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    
   
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


     System.out.println("Digite o numero da conta: ");
      int numero = scanner.nextInt();

      System.out.println("----------------------------------------");

      System.out.println("Numero da agencia");
      String agencia = scanner.next();

      System.out.println("----------------------------------------");

      System.out.println("Nome do cliente: ");
      String nome = scanner.next();

      System.out.println("----------------------------------------");
      
      System.out.println("Qual seu saldo ");
      double saldo = scanner.nextDouble();

      System.out.println("----------------------------------------");
      System.out.println("        iNFORMAÇÕES DA CONTA                ");
      System.out.println("----------------------------------------");

      System.out.println("Nome do cliente: " + nome );
      System.out.println("Numero da conta: " + numero);
      System.out.println("Agência do: " + nome + " é " + agencia);
      System.out.println("Seu saldo e de: " + saldo);
      System.out.println("----------------------------------------");

      System.out.println("olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo +
        " já esta disponível para saque.");

   }
}
