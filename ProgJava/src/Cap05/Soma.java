package Cap05;

//Figura 5.5: soma.java
//somando inteiros com instrução for.

public class Soma 
{
    public static void main(String[] args)
    {
        int total = 0;

        //total de inteiros pares de 2 a 20
        for(int numero = 2; numero <= 20; numero += 2)
            total += numero;

        System.out.printf("Soma foi %d%n", total); //exibe os resultados   
    }//fim de main
}//fim da classe Soma
