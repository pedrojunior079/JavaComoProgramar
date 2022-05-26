package Cap03;

//Figura 3.9: Conta3Teste.java
//Entrada e saida ds n�meros de ponto flutuante com objetos Conta.
import java.util.Scanner;

public class Conta3Teste 
{
   public static void main(String[] args)
   {
      //cria dois objetos Conta
      Conta3 conta1 = new Conta3("Pedro Junior", 50.00);
      Conta3 conta2 = new Conta3("Andre Luiz", -7.53);

      //exibe o valor inicial de nome para cada Conta
      System.out.printf("conta1 nome é: %s%n", conta1.getNome(),conta1.getSaldo());
      System.out.printf("conta2 nome é: %s%n", conta2.getNome(),conta2.getSaldo());

      //cria um Scanner para obter entrasda a partir da janela de comando
      Scanner input = new Scanner(System.in);

      System.out.print("Entre com valor do deposito da conta1: "); //prompt
      double valorDeposito = input.nextDouble(); //obtém a entrada do usuário
      System.out.printf("%nadicionado %.2f ao saldo da conta1%n%n",valorDeposito);
      conta1.deposito(valorDeposito);

      //exibe os saldos
      System.out.printf("%s saldo: $%.2f %n", conta1.getNome(),conta1.getSaldo());
      System.out.printf("%s saldo: $%.2f %n%n",conta2.getNome(),conta2.getSaldo());
      
   }//fim de main    
}//fim da classe Conta3Teste
