//Teclado.java -->tradução do ingles Keypad.java
//Representa o teclado do ATM
import java.util.Scanner;

public class Teclado
{
    private Scanner input; //le os dados na linha de comando

    //o construtor sem argumentos incializa a classe Scanner
    public Teclado()
    {
        input = new Scanner(System.in);
    }//fim do construtor Teclado sem argumentos

    //retorna um valor inteiro inserido pelo usuário
    public int getInput()
    {
        return input.nextInt(); //supomos que o usuário insira um inteiro
    }//fim do método getInput
}//fim da classe Teclado