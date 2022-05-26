package Cap03;

//Figura 3.2: ContaTeste.java
//Cria e manipula um objeto Conta
import java.util.Scanner;

public class ContaTeste 
{
   public static void main(String[] args)
   {
      //cria um objeto Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in);

      //cria um objeto Conta e o atribui a minhaConta
      Conta minhaConta = new Conta();

      //exibe o valor inicial do nome (null)
      System.out.printf("Nome inicial é: %s%n%n", minhaConta.getNome());

      //solicita e le o nome
      System.out.println("Por favor entre com o nome:");
      String Nome = input.nextLine(); //le uma linha de texto
      minhaConta.setNome(Nome); //insere Nome em minhaConta
      System.out.println(); //gera saída de uma linha em branco

      //exibe o nome armazenado no objeto minhaConta
      System.out.printf("O nome no objeto minhaConta é:%n%s%n",minhaConta.getNome());
   }    
}//fim da classe ContaTeste
