package Cap05;

//Figura 5.13:ConinueTeste.java
//continua instrução que termina interaÃ§Ã£o em uma instrução for. 

public class ContinueTeste 
{
    public static void main(String[] args) 
    {
       
       for(int contador = 1; contador <= 10; contador++) //faz o loop 10 vezes
       {
           if(contador == 5) //se contagem for 5
              continue; //pula o cÃ³digo restante no loop
           
           System.out.printf(" %d ", contador);   
       }//for final
       
       System.out.printf("\nUsando continue para pular impressÃ£o 5\n");
    }//fim de main
}
