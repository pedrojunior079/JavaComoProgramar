//Figura 11.2: DividirPorZeroComTratExcessoes.java --> tradução do ingles DivideByZeroWithExceptionHandling.java
//Tratanto ArithmeticExceptions e InputMismathExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorZeroComTratExcessoes
{
    //demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quociente(int numerador, int denominador) throws ArithmeticException
    {
        return numerador / denominador; //possivel divisão por zero
    }//fim do método quociente

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //scanner para a entrada
        boolean continueLoop = true; //determina se mais entrada são necessarias

        do
        {
            try //le dois números e calcula o quociente
            {
                System.out.print("Por favor entre com numerador inteiro: ");
                int numerador = scanner.nextInt();
                System.out.println("Por favor entre com denominador inteiro: ");
                int denominador = scanner.nextInt();

                int resultado = quociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                continueLoop = false; //entrada bem-sucedida; fim do loop
            }//fim do try
            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("\nExceção: %s\n", inputMismatchException);
                scanner.nextLine(); //descarta entrada para o usuario poder tentar de novo
                System.out.println("Você deve inserir números inteiros. Por favor, tente novamente.\n");
            }//fim do catch
        }while (continueLoop); //fim da instrução do...while
    }//fim de main
}//fim da classe DividirPorZeroComTratExecessoes