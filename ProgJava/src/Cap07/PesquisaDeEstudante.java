package Cap07;

//Figura 7.8: PesquisaDeEstudante.java --> traducao do ingles studentPoll.java
//Programa de análise de enquete.


public class PesquisaDeEstudante 
{
    
    public static void main(String[] args)
    {
        //array de resposta de enquete
        int[] respostas = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
        10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 5, 6, 7, 5, 6, 
        4, 8, 6, 8, 10};
        int[] frequencia = new int[11]; //array de contadores de frequencia
    
        //para cada resposta, seleciona elemento da resposta e
        //usa esse valor como indice de frequencia para determinar o elemento a incrementar
        for(int a_resposta = 0; a_resposta < respostas.length; a_resposta++)
           ++frequencia[respostas[a_resposta]];

        System.out.printf("%s%10s\n", "Avaliação", " Freqeuncia");
        
        //gera saida do valor de cada elemento do array
        for(int avaliacao = 1; avaliacao < frequencia.length; avaliacao++)
            System.out.printf("%4d%10d\n", avaliacao, frequencia[avaliacao]);
    }//fim de main
}//fim da classe PesquisaDeEstudante

