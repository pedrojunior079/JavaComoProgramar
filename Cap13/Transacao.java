//13.4.8
//Transacao.java -->tradução em ingles Transaction.java
//A  superclasse abstrata Transação reprersenta uma transação no ATM

public abstract class Transacao
{
    private int numeroConta; //indica conta envolvida
    private Tela tela; //Tela do ATM
    private BancoDeDados bancoDeDados; //banco de dadados informado

    //Construtor de Transição pelas subclasses utilizadas
    public Transacao(int usuarioNumeroConta, Tela atmTela, BancoDeDados atmBancoDeDados)
    {
        numeroConta = usuarioNumeroConta;
        tela  = atmTela;
        bancoDeDados = atmBancoDeDados;
    }//fim do construtor de transação

    //retorna a referencia a tela
    public int getNumeroConta()
    {
        return numeroConta;
    }//fim do método getNumeroConta

    //retorna a referencia a tela
    public Tela getTela()
    {
        return tela;
    }//fim do método getTela

    //retorna a referencia ao banco de dados da instituição financeira
   public BancoDeDados getBancoDeDados()
   {
        return bancoDeDados;
    }//fim do método getBancoDeDados

    //realiza a transação (sobrescrita por cada subclasse)
    abstract public void execute();
}//fim da classe Transação