package Cap11;

//Figura 11.8: UsandoExcecoesEncadeadas.java -->tradução em ingles UsingChainedExceptions.java
//Excecoes encadeadas.

public class UsandoExcecoesEncadeadas
{
    public static void main(String[] args)
    {
        try
        {
            metodo1(); //chama metodo 1
        }//fim do try
        catch(Exception exception) //excecoes usadas em metodo1
        {
            exception.printStackTrace();
        }//fim do catch
    }//fjm de main
    
    public static void metodo1()throws Exception
    {
    	try
    	{
    		metodo2(); // chama metodo2
    	} //fim do try
    	catch(Exception exception) // exce��o lan�ada de metodo2
    	{
    		throw new Exception("Excecao throw em metodo1", exception);
    	} // fim de catch
    } // fim do metodo metodo1

    //chama método3; lança exceções de volta para método1
    public static void metodo2()throws Exception
    {
        try
        {
            metodo3(); //chama metodo3
        }//fim de try
        catch(Exception exception) //exceção lançada de metodo3
        {
            throw new Exception("Excecao throw em metodo2", exception);
        }//fim do catch
    }//fim do método metodo2

    //lança Exception de volta para metodo2
    public static void metodo3()throws Exception
    {
        throw new Exception("Excecao throw em metodo3");
    }//fim do metodo metodo3
}//fim da classe UsandoExcessoesEncadeadas