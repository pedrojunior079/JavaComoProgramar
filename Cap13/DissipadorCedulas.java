//DissipadorCedulas.java --> tradução do ingles CashDispenser.java
//Representa o dissipador de cédulas do ATM

public class DissipadorCedulas
{
    //o número inicial padrão de cédulas no dissipador de cédulas
    private final static int INITIAL_COUNT = 500;
    private int contador; //número de cedulas de U$$ 20 remanescentes

    //construtor sem argumentos DissipadorCedulas iniciliza o contador para padrão
    public DissipadorCedulas()
    {
        contador = INITIAL_COUNT; //configura atributo contador
    }//fim do construtor DissipadorCedulas

    //simila a entrega da quantia especificada de cedulas
    public void dispensaCedulas(int quantia)
    {
        int cedulasRequeridas = quantia / 20; //número de cédulas de USS 20 requerido
        contador -= cedulasRequeridas; //atualiza a contagem das cedulas
    }//fim do método dispensaCedulas

    //indica se o dissipador de cédulas pode entregar a quantida desejada
    public boolean insuficienteCedulasDisponiveis(int quantia)
    {
        int cedulasRequeridas = quantia / 20; //número de cédulas de USS20 requerido

        if(contador >= cedulasRequeridas)
            return true; //há cédulas suficientes disponiveis
        else
            return false; //não há cédulas suficientes disponiveis
    }//fim do método insuficienteCedulasAvaliadas
}//fim da classe DissipadorCedulas


