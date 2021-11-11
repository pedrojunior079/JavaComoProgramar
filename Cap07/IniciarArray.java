//Figura 7.2: IniciarArray.java --> tradução do ingles InitArray.java
//Inicializando os elementos de um array como valores padrão de zero.

public class IniciarArray 
{
   public static void main(String[] args)
   {
       int[] array = new int[10]; //cria o objeto array

       System.out.printf("%s%8s%n", "Index", "Valor"); //titulos de coluna

       //gera saida do valor de cada elemento do array
       for(int contador = 0; contador < array.length; contador++)
           System.out.printf("%5d%8d%n", contador, array[contador]);
   }  
}//fim da classe IniciarArray
