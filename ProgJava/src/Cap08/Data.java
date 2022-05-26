package Cap08;

//Figura 8.7: Data.java --> traducao do ingles Date.java
//Declaração da classe Data.

public class Data
{
    private int mes; //1-12
    private int dia; //1-31 conforme o mes
    private int ano; //qualquer ano

    //construtor: chama verificarMes para confirmar o valor adequado para mes;
    //chama verificaDia para confirmar o valor adequado para dia
    public Data(int o_mes, int o_dia, int o_ano)
    {
        mes = verificarMes(o_mes); //valida mes
        ano = o_ano; //poderia validar ano
        dia = verificarDia(o_dia); //valida dia

        System.out.printf("Construção de objeto de data para data %s\n", this);
    }//fim do construtor Data

    //método utilitario para confirmar o valor adequado de mes
    private int verificarMes(int testeMes)
    {
        if(testeMes > 0 && testeMes <= 12) //valida mes
           return testeMes;
        else //mes é invalido
        {
            System.out.printf("Mes invalido (%d) definido como 1.", testeMes);
            return 1; //mantém objeto em estado consistente
        }//fim de else
    }//fim do método verificarMes

    //método utilitario para confirmar o valor adequado de dia com base em mes e ano
    private int verificarDia(int testaDia)
    {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //verifica se dia está no intervalo para mes
        if(testaDia > 0 && testaDia <= diasPorMes[mes])
           return testaDia;

        //verifica ano bissexto
        if(mes == 2 && testaDia == 29 && (ano % 400 == 0 ||
                (ano % 4 == 0 && ano % 100 != 0)))
           return testaDia;

        System.out.printf("Dia invalido (%d) definido com 1.", testaDia);
        return 1; //mantém objeto em estado consistente
    }//fim do método verificarDia

    //retorna uma string no formato mes/dia/ano
    public String toString()
    {
        return String.format("%d/%d/%d", mes, dia, ano);
    }//fim do método toString
}//fim da classe Data

