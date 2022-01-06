//Conta.java --> tradução em ingles Account.java
//Repreenta uma conta bancária

public class Conta
{
    private int contaNumero; //numero da conta
    private int pin; //PIN para autenticação
    private double saqueDisponivel; //fundos disponiveis para saque
    private double totalSaque; //fundos disponiveis + depositos pendentes

    //O construtor Conta inicializa os atributos
    public Conta(int ContaNumero, int PIN, double SaqueDisponivel, double TotalSaque)
    {
        contaNumero = ContaNumero;
        pin = PIN;
        saqueDisponivel = SaqueDisponivel;
        totalSaque = TotalSaque;
    }//fim do construtor Conta

    //determina se um PIN especificaqdo pelo usuário corresonde ao PIN em Conta
    public boolean validaPIN(int usuarioPIN)
    {
        if(usuarioPIN == pin)
            return true;
        else
            return false;
    }//fim do método validaPIN

    //retorna o saldo disponivel
    public double getSaqueDisponivel()
    {
        return saqueDisponivel;
    }//fim de getSaqueDisponivel

    //retorna o saldo total
    public double getTotalSaque()
    {
        return totalSaque;
    }//fim do método getTotalSaque

    //credita uma quantia a conta
    public void credito(double quantia)
    {
        totalSaque += quantia; //adiciona ao saldo total
    }//fim do método credito

    //debita uma quantia da conta
    public void debito(double quantia)
    {
        saqueDisponivel -= quantia; //subtrai o saldo disponivel
        totalSaque -= quantia; //subtrai o saldo total
    }//fim do método debito

    //retorna o numero da conta
    public int getContaNumero()
    {
        return contaNumero;
    }//fim do método getContaNumero
}//fim da classe Conta