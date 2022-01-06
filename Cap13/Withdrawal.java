//A classe Withdrawal representa uma transação de saque no ATM
public class Withdrawal extends Transaction
{
    //atributos
    private int contaNumero; //conta a sacar fundos
    private double quantia; //quantia a sacar
    private Tela tela; //Tela do ATM
    private Teclado teclado; //Teclado do ATM
    private DispensadorCedulas dispensadorCedulas; //dispensador de cédulas
    private BancoDeDados bancoDeDados; //banco de dados de imnformações sobre a conta

    //contrutor sem argumentos
    public Withdrawal(int usuarioContaNumero, Tela atmTela, BancoDeDados atmBancoDeDados,
                      Teclado atmTeclado, DispensadorCedulas atmDispensadorCedulas)
    {
        Teclado = atmTeclado;
        dispensadorCedulas = atmDispensadorCedulas;
    }//fim do contrutor sem argumentos Withdrawal

    //método sobrescrevendo execute
    @Override
    public void execute()
    {
        boolean cedulasDispensadas = false; //cédulas ainda não foram  entregues
        double saldoDisponivel; //quantia disṕonivel para saque

        //obtém as referencias ao banco de dadose tela do banco
       BancoDeDados bancoDeDados = getBancoDeDados();
       Tela tela  = getTela();

       //faz um loop até as cédulas serem entregues ou o usurio cancelar
        do
        {
            //obtém o saldo disponivel na conta envolvida
            quantia = telaMenuDeQuantias();

            //verifica se o usuario escolheu uma quantia de saque ou cancelou
            if(quantia != CANCELED)
            {
                //obtém o saldo disponivel na conta envolvida
                saldoDisponivel = bancoDeDados.getSaldoDisponivel(getContaNumero());

                //veriftica se o usuario tem dinheiro suficiente na conta
                if(quantia <= saldoDisponivel)
                {
                    //verifica se o dispensador de cédulas tem cédulas suficientes
                    if(DispensadorCedulas.DinheiroInsificienteDisponivel(quantia))
                    {
                        bancoDeDados.debito(getContaNumero(), quantia);
                        dispensadorCedulas.dispensarCedulas(quantia);//entrega cédulas
                        dinheiroDispensado = true; //cédulas foram entregues

                        //instrui o usuario a pagar as cédulas
                        tela.displayMessageLine("\nSeu dinheiro foi" +
                                "dispensada. Por favor, pegue seu dinheiro agora.");
                    }//fim do if
                    else //o dispensador de cédulas não tem cédulas suficientes
                        tela.displayMessageLine("\nDinheiro insuficiente disponível no caixa eletrônico"+
                                "\n\nEscolha um valor menor.");
                }//fim do if
                else //não há dinheiro suficinete disponivel na  conta do usuario
                {
                    tela.displayMessageLine("\nCancelando transação ...");
                    return; //retorna ao menu principal porque o usuario cancelou
                }//fim de else
            }while(!dinheiroDispensado);
        }
   }//fim do método execute

    //exibe um menu de qauntia de saques e a opção para cançelar
    //retornar a quantia escolhida ou 0 se o usuário escolher cancelar
   private int telaMenuDeQuantias()
   {
       int usuarioEscolha = 0; //variavel local para armazenar o valor do retorno
       Tela tela = getTela(); //obtém referencia de tela

       //array de quantias que correspondem aos números no menu
       int[] quantias = {0, 20, 40, 60, 100, 200};

       //faz um loop enquanto nenhuma escolha válida for feita
       while(usuarioEscolha == 0)
       {
           //exibe o menu
           tela.displayMessageLine("\nMenu de Retirada:");
           tela.displayMessageLine("1 - $20");
           tela.displayMessageLine("2 - $40");
           tela.displayMessageLine("3 - $60");
           tela.displayMessageLine("4 - $100");
           tela.displayMessageLine("5 - $200");
           tela.displayMessageLine("6 - Cancelar Transação");
           tela.displayMessageLine("\nEscolha a Cancelar quantia:");

           int input = tela.getInput(); //obtém a entrada de usuario pelo teclado

           //determina como prosseguir com base no valor de entrada
           switch(input)
           {
               case 1: //se o usuario escolheu uma quantia de saque
               case 2: //(isto é, escolheu a opção 1, 2, 3, 4 ou 5),  retorna
               case 3: //quantia correspondente do array de quantias
               case 4:
               case 5:
                     usuarioEscolha = quantias[input];//salva a escolha  do usuario
                     break;
               case CANCELED: //o usuario escolheu cancelar
                     usuarioEscolha = CANCELED; //salva a escolha do  usuario
                     break;
               default: //o usuario não inseriu um valor entre  1 e 6
                     tela.displayMessageLine("\nSeleção Invalida. Tente novamente");
           }//fim do switch
       }//fim do while

       return usuarioEscolha; //retorna a quantia de sa que ou CANCELADA
   }//fim do método telaMenuDeQuantias
}//fim da classe Withdrawal