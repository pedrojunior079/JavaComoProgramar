//Figura 2.7: Adicao.java
//Programa de adoção que insree dois numerosm então exibe a soma deles.
import java.util.Scanner; //programa utiliza a classe Scanner

public class Adicao 
{
    //método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
       //cria um Scanner para obter entrada a partir da janela de comando
       Scanner input = new Scanner(System.in);

       int numero1; //primeiro numero a somar
       int numero2; //segundo numero a somar
       int soma; //soma de numero1 e numero2

       System.out.print("Entre com primeiro inteiro: "); //prompt
       numero1 = input.nextInt(); //le primeiro o número fornecido pelo usuário

       System.out.print("Entre com segundo inteiro: "); //prompt
       numero2 = input.nextInt(); //le o segundo número fornecido pelo usuário

       soma = numero1 + numero2; // soma os numeros, depois armazena o total em soma

       System.out.printf("Soma foi %d%n", soma);
    }//fim do método main    
}//fim da classe Adicao
