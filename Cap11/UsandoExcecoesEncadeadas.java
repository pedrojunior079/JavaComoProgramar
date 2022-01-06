//Figura 11.8: UsandoExcecoesEncadeadas.java -->tradução em ingles UsingChainedExceptions.java
//Exceções encadeadas.

public class UsandoExcecoesEncadeadas
{
    public static void main(String[] args)
    {
        try
        {
            metodo1(); //chama metodo 1
        }//fim do try
        catch(Exception exception) //exceções usadas em método1
        {
            exception.printStackTrace();
        }//fim do catch
    }//fjm de main

    //chama método3; lança exceções de volta para método1
    public void metodo2()throws Exception
    {
        try
        {
            metodo3(); //chama metodo3
        }//fim de try
        catch(Exception exception) //exceção lançada de metodo3
        {
            throw new Exception("Exceção throw em método2", exception);
        }//fim do catch
    }//fim do método metodo2

    //lança Exception de volta para metodo2
    public static void metodo3()throws Exception
    {
        throw new Exception("Exceção throw em método3");
    }//fim do método metodo3
}//fim da classe UsandoExcessoesEncadeadas