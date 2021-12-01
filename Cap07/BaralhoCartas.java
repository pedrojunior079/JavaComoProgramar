//Figura 7.10: BaralhoDeCartas.java --> tradução do ingles DeckOfCards.java
//Classe DeckOfCards representa um baralho.

import java.util.Random;

public class BaralhoCartas
{
   private Card[] deck; //array de objetos CartaBaralho
   private int currentCartaBaralho; //indice do proximo CartaBaralho a ser distribuido
   private static final int NUMBER_OF_CARDS = 52; //número constante de cartas baralho
   //gerador de número aleatorio
   private static final Random NumerosRandomicos = new Random();
   
   //construtor preenche baralho de cartas
   public BaralhoCartas()
   {
       String faces = {"Ás", "Duque", "Tres", "Quatro", "Cinco", "Seis", "Sete", 
            "Oito", "Nove", "Dez", "o valete", "Rainha", "Rei"};
       String naipe = {"Copas", "Diamantes", "o naipe de paus", "Espadas"};
       
       deck = new Card[NUMBER_OF_CARDS]; //cria array de objetos CartaBaralho
       currentCartaBaralho = 0; //configura currentCartaBaralho então o primeiro CartaBaralho distribuido é o_baralho[0]

       for(int contador = 0; contador < deck.lenght; contador++)
           deck[contador] = new Card(faces[contador % 13], naipe[contador / 13]);
   }//fim do construtor BaralhoDeCartas
   
   //embralhar as cartas com um algoritmo de uma passagem
   public void embaralhar()
   {
       //depois de embaralhar, a distribuição deve iniciar em o_baralho[0] novamente
       currentCartaBaralho = 0; //reinicializa currentCartaBaralho

       //para cada CartaBaralho, seleciona outro CartaBaralho aleatoriamente e os compara
       for(int primeiro = 0; primeiro < deck.lenght; primeiro++)
       {
           //seleciona um número aleatório entre 0 e 51
           int segundo = NumerosRandomicos.nextInt(NUMBER_OF_CARDS);

           //compara CartaBaraçho atual com CartaBaralho aleatóriamente selecionado
           Card temp = deck[primeiro];
           deck[primeiro] = deck[segundo];
           deck[segundo] = temp; 
       }//fim do for
   }//fim do método embaralhar

   //distribuir um CartaBaralho
   public Card lidarCartas()
   {
       //determine se ainda ha Cartas a serem deistribuidos
       if(currentCartaBaralho < deck.lenght)
          return deck[currentCartaBaralho++]; //retorna Carta atual no array
       else
          return null; //retorna nulo para indicar que todos os Cartas foram distribuidos   
   }//fim do método lidarCartas
}//fim da classe BaralhoDeCartas