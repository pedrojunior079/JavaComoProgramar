//BancoDeDados.java --tradulçao do ingles BankDataBase.java
//Repesenta o banco de dados com as informações sobre as contas bancarias

public class BancoDeDados
{
    private Conta[] contas; //array de Contas

    //construtor BancoDeDados sem argumentos inicializa as contas
    public BancoDeDados()
    {
        contas = new Conta[2] //apenas 2 contar para teste
        contas[0] = new Conta(12345, 541321, 1000.0, 1200.0);
        contas[1] = new Conta(98765, 56789, 200.0, 200.0);
    }//fim do construtor BancoDeDados sem argumentos

    //recupera o objeto Conta que contpem o número de conta especificada
    private Conta getConta(int contaNumero)
    {
        //faz um loop pelas contas procurando uma correspondencia com o número de conta
        for(Conta contaAtual : contas)
        {
            //retorna a conta atual se uma correspondencia for localizada
            if(contaAtual.getNumeroConta() == contaNumero)
                return contaAtual;
        }//for final

        return null;
    }//fim do método getConta

    //determina se némero da conta e PIN especificados pelo usuario correspondem
    // aqueles de uma conta no banco de dados
    public boolean autenticarUsuario(int usuarioContaNumero, int usuarioPIN)
    {
        //tenta recuperar a conta com o numero da conta
        Conta usuarioConta = getConta(usuarioContaNumero);

        //se a conta existir, retorna o resultado do método validaPIN de Conta
        if(usuarioConta != null)
            return usuarioConta.validadePIN(usuarioPIN);
        else
            return false; //número de conta não foi localizado, portanto retorna falso
    }//fim do método autenticarUsuario

    //retorna o saldo disponivel de Conta com o número da conta especifica
    public double getSaldoDisponivel(usuarioNumeroDaConta)
    {
        return getConta(usuarioNumeroDaConta).getSaldoDisponivel();
    }//fim do método getSaldoDisponivel

    //retorna o saldo total de conta com o número da conta especificado
    public double getSaldoTotal(int usuarioNumeroDaConta, double quantia)
    {
        return getConta(usuarioNumeroDaConta).getSaldoTotal();
    }//fim do método getSaldoTotal

    //credita uma quantia a Conta com o número da conta especifica
    public void credito(int usuarioNumeroConta, double quantia)
    {
        getConta(usuarioNumeroConta).credito(quantia);
    }//fim do método credito

    //debita uma quantia da Conta com o número da conta especificado
    public void debito(int usuarioNumeroConta, double quantia)
    {
        getConta(usuarioNumeroConta).debito(quantia);
    }//fim do método debito
}//fim da classe BancoDeDados