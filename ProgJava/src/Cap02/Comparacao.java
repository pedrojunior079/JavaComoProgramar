package Cap02;

//Figura 2.15: Comparacao.java
//Compara inteiros utilizando instru��es if, operadoes relacionais 
//e operadores de igualdade.
import java.util.Scanner; //programa utilizando a classe Scanner

public class Comparacao 
{
	//m�todo main inicia a execu��o do aplicativo Java
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero1; //primeiro numero a somar
        int numero2; //segundo numero a somar
        
        System.out.print("Entre com primeiro inteiro: "); //prompt
        numero1 = input.nextInt(); //le primeiro o n�mero fornecido pelo usu�rio

        System.out.print("Entre com segundo inteiro: "); //prompt
        numero2 = input.nextInt(); //le o segundo n�mero fornecido pelo usu�rio

        if(numero1 == numero2)
          System.out.printf("%d == %d%n", numero1, numero2);
          
        if(numero1 != numero2)
          System.out.printf("%d != %d%n", numero1, numero2);
          
        if(numero1 < numero2)
          System.out.printf("%d < %d%n", numero1, numero2);
          
        if(numero1 > numero2)
          System.out.printf("%d > %d%n", numero1, numero2);
          
        if(numero1 <= numero2)
          System.out.printf("%d <= %d%n", numero1, numero2);

        if(numero1 >= numero2)
          System.out.printf("%d >= %d%n", numero1, numero2);
    }//fim do m�todo main 
} // fim da classe Comparacao
