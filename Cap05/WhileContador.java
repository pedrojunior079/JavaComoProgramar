//Figura 5.1:WhileContador.java
//Repetição controlada por contador com a instrução de repetição while.

public class WhileContador
{
    public static void main(String[] args)
    {
        int contador = 1; //declara e inicializa a variavel de controle
        while(contador <= 10) //condição de continmuação do loop
        {
            System.out.printf("%d ", contador);
            ++contador; //variavel de controle de incremento
        }

        System.out.println();
    }
}//fim da classe WhileContador
