//ATM.java
//Representa um caixa eletronico
public class ATM
{
    private boolean usuarioAutenticado; //se usuário foi autenticado
    private int numeroAtualDaConta; //número atual da conta
    private Tela tela; //Tela do ATM
    private Teclado teclado; //Teclado do ATM
    private DispensadorCedulas dispensadorCedulas; //dispensador de cédulas
    private AbeturaDeposito abeturaDeposito; //abertura para deposito do ATM
    private BancoDeDados bancoDeDados; //banco de dados de imnformações sobre a conta

    //constantes que corresponde as principais opções de menus
    private static  final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;

    //construtor sem argumentos de ATM inicializa as variaveis  de instancia
    public ATM()
    {
        usuarioAutenticado = false; //usuária não foi autenticado
        numeroAtualDaConta = 0; //nenhum número atual de conta para iniciar
        tela = new Tela(); //cria a tela
        teclado = new Teclado(); //cria o teclado
        dispensadorCedulas = new DispensadorCedulas(); //cria o dispensador de cedulas
        abeturaDeposito = new AberturaDeposito(); //cria a abetura para deposito
        bancoDeDados = new BancoDeDados(); //cria o banco de dados com as informações sobre as contas
     }//fim do contrutor ATM sem argumentos

    //inicia o ATM
    public void run()
    {
        //dá boas-vindas e autentica o usuario: realiza transações
        while(true)
        {
            //faz um loop enquanto o usuario ainda não está autenticado
            while(usuarioAutenticado)
            {
                tela.displayMessageLine("\nBemvindo!");
                autenticaUsuario(); //autentica o usuário
            }//fim do while
        }//fim do método while
   }//fim do método run

    //tenta autenticar o usuario contra o banco de dados
    private void autenticaUsuario()
    {
        tela.displayMessage("Por favor entre com o numero da conta: ");
        int numeroConta = teclado.getInput(); //insere o número da conta
        tela.displayMessage("\nEntre com o PIN: "); //solicita o PIN
        int pin = teclado.getInput(); //insere o PIN

        //configura usuarioAutendicado como um valor booleano retornado pelo banco de dados
        usuarioAutenticado = bancoDeDados.usuarioAutenticado(numeroConta, pin);

        //verifica se a autenticação foi bem-sucedida
        if(usuarioAutenticado)
        {
            numeroAtualDaConta = numeroConta; //salva a conta do usuario #
        }//fim do if
        else
            tela.display.MessageLine("Numero da conta invalida ou PIN. Por favor tente novamente.");
    }//fim do método autenticaUsuario

    //exibe o menu principal e realiza transações
    private void performTransactions()
    {
        //variavel local para armazenar a transação atualmente processada
        Transaction atualTransacao = null;
        boolean ususarioExited = false; //usuário optou por não sair

        //faz um loop enquanto o usuário nçao escolhe a opção para sair do sistema
        while(!ususarioExited)
        {
            //mostra o menu principal e obtém a seleção de usuário
            int mainMenuSelecao = telaMainMenu();

            //decide como prosseguir com bse na seleção de menu feita pelo usuário
            switch (mainMenuSelecao)
            {
                //o usuário optou por realizar um entre tres  tipos de transações
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:

                    //inicializa como o novo objeto do tipo escolhido
                    atualTransacao = createTransaction(mainMenuSelecao);
                    atualTransacao.execute(); //execcuta a transação
                    break;
                case EXIT: //usuario optou por terminar a sessão
                    tela.displayMessageLine("\nSair do sistema...");
                    ususarioExited = true; //essa sessão de ATM deve terminar
                    break;
                default: //usuário não inseriu um inteiro de 1 a 4
                    tela.displayMessageLine("\nVoce não entrou com a seleção valida.  Tente novamente");
                    break;
            }//fim do switch
        }//fim do while
    }//fim do método performTransactions

    //exibe o menu principal e retorna uma seleção de entrada
    private int telaMainMenu()
    {
        tela.displayMessageLine("\nMenu principal");
        tela.displayMessageLine("1 - Visualizar meu saldo");
        tela.displayMessageLine("2 - Contando cedulas");
        tela.displayMessageLine("3 - Deposito");
        tela.displayMessageLine("4 - Sair\n");
        tela.displayMessageLine("Escolha a opção: ");
        return teclado.getInput(); //retorna a seleção do usuario
    }//fim do método telaMainMenu

    //retorna o objeto da subclasse de Transaction especificada
    private Transaction createTransaction(int tipo)
    {
        Transaction tempo = null; //varaivell Transaction temporaria

        //determina qual tipo de Transaction criar
        switch(tipo)
        {
            case BALANCE_INQUIRY: //cria uma nova transação BalanceInquiry
                 tempo = new BalanceInquiry(numeroAtualDaConta, tela, bancoDeDados);
                 break;
            case WITHDRAWAL: //cria uma nova transação Withdrawal
                  tempo = new Withdrawal(numeroAtualDaConta, tela, bancoDeDados, teclado, dispensadorCedulas);
                  break;
        }//fim do switch

        return tempo; //retorna o objeto recém-criado
    }//fim do método createTransaction
}//fim da classe ATM