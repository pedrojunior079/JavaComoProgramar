//Figura 8.16: IncrementoTeste.java --> tradução do ingles IncrementTest.java
//Variavel final inicializada com um argumento de construtor.

public class IncrementoTeste
{
    public static void main(String[] args)
    {
        Incremento valor = new Incremento(5);

        System.out.printf("Antes de incrementar: %s\n\n", valor);

        for(int i = 1; i <= 3; i++)
        {
            valor.addIncrementoTotal();
            System.out.printf("Depois de incrementar %d: %s\n", i, valor);
        }//for final
    }  //fim de main
}//fim da classe IncrementoTeste