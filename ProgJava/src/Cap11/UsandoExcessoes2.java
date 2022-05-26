package Cap11;

//Figura 11.6:  UsandoExcessoes2.java --> tradu��o do ingles UsingException.java
//Desempilhamento.

public  class UsandoExcessoes2
{
    public static void main(String[] args)
    {
        try //chama throwException para demonstrar o desempilhamento
        {
            throwException(); //chama método throwException
        }//fim de try
        catch (Exception exception) //exce��o lancada em throwException
        {
            System.err.println("Exceção tratada no principal");
        }//fim do catch
   }//fim de main

    //throwException lança exceção que não é capturada nesse método
    public static void throwException() throws Exception
    {
        try //lança uma exceção e captura em main
        {
            System.out.println("Método throwException");
            throw new Exception();  //gera a excecao
        }//fim de try
        catch (RuntimeException runtimeException) //captura o tipo correto
        {
            System.err.println("Exceção tratada no método lançar Exception");
        }//fim do catch
        finally //o bloco finally sempre executa
        {
            System.err.println("Finalmente é sempre executado");
        }//fim de finally
   }//fim do metodo throwException
}//fim da classe UsandoExcessoes2