package Cap05;

//Figura 5.2: ForContador.java
//Repeti��o controlada por contador com a instru��o de repeti��o for.

public class ForContador 
{
    public static void main(String[] args)
    {
        //o cabecalho da instruções for inclui inicializacao, 
        //condicao de continuação do loop e incremento
        for(int contador = 1; contador <= 10; contador++)
           System.out.printf("%d ", contador);

        System.out.println();   
    }//fim de main
}//fim da classe ForContador 
