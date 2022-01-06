//Figura 11.1: DividirPorZeroSemTratExcessoes.java --> tradução do ingles DivideByZeroNoExceptionHandling.java
//Divisão de inteiros sem tratamento de exceções.
import java.util.Scanner;

public class DividirPorZeroSemTratExcessoes
{
    //demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quociente(int numerador, int denominador)
    {
        return numerador / denominador; //possivel divisaão por zero
    }//fim do método quociente

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //scanner para entrada

        System.out.print("Por favor entre com o numerador inteiro: ");
        int numerador = scanner.nextInt();
        System.out.print("Por favor entre com o denominador inteiro: ");
        int denominador = scanner.nextInt();

        int resultado = quociente(numerador, denominador);
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
    }//fim de main
}//fim da classe DividirPorZeroSemTratExcessoes