//Figura 2.15: Comparacao.java
//Compara inteiros utilizando instruções if, operadoes relacionais 
//e operadores de igualdade.
import java.util.Scanner; //programa utilizando a classe Scanner

public class Comparacao 
{
    //método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero1; //primeiro numero a somar
        int numero2; //segundo numero a somar
        
        System.out.print("Entre com primeiro inteiro: "); //prompt
        numero1 = input.nextInt(); //le primeiro o número fornecido pelo usuário

        System.out.print("Entre com segundo inteiro: "); //prompt
        numero2 = input.nextInt(); //le o segundo número fornecido pelo usuário

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
    }//fim do método main
}//fim da classe Comparacao
