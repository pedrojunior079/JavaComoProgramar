//Figura 11.7:  UsandoExcessoes3.java --> tradução do ingles UsingException.java
//Métodos Throwable getMessage getStackTrace e printStackTrace.
//corrigir codigo

public class UsandoExcessoes3
{
    public static void main(String[] args)
    {
        try 
        {
            metodo1(); //chama method1
        }//fim de try
        catch (Exception exception) //captura a exceção lançada em method1
        {
            System.err.printf("%s\n\n", exception.getMessage());
            exception.printStackTrace(); //imprime rastreamento da pilha de exceções

            //obtém informações de rastreamento da pilha
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.println("\nRastreamento de pilha de getStackTrace()");
            System.out.println("Classe\t\tArquivo\t\t\tLinha\tMetodo");

            //faz um loop por traceElements para obter a descrição da exceção
            for(StackTraceElement elemento : traceElements)
            {
                System.out.printf("%s\t", elemento.getClasseNome());
                System.out.printf("%s\t", elemento.getArquivoNome());
                System.out.printf("%s\t", elemento.getLinhaNome());
                System.out.printf("%s\t", elemento.getMetodoNome());
            }//for final
        }//fim do catch
    }//fim de main

    //chama metodo2; labça exceçõs de volta para main
    public static void metodo1() throws Exception
    {
        metodo2();
    }//fim do método metodo1

    //chama metodo3; labça exceçõs de volta para main
    public static void metodo2() throws Exception
    {
        metodo3();
    }//fim do método metodo2

    //lança Exception de volta para metodo2
    public static void metodo3() throws Exception
    {
        throw new Exception("Exceção lançada no método 3");
    }//fim do método metodo3
}//fim da classe UsandoExcessoes3