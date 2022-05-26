package Cap07;

//Figura 7.4: IniciarArray3.java --> traducao do ingles InitArray3.java
//Calcula os valores s serem colocados nos elementos de um array.

public class IniciarArray3 
{
   public static void main(String[] args)
   {
       final int ARRAY_LENGTH = 10; //declara constante
       int[] array =  new int[ARRAY_LENGTH]; //cria o array
       
       //calcula valor5 de cada elemento do array
       for(int contador = 0; contador < array.length; contador++)
           array[contador] = 2 + 2 * contador;

       System.out.printf("%s%8s\n", "Index", "Valor"); //titulos de coluna

       //gera saida do valor de cada elemento do array
       for(int contador = 0; contador < array.length; contador++)
           System.out.printf("%5d%8d\n", contador, array[contador]);
   }//fim de main  
}//fim da classe IniciarArray3
