package Cap07;

//Figura 7.5: SomaArray.java --> traducao do ingles SumArray.java
//Calculando a soma dos elementos de um array

public class SomaArray
{
    public static void main(String[] args)
    {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total  = 0;

        //adiciona o valor de cada elemento ao total
        for(int contador = 0; contador < array.length; contador++)
            total += array[contador];

        System.out.printf("Total de elementos no array: %d\n", total);    
    }//fim de main
}//fim da classe SomaArray