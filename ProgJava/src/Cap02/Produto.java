package Cap02;

//Exercicio 2.6: Produto.java
//Calcula o produto de tres inteiros.
import java.util.Scanner; //programa utiliza a classe Scanner

public class Produto 
{
	//método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
       //cria um Scanner para obter entrada a partir da janela de comando
       Scanner input = new Scanner(System.in);

       int x; //primeiro numero inserido pelo usuário
       int y; //segundo numero inserido pelo usuário
       int z; //terceiro numero inserido pelo usuário
       int resultado; //produto dos numeros

       System.out.print("Entre com primeiro inteiro: "); //solicita entrada
       x = input.nextInt(); //le primeiro primeiro

       System.out.print("Entre com segundo inteiro: "); //solicita entrada
       y = input.nextInt(); //le o segundo inteiro

       System.out.print("Entre com terceiro inteiro: "); //solicita entrada
       z = input.nextInt(); //le o terceiro inteiro

       resultado = x * y * z; // calcula o produto dos numeros

       System.out.printf("Produtos foi %d%n", resultado);
    }//fim do método main 
} // fim da classe Produto
