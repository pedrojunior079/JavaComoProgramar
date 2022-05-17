// ConsultaDeSaldo.java ---> tradução do ingles BalanceInquiry.java
// Representa uma Transação de consulta de saldos no ATM

public class ConsultaDeSaldo extends Transaction
{
    //Construtor de ConsultaDeSaldo
    public ConsultaDeSaldo(int usuarioContaNumero, Tela atmTela, BancoBaseDeDados atmBaseDeDados)
    {
        super(usuarioContaNumero, atmTela, atmBaseDeDados);
    } //fim do construtor de ConsultaDeSaldo

    //realiza a transção
    @Override
    public void execute()
    {
        // obtém as referencias ao banco de dados e tela do banco
        BancoBaseDeDados bancoBaseDeDados = getBancoBaseDeDados();
        Tela tela = getTela();

        // obtém o saldo disponivel da conta envolvida
        double saldoDisponivel  = bancoBaseDeDados.getSaldoDisponivel(getContaNumero());

        // obtém o saldo total da conta envolvida
        double saldoTotal =  bancoBaseDeDados.getSaldoTotal(getContaNumero());

        // exibe as informações sobre o saldo na tela
        tela.displayMessageLine("\nInformações de saldo:");
        tela.displayMessage(" - Saldo disponivel: ");
        tela.displayDollarAmount(saldoDisponivel);
        tela.displayMessage("\n - Saldo total:    ");
        tela.displayDollarAmount(saldoTotal);
        tela.displayMessageLine("");
    } //fim do método execute
} //fim da classe ConsultaDeSaldo


