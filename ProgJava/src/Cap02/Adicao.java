package Cap02;

//Figura 2.7: Adicao.java
//Programa de ado��o que insree dois numerosm ent�o exibe a soma deles.
import java.util.Scanner; //programa utiliza a classe Scanner

public class Adicao 
{
	//m�todo main inicia a execu��o do aplicativo Java
    public static void main(String[] args)
    {
       //cria um Scanner para obter entrada a partir da janela de comando
       Scanner input = new Scanner(System.in);

       int numero1; //primeiro numero a somar
       int numero2; //segundo numero a somar
       int soma; //soma de numero1 e numero2

       System.out.print("Entre com primeiro inteiro: "); //prompt
       numero1 = input.nextInt(); //le primeiro o n�mero fornecido pelo usu�rio

       System.out.print("Entre com segundo inteiro: "); //prompt
       numero2 = input.nextInt(); //le o segundo n�mero fornecido pelo usu�rio

       soma = numero1 + numero2; // soma os numeros, depois armazena o total em soma

       System.out.printf("Soma foi %d%n", soma);
    }//fim do m�todo main
} // fim da classe Adicao
