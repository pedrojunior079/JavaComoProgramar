package Cap05;

//Figura 5.7: DowhileTeste.java
//instrução de repetição do...while

public class DoWhileTeste 
{
    public static void main(String[] args)
    {
        int contador = 1; //incializa o contador
        do
        {
            System.out.printf("%d ", contador);
            ++contador; 
        }while(contador <= 10);

        System.out.println(); //gera saida de um caractere nova linha
    }//fim de main
}//fim da classe DoWhileTeste
