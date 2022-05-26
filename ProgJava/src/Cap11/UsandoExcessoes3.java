package Cap11;

//Figura 11.7:  UsandoExcessoes3.java --> traducao do ingles UsingException.java
//Metodos Throwable getMessage getStackTrace e printStackTrace.
//corrigir codigo

public class UsandoExcessoes3
{
    public static void main(String[] args)
    {
        try 
        {
            metodo1(); //chama method1
        }//fim de try
        catch (Exception exception) //captura a excesao lancada em metodo1
        {
            System.err.printf("%s\n\n", exception.getMessage());
            exception.printStackTrace(); //imprime rastreamento da pilha de excecoes

            //obtém informações de rastreamento da pilha
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.println("\nRastreamento de pilha de getStackTrace()");
            System.out.println("Classe\t\tArquivo\t\t\tLinha\tMetodo");

            //faz um loop por traceElements para obter a descrição da exceção
            for(StackTraceElement elemento : traceElements)
            {
                System.out.printf("%s\t", elemento.getClassName());
                System.out.printf("%s\t", elemento.getFileName());
                System.out.printf("%s\t", elemento.getLineNumber());
                System.out.printf("%s\t", elemento.getMethodName());
            }//for final
        }//fim do catch
    }//fim de main

    //chama metodo2; labça exceçõs de volta para main
    public static void metodo1() throws Exception
    {
        metodo2();
    }//fim do metodo metodo1

    //chama metodo3; labça excecoes de volta para main
    public static void metodo2() throws Exception
    {
        metodo3();
    }//fim do método metodo2

    //lança Exception de volta para metodo2
    public static void metodo3() throws Exception
    {
        throw new Exception("Excecao lancada no metodo 3");
    }//fim do método metodo3
}//fim da classe UsandoExcessoes3