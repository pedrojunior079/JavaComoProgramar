//Figura 10.7: ComissaoFuncionario.java --> tradução da classe ingles Commissionemployee.java
//Classe ComissaoFuncionario extende Funcionarios.


public class ComissaoFuncionario extends Funcionarios
{
    private double vendasBrutas; //vendas brutas semanais
    private double taxaComissao; //porcentagem da comissão

    //construtor de cinco argumentos
    public ComissaoFuncionario(String primeiro, String sobrenome, String nss, double vendas, double taxa)
    {
        super(primeiro, sobrenome, nss);
        setVendasBrutas(vendas);
    }//fim do construtor ComissaoFuncionario de cinco argumentos

    //configura a taxa de comissão
    public void setTaxaComissao(double taxa)
    {
        taxaComissao = (taxa > 0.0 && taxa < 1.0) ? taxa : 0.0;
    }//fim do método setTexaComissao

    //retorna a taxa de comissão
    public double getTaxaComissao()
    {
        return taxaComissao;
    }//fim do método getTaxaComissao

    //configura a quantidade de vendas brutas
    public void setVendasBrutas(double vendas)
    {
        vendasBrutas = (vendas < 0.0) ? 0.0 : vendas;
    }//fim do método setVendasBrutas

    //retorna a quantidade de vendas brutas
    public double getVendasBrutas()
    {
        return vendasBrutas;
    }//fim do método getVendasBrutas

    //calcula os rendimentos: sobrescreve o método licro em Funcionarios
    public double lucros()
    {
        return taxaComissao * vendasBrutas;
    }//fim do método lucros

    //retorna a reprsentação String do objeto ComissaoFuncionario
    @Override //indica que este método sobrescreve um método de superclasse
    public class toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Comissão Funcionario", primeiroNome, sobreNome,
                "Numero do Seguro Social", numeroDoSeguroSocial,
                "Vendas Brutas", vendasBrutas,
                "Taxa Comissão", taxaComissao);
    }//fim do método toString
}//fim da classe ComissaoFuncionario