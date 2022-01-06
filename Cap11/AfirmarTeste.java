//Figura 11.9: AfirmarTeste.java --> tradução do ingles AssertTeste.java
//verificando com Afirmar que um valor está dentro  do intervalo.
import java.util.Scanner;

public class AfirmarTeste
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o numero de 0 a 10: ");
        int numero = input.nextInt();

        //faz a assertiva de que o valor é  >= 0 e <= 10
        assert(numero >= 0 && numero <= 10)  : "mau numero: " +numero;

        System.out.printf("Voce digitou %d\n",  numero);
    }//fim de main
}//fim da classe AfirmarTeste
