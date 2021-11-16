//Figura 7.7: JogosDeDados.java --> tradução do ingles RollDie.java
//Programa de jogo de daos utilizando arraus em vez de switch
import java.util.Random;  

public class JogoDeDados 
{
    public static void main(String[] args)
    {
        Random NumerosRandomicos = new Random();
        int[] frequencia = new int[7]; //array de contadores de frequencia

        //lança o dado 6000 vezes utlizando o valor do dado indice de freqeuncia
        for(int rolar = 1; rolar <= 6000; rolar++)
           ++frequencia[1 + NumerosRandomicos.nextInt(6)];

        System.out.printf("%s%10s\n", "Face", " Frequencia");
        
        //gera saida do valor de cada elemento do array
        for(int face = 1; face < frequencia.length; face++)
            System.out.printf("%4d%10d\n", face, frequencia[face]);
    }//fim de main
}//fim da classe JogoDeDados
