package Cap06;

//Figura 6.8: RolarDado.java --> traducao do ingles RollDie.java
//Rola um dado de seis lados 6 mil vezes
import java.util.Random;

public class RolarDado 
{
    public static void main(String[] args)
    {
        Random numerosAleatorios = new Random(); //gerador de numeros
        
        int frequencia1 = 0;//mantém a contagem de 1s lançados
        int frequencia2 = 0;//contagem de 2s lançados
        int frequencia3 = 0;//contagem de 3s lançados
        int frequencia4 = 0;//contagem de 4s lançados
        int freqeuncia5 = 0;//contagem de 5s lançados
        int frequencia6 = 0;//contagem de 6s lançados

        int face; //armazena o valor lançado mais recentemente

        //soma 6.000 lançamentos de um dado
        for(int rolar = 1; rolar <= 6000; rolar++)
        {
            face = 1 + numerosAleatorios.nextInt(6);//número entre 1 a 6

            //defne o valor de lançamento de 1 a 6 e incrementa o contador apropriado
            switch(face)
            {
                case 1:
                   ++frequencia1; //incrementa o contador de 1s
                   break;
                case 2:
                   ++frequencia2; //incrementa o contador de 2s
                   break;
                case 3:
                   ++frequencia3; //incrementa o contador de 3s
                   break;
                case 4:
                   ++frequencia4; //incrementa o contador de 4s
                   break;
                case 5:
                   ++freqeuncia5; //incrementa o contador de 5s
                   break;
                case 6:
                   ++frequencia6; //incrementa o contador de 6s
                   break; //opcional no final do switch              
            }//fim do switch
        }//for final

        System.out.println("Face\tFrequencia"); //cabeçalho de saida
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
        frequencia1, frequencia2, frequencia3, frequencia4,
        freqeuncia5, frequencia6);
    }//fim de main
}//fim da classe RolarDado
