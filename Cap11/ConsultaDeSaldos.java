//ConsultaDeSaldo.java -->tradução em ingles BalanceInquirity
//Representa uma transação de consulta de saldosno ATM

public class ConsultaDeSaldos extends Transacao
{
    //Construtor de ConsultaDeDados
    public ConsultaDeDados(int usuarioContaNumero, Tela atmTela, BancoDeDados atmBancoDeDados)
    {
        super(usuarioContaNumero, atmTela, atmBancoDeDados);
    }//fim do construtor ConsultaDeDados

    //realiza a tranção
    @Override
    public void execute()
    {
        //obtém o saldo disponivel da conta envolvida
        BancoDeDados bancoDeDados = getBancoDeDados();
        Tela tela = getTela();

        //obtém o saldo disponivel da conta envolvida
        double saldoDisponivel = bancoDeDados.getSaldoDisponivel(getContaNumero);

        //obtém o saldo total da conta envolvida
        double totalBalanco = bancoDeDados.getTotalBalanco(getContaNumero);

        //exibe as informações sobre o saldo na tela
        tela.displayMessageLine("\nInformação Balanço:");
        tela.displayMessage("- Saldo disponível: ");
        tela.displayDollarAmount(saldoDisponivel);
        tela.displayMessage("\n - Balanço Total:     ");
        tela.displayDollarAmount(totalBalanco);
        tela.displayMessageLine("");
    }//fim do execute
}//fim da classe ConsultaDeDados