package Cap07;

//Figura 7.10: BaralhoDeCartas.java --> traduÃ§Ã£o do ingles DeckOfCards.java
//Classe DeckOfCards representa um baralho.

import java.util.Random;

public class DeckOfCards
{
   private Card[] deck; //array de objetos CartaBaralho
   private int currentCard; //indice do proximo CartaBaralho a ser distribuido
   private static final int NUMBER_OF_CARDS = 52; //nÃºmero constante de cartas baralho
   //gerador de nÃºmero aleatorio
   private static final Random randomNumbers = new Random();
   
   //construtor preenche baralho de cartas
   public DeckOfCards()
   {
       String[] faces = {"As", "Duque", "Tres", "Quatro", "Cinco", "Seis", "Sete", 
            "Oito", "Nove", "Dez", "o valete", "Rainha", "Rei"};
       String[] naipe = {"Copas", "Diamantes", "o naipe de paus", "Espadas"};
       
       deck = new Card[NUMBER_OF_CARDS]; //cria array de objetos CartaBaralho
       currentCard = 0; //configura currentCartaBaralho entÃ£o o primeiro CartaBaralho distribuido Ã© o_baralho[0]

       for(int contador = 0; contador < deck.length; contador++)
           deck[contador] = new Card(faces[contador % 13], naipe[contador / 13]);
   }//fim do construtor BaralhoDeCartas
   
   //embralhar as cartas com um algoritmo de uma passagem
   public void shuffle()
   {
       //depois de embaralhar, a distribuiÃ§Ã£o deve iniciar em o_baralho[0] novamente
       currentCard = 0; //reinicializa currentCartaBaralho

       //para cada CartaBaralho, seleciona outro CartaBaralho aleatoriamente e os compara
       for(int primeiro = 0; primeiro < deck.length; primeiro++)
       {
           //seleciona um nÃºmero aleatÃ³rio entre 0 e 51
           int segundo = randomNumbers.nextInt(NUMBER_OF_CARDS);

           //compara CartaBaraÃ§ho atual com CartaBaralho aleatÃ³riamente selecionado
           Card temp = deck[primeiro];
           deck[primeiro] = deck[segundo];
           deck[segundo] = temp; 
       }//fim do for
   }//fim do mÃ©todo embaralhar

   //distribuir um CartaBaralho
   public Card dealCard()
   {
       //determine se ainda ha Cartas a serem deistribuidos
       if(currentCard < deck.length)
          return deck[currentCard++]; //retorna Carta atual no array
       else
          return null; //retorna nulo para indicar que todos os Cartas foram distribuidos   
   }//fim do mÃ©todo lidarCartas
}//fim da classe BaralhoDeCartas