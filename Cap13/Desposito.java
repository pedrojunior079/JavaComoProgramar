//Deposito.java --> traduçao em ingles Deposit.java
//Representa uma transação de deposito no ATM

public class Desposito extends Transaction
{
    private double quantia; //quantia a depositar
    private Teclado teclado; //referencia ao teclado numérico
    private AberturaDeposito aberturaDeposito; //referencia a abertura para deposito
    private final static CANCELED = 0; //constante para a opção de cançelamento

    //Construtor de Deposito
    public Deposito(int usuarioContaNumero, Tela atmTela, BancoDeDados atmBancoDeDados,
                    Teclado, atmTeclado, AberturaDeposito atmAberturaDeposito)
    {
        //inicializa as variaveis da superclasse
        super(usuarioContaNumero, atmTela, atmBancoDeDados);

        //inicializa as referencias a teclado e abertura para deposito
        Teclado = atmTeclado;
        aberturaDeposito = atmAberturaDeposito;
    }//fim do construtor de Deposito

    //realiza a transação
    @Override
    public void execute()
    {
        BancoDeDados bancoDeDados = getBancoDeDados(); //obtém a referencia
        Tela tela = getTela(); //obtém a referencia

        quantia = solicitarValorDeposito(); //obtém a quantia de deposito do usuário

        //verifica se usuário inseriu uma quantia de depósito ou cancelamento
        if(quantia != CANCELED)
        {
            //solicita o evelope de deposito conteudo a quantia especificada
            tela.displayMessage("\nPor favor, insira um envelope de depósito contendo ");
            tela.displayDollarAmount(quantia);
            tela.displayMessageLine(".");

            //recebe o envelope de deposito
            boolean recebeEnvelope =  aberturaDeposito.isEnvelopeReceived();

            //verifica se envelope de deposito foi recebido
            if(recebeEnvelope)
            {
                tela.displayMessage("\nSeu envelope foi  "+
                        "recebido. \nNota: O dinheiro que acabou de ser depositado não será "+
                        "estar disponível até verificarmos a quantidade de qualquer "+
                        "dinheiro incluído e seus cheques compensados.");

                //credita na conta para refletir o deposito
                bancoDeDados.credito(getContaNumero(), quantia);
            }//fim do if
            else //envelope de deposito não foi recebido
            {
                tela.displayMessageLine("\nVocê não inseriu um "+
                        "envelope, então o caixa eletrônico cancelou sua transação.");
            }//fim do else
        }//fim do if
        else //o usuario cancelou em vez de inserir uma quantia
        {
            tela.displayMessageLine("\nTransação Cancelada...");
        }//fim de else
    }//fim do método execute

    //solicita queo o usuário insira uma quantia de deposito em centavos
    private double solicitarValorDeposito()
    {
        Tela tela = getTela(); //obtém referencia a tela

        //exibe a solicitação
        tela.displayMessage("\nPor favor, insira um valor de depósito em "+
                "CENTS (ou 0 para cancelar): ");
        int input = teclado.getInput(); //recebe a entrada da quantia do deposito

        //verifica se o usuário cencelou ou inseiriu uma quantiua valida
        if(input == CANCELED)
            return CANCELED;
        else
        {
            return(double) input / 100; //retorna a quantia em dolares
        }//fim de else
    }//fim do método solicitaValorDeposito
 }//fim da classe deposito



