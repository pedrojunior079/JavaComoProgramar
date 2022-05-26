package Cap03;

//Figura 3.6: Conta2Teste.java
//Usando o construtor de Conta para inicializar a instancia nome
//variavel no momento em que cvada objeto Conta é criado.


public class Conta2Teste 
{
   public static void main(String[] args)
   {
      //cria dois objetos Conta
      Conta2 conta1 = new Conta2("Pedro Junior");
      Conta2 conta2 = new Conta2("Andre Luiz");

      //exibe o valor inicial de nome para cada Conta
      System.out.printf("conta1 nome é: %s%n", conta1.getNome());
      System.out.printf("conta2 nome é: %s%n", conta2.getNome());
      
   }    
}//fim da classe ContaTeste
