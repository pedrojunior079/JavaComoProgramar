package Cap10;

//Figura 10.15: A_PagarInterfaceTeste.java -->
//Testa a interface A_Pagar.
//corrigir codigo

public class A_PagarInterfaceTeste
{
    public static void main(String[] args)
    {
        //cria array A_Pagar de quatro elementos
        A_Pagar[] apagarObjetos = new A_Pagar[4];

        //preenche o array com objetos que implementam A_Pagar
        apagarObjetos[0] = new Fatura("01234", "assento", 2, 375.00);
        apagarObjetos[1] = new Fatura("56789", "tire", 4, 79.95);
        apagarObjetos[2] =
                new FuncionarioAssalariado2("João", "Paulo", "111-11-1111", 800.00);
        apagarObjetos[3] =
                new  FuncionarioAssalariado2("Maria", "Laura", "888-88-8888", 1200.00);

        System.out.println("Faturas e funcionários processados polimorficamente: \\ n");

        //processa gnericamente cada elemento e o pagamento apropriado
        for(A_Pagar atualPagar : apagarObjetos)
        {
            //gera saída de atualPagar e o pagamento apropriado
            System.out.printf("%s  \n%s:  $%,.2f\n\n", atualPagar.toString(),
                    "pagamento devido", atualPagar.getValorPagamento());
        }//for final
    }//fim de main
}//fim da classe A_PagarInterfaceTeste