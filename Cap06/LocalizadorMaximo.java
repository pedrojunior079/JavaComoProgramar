//Figura 6.3: LocalizadorMaximo.java --> tradução da classe em ingles MaximunFinder.java
//Método LocalizadorMaximo declardo pelo programador com tres parametros double
import java.util.Scanner;

public class LocalizadorMaximo 
{
    //obtém tres valores de ponto flutuante e localiza o valor maximo
    public void determinaMaximo()
    {
        //cria Scanner para entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //solicita e insere tres valores de ponto flutuante
        System.out.print("Insira três valores de ponto flutuante separados por espaços: ");
        double numero1 = input.nextDouble(); //le o primeiro double
        double numero2 = input.nextDouble(); //le o segundo double
        double numero3 = input.nextDouble(); //le o terceiro double

        //determina o valor máximo
        double resultado = maximo(numero1, numero2, numero3);

        //exibe o valor maximo
        System.out.println("Maximo é: " +resultado);
    }//fim do método determinaMaximo

    //retorna o máximo dos seus tres parametros de double
    public double maximo(double x, double y, double z)
    {
        double valorMaximo = x; //supoe que x é o maior valor inicial

        //determina-se y é maior que valorMaximo
        if(y > valorMaximo)
          valorMaximo = y;

        //determina se z é maior que valorMaximo
        if(z > valorMaximo)
          valorMaximo = z;
          
        return valorMaximo;          
    }//fim do método maximo
}//fim da classe LocalizadorMaximo
