package Cap06;

//Figura 6.9: JogoDeDados.java --> traducao em ingles Craps.java
//A classe Craps simula o jogo de dados craps.
import java.util.Random;

public class JogoDeDados 
{
   //cria gerador de números aleatorios para uso no metodo rolagem de dados
   private static final Random numerosAleatorios = new Random();
   
   //enumeração com constantes que representam o status do jogo
   private enum Status {CONTINUE, WON, LOST};

   //constantes que representam lançamentos comuns dos dados
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   //jogar um partida de JogoDeDados
   public void jogar()
   {
      int meuPonto = 0; //pontos se não ganhar ou perder na 1a. rolagem
      Status gameStatus; //pode conter CONTINUE, WON ou LOST
      int somaDosDados = rolagemDados(); //primeira rolagem de dados

      //determina o status do jogo e a pontuação com base no primeiro lançamento
      switch(somaDosDados)
      {
          case SEVEN: //ganha com 7 no primeiro lançamento
          case YO_LEVEN: //ganha com 11 no primeiro lançamento
             gameStatus = Status.WON;
             break;
          case SNAKE_EYES: //perde com 2 no primeiro lançamento
          case TREY: //perde com 3 no primeiro lançamento
          case BOX_CARS: //perde com 12 no primeiro lançamento
             gameStatus = Status.LOST;
             break;
          default: //não ganhou nem perdeu, então registra a pontuação
          gameStatus = Status.CONTINUE; //jogo não terminou
          meuPonto = somaDosDados; //informa a pontuação
          System.out.printf("Ponto é %d\n", meuPonto);
          break; //opcional no final do switch    
      }//fim do switch

      //enquanto o jogo não estiver completo
      while(gameStatus == Status.CONTINUE) //nem WON nem LOST
      {
          somaDosDados = rolagemDados(); //lança os dados novamente

          //determina o status do jogo
          if(somaDosDados == meuPonto) //vitoria por pontuação
             gameStatus = Status.WON;
          else
             if(somaDosDados == SEVEN) //perde obtendo 7 antes de atingir a pontuação
                gameStatus = Status.LOST; 
      }//fim do while

      //exibe uma mensagem ganhou ou perdeu
      if(gameStatus == Status.WON)
         System.out.println("Jogador ganhou");
      else
         System.out.println("Jogador perdeu");    
   }//fim do método jogar

   //lança os dados, calcula a soma e exibe os resultados
   public int rolagemDados()
   {
      //seleciona valores aleatórios do dados
      int o_dado1 = 1 + numerosAleatorios.nextInt(6); //Primeiro lançamento do dado
      int o_dado2 = 1 + numerosAleatorios.nextInt(6); //Segundo lançamento do dado
      int soma = o_dado1 + o_dado2; //soma dos valores dos dados

      //exibe os resultados desse lançamento
      System.out.printf("Jogador rolou %d + %d = %d\n", o_dado1, o_dado2, soma);
      
      return soma; //retorna a soma dos dados
   }//fim do método rolagemDados
}//fim da classe JogoDeDados
