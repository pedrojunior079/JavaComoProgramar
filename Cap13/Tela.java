//Tela.java -->tradução do ingles Screen.java
//Representa a tela do ATM

public class Tela
{
    //exibe uma mensagem sem retorno de carro
    public void telaMensagem(String mensagem)
    {
        System.out.print(mensagem);
    }//fim do método telaMensagem

    //exibe uma mensagem com um retorno de carro
    public void displayMessageLine(String mensagem)
    {
        System.out.println(mensagem);
    }//fim do método displayMessageLine

    //exibe um valor em dólares
    public void telaDollarValor(double valor)
    {
        System.out.println("$%,.2f", valor);
    }//fim do método telaDollarValor
}//fim da classe Tela