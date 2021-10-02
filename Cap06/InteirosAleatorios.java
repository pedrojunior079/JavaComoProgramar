//Figura 6.7: InteirosAleatorios.java ---> tradução do ingles RandomIntegers.java
//Inteiros aleatorios deslocados e escalonados.
import java.util.Random;

public class InteirosAleatorios 
{
   public static void main(String[] args)
   {
       Random numerosAleatorios = new Random(); //gerador de numero aleatorio
       int face; //armazena cada inteiro aleatorio gerado

       //faz o loop 20 vezes
       for(int contador = 1; contador <= 20; contador++)
       {
           //seleciona o inteiro aleatorio ebtre 1 a 6
           face = 1 + numerosAleatorios.nextInt(6);

           System.out.printf("%d ", face); //exibe o valor gerado

           //se o contador for divisivel por 5, inicia uma nova linha de saida
           if(contador % 5 == 0)
              System.out.println();
       }//for final
   }//fim de main    
}//fim da classe InteirosAleatorios
