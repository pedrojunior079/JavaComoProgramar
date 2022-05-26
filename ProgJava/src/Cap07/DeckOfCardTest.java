package Cap07;

//Figura 7.11: DeckOfCardsTest.java
//Embaralhando e disyribuindo cartas.

public class DeckOfCardTest
{
   //executando o aplicativo
   public static void main(String[] args)
   {
       DeckOfCards meuBaralhoDeCartas = new DeckOfCards();
       meuBaralhoDeCartas.shuffle(); //colocra Cartas em ortdem aleatoria

       //imprime todas as 52 cartas na ordem emn que são distribuidas
       for(int i  = 1; i < 52; i++)
       {
           //distribui e exibe uma carta
           System.out.printf("%-19s", meuBaralhoDeCartas.dealCard());

           if(i % 4 == 0) //imprimne uma nova linha a cada 4 cartas
             System.out.println();
       }//fim do for
   }//fim do main
}//fim da classe BaralhoDeCartasTeste