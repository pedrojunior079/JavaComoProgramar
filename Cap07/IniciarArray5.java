//Figura 7.21: IniciarArray5.java --> tradução do ingles InitArray.java
//Inicializando um array com argumentos de linha de comando.

public class IniciarArray5
{
    public static void main(String[] args)
    {
       //verifica o número de argumentos de linha de comando
       if(args.length != 3)
           System.out.println("Erro: digite novamente todo o comando, incluindo\n"+
                              "um tamanho de array, valor inicial e incremento.");
       else
       {
           //obtém o tamanho do array a partir do primeiro argumento de linha de comando
           int arrayLength = Integer.parseInt(args[0]);
           int[] array = new int[arrayLength]; //cria o array

           //obtém o valor inicial e o incremento a partir dos argumentos de linha de comando
           int valorInicial = Integer.parseInt(args[1]);
           int incremento = Integer.parseInt(args[2]);

           //calcula o valor de cada elemento do array
           for(int contador = 0; contador < array.length; contador++)
               array[contador] = valorInicial + incremento * contador;

           System.out.printf("%s%8s\n", "Indice", "Valor");

           //exibe o valo0r e o indice de array
           for(int contador = 0; contador < array.length; contador++)
               System.out.printf("%5d%8d\n", contador, array[contador]);
       }//fim de else
    }//fim de main
}//fim da classe IniciarArray5
