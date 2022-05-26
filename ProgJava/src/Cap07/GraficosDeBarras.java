package Cap07;

//Figura 7.6: GraficosDeBarras.java --> traducao do ingles BarChart.java
//programa de impressão de grafico de barras

public class GraficosDeBarras 
{
    public static void main(String[] args)
    {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("distribuição de notas:");

        //parte cada elemento de array, gera saida de uma barra do grafico
        for(int contador = 0; contador < array.length; contador++)
        {
            //imprime rótulo de barra ("00-09: ", ...,"90-99: ", " "100: ")
            if(contador == 10)
               System.out.printf("%5d: ", 100);
            else
               System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
               
            //imprime a barra de asteriscos
            for(int estrelas = 0; estrelas < array[contador]; estrelas++)
                System.out.print("*");
                
            System.out.println();//inicia uma nova linha de saida    
        }//fim do for externo
    }//fim de main
}//fim da classe GraficosDeBarras
