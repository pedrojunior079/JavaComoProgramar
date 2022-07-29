package Cap09;

//Figura 9.8: BasePlusComissaoEmpregado2.java --> traducao do ingles BasePlusComissionEmployee.java
//membros private da superclasse nao podendo ser acessado em uma subclasse.


public class BasePlusComissaoEmpregado2 extends ComissaoFuncionario
{
    private double salarioBase; //salario-base poer semana

    //construtor de seis argumentos
    public BasePlusComissaoEmpregado2(String primeiro, String sobrenome, String nss, double vendas, double taxa, double salario)
    {
        //chamada explicita para o construtor ComissaoFuncionario da superclasse
        super(primeiro, sobrenome, nss, vendas, taxa);

        setSalarioBase(salario); //valida e armazena o salario-base
    }//fim do construtor BasePlusComissaoEmpregado2 de seis argumentos

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
    @Override //indica que este método sobrescreve um método de superclasse
    public double lucros()
    {
        //não permitindo taxaComissao e vendasBrutas private em superclasse
        return salarioBase + (taxaComissao * vendasBrutas);
    }//fim do método lucros

    //retorna a reprsentação String do objeto ComissaoFuncionario
    @Override //indica que este método sobrescreve um método de superclasse
    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f ",
                "funcionario da comissão de salario base", primeiroNome, sobreNome,
                "Numero do Seguro Social", numeroDoSeguroSocial,
                "Vendas Brutas", vendasBrutas,
                "Taxa Comissão", taxaComissao,
                "Salario Base", salarioBase);
    }//fim do método toString
}//fim da classe BasePlusComissaoEmpregado2