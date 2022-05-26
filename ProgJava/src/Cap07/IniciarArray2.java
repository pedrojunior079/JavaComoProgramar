package Cap07;

//Figura 7.3: IniciarArray2.java --> traducao do ingles InitArray2.java
//Inicializando os elementos de um array com um inicializador de array.

public class IniciarArray2 
{
   public static void main(String[] args)
   {
       //lista dse inicializador especifica o valor inicial de caeda elemento
       int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; 

       System.out.printf("%s%8s%n", "Index", "Valor"); //titulos de coluna

       //gera saida do valor de cada elemento do array
       for(int contador = 0; contador < array.length; contador++)
           System.out.printf("%5d%8d\n", contador, array[contador]);
   }//fim de main  
}//fim da classe IniciarArray2
