//Figura 7.17: IniciarArray4.java --> tradução do ingles InitArray.java
//Inicializando arrays bidimensionais

public class IniciarArray4
{
    //cria e gera array bidimensionais
    public static void main(String[] args)
    {
        int[][] array1 = {{1, 2, 3,}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("\nOs valores no array1 por linha são");
        saidaArray(array1); //exibe array1 por linha

        System.out.println("\nOs valores no array2 por linha são");
        saidaArray(array2); //exibe array2 por linha
    }//fim de main

    //gera saida de linhas e colunas de um array bidimensional
    public static void saidaArray(int[][] array)
    {
        //faz um loop pelas linhas do array
        for(int linha = 0; linha < array.length; linha++)
        {
            //faz um loop pelas colunas da linha atual
            for(int coluna = 0; coluna < array[linha].length; coluna++)
                System.out.printf("%d ", array[linha][coluna]);

            System.out.println(); //inicia nova linha de saida
        }//fim do for externo
    }//fim do método saidaArray
}//fim da classe IniciarArray4
