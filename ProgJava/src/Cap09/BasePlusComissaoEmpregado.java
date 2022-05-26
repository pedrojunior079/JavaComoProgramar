package Cap09;

//Figura 9.6: BasePlusComissaoEmpregado.java --> traducao do ingles BasePlusComissionEmployee.java
//Classe BasePlusComissaoEmpregado representa um empregado
//que recebe um salario-base alem da comissão.

public class BasePlusComissaoEmpregado
{
    private String primeiroNome;
    private String sobreNome;
    private String numeroDoSeguroSocial;
    private double vendasBrutas; //vendas brutas semanais
    private double taxaComissao; //porcentagem da comissão
    private double salarioBase; //salario-base poer semana

    //construtor de cinco argumentos
    public BasePlusComissaoEmpregado(String primeiro, String sobrenome, String nss, double vendas, double taxa, double salario)
    {
        //chamada implica para o construtor Object ocorrer aqui
        primeiroNome = primeiro;
        sobreNome = sobrenome;
        numeroDoSeguroSocial = nss;
        setVendasBrutas(vendas); //valida e armazena as vendas brutas
        setTaxaComissao(taxa); //valida e armazena a taxa de comissão
    }//fim do construtor ComissaoFuncionario de cinco argumentos

    //onfogura o nome
    public void setPrimeiroNome(String primeiro)
    {
        primeiroNome = primeiro; //deve validar
    }//fim do método setPrimeiroNome

    //retorna o primeiro nome
    public String getPrimeiroNome()
    {
        return primeiroNome;
    }//fim do método getPrimeiroNome

    //configura o sobrenome
    public void setSobreNome(String sobrenome)
    {
        sobreNome = sobrenome; //deve validar
    }//fim do método setSobreNome

    //retorna o sobreNome
    public String getSobreNome()
    {
        return sobreNome;
    }//fim do método getSobreNome

    //configura o CIC
    public void setNumeroDoSeguroSocial(String nss)
    {
       numeroDoSeguroSocial = nss;
    }//fim do método getNumeroDoSeguroSocial

    //retorna o CIC
    public String getNumeroDoSeguroSocial()
    {
        return numeroDoSeguroSocial;
    }//fim do método getNumeroSeguroSocial

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

    //configura o salario-base


    public void setSalarioBase(double salario)
    {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }//fim do método setSalarioBase

    //retorna o salario-base
    public double getSalarioBase()
    {
        return getSalarioBase();
    }//fim do método getSalarioBase

    //calcula os lucros
    public double lucros()
    {
        return salarioBase + (taxaComissao * vendasBrutas);
    }//fim do método lucros

    //retorna a reprsentação String do objeto ComissaoFuncionario
    @Override //indica que este método sobrescreve um método de superclasse
    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f ",
                "Comissão Funcionario", primeiroNome, sobreNome,
                "Numero do Seguro Social", numeroDoSeguroSocial,
                "Vendas Brutas", vendasBrutas,
                "Taxa Comissão", taxaComissao,
                "Salario Base", salarioBase);
    }//fim do método toString
}//fim da classe BasePlusComissaoEmpregado