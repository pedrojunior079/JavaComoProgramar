//Figura 7.11: BaralhoDeCartasTeste.java --> tradução do ingles DeckOfCardsTest.java
//Embaralhando e disyribuindo cartas.
import java.util.Random;

public class BaralhoDeCartasTeste 
{
   //executando o aplicativo
   public static void main(String[] args)
   {
       BaralhoDeCartas meuBaralhoDeCartas = new BaralhoDeCartas();
       meuBaralhoDeCartas.embaralhar(); //colocra Cartas em ortdem aleatória

       //imprime todas as 52 cartas na ordem emn que são distribuidas
       for(int i  = 1; i < 52; i++)
       {
           //distribui e exibe uma carta
           System.out.printf("%-19s", meuBaralhoDeCartas.lidarCartas());

           if(i % 4 == 0) //imprimne uma nova linha a cada 4 cartas
             System.out.println();
       }//fim do for
   }//fim do main
}//fim da classe BaralhoDeCartasTeste