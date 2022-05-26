package Cap05;

//Figura 5.12:BreakTeste.java
//a instruÃ§Ã£o break sai de uma instrução for 

public class BreakTeste 
{
    public static void main(String[] args) 
    {
       int contador; //varioavel de controle também usada depois que o loop termina 
       for(contador = 1; contador <= 10; contador++) //faz o loop 10 vezes
       {
           if(contador == 5) //se contagem for 5
              break;
           
           System.out.printf(" %d ", contador);   
       }//for final
       
       System.out.printf("\nSaiu do loop na contagem = %d\n", contador);
    }//fim de main
}//fim da classe BreakTeste
