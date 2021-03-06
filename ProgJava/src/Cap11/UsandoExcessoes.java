package Cap11;

//Figura 11.5: UsandoExcessoes.java --> traducao do ingles UsingException.java
//mecanismo de tratamento de excecoes try...catch...finally.

public  class UsandoExcessoes
{
    public static void main(String[] args)
    {
       try
       {
           throwException(); //chama método throwException
       }//fim de try
        catch (Exception exception)
        {
            System.err.println("Excecao tratada no principal");
        }//fim do catch

        doesNotThrowException(); //gera a exceção
    }//fim de main

    //demonstra try..catch..finally
    public static void throwException() throws Exception
    {
        try //lança uma excecao e imediatamente a captura
        {
            System.out.println("Método throwException");
            throw new Exception();  //gera a exceção
        }//fim de try
        catch (Exception exception) //captura exceção lançada em try
        {
            System.err.println("Excecao tratada no metodo lancar Exception");
            throw  exception; //lança novamente para processamento

            //o codigo aqui não seria alcançado; causaria erros de compilação
        }//fim do catch
        finally //executa independentemente do que ocorre em try...catch
        {
            System.err.println("Finalmente executado em throw Exception");
        }//fim de finally

        //o codigo aqui nao seria alcancado; causaria erros de compilacao

    }//fim do método throwException

    //demonstra finally quando nenhuma excecao ocorrer
    public static void doesNotThrowException()
    {
        try //bloco try não lança uma exceção
        {
            System.out.println("Método doesNotThrowsException");
        }//fim do try
        catch (Exception exception) //não executa
        {
            System.err.println("Finalmente executando em doesNotThrowsException");
        }//fim de finally

        System.out.println("Fim do método doesNotThrowsException");
    }//fim do metodo doesNotThrowsException
}//fim da classe UsandoExcessoes