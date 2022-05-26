package Cap10;

//Figura 10.8: BasePlusComissaoFuncionario.java --> tradução do ingles BasePlusComissionEmployee.java
//Classe BasePluscomissaoFuncionario estende a ComissaoFuncionario.


public class BasePlusComissaoFuncionario extends ComissaoFuncionario
{
    private double salarioBase; //salario-base poer semana

    //construtor de seis argumentos
    public BasePlusComissaoFuncionario(String primeiro, String sobrenome, String nss, double vendas, double taxa, double salario)
    {
        //chamada explicita para o construtor ComissaoFuncionario da superclasse
        super(primeiro, sobrenome, nss, vendas, taxa);
        setSalarioBase(salario); //valida e armazena o salario-base
    }//fim do construtor BasePlusComissaoEmpregado2 de seis argumentos

    //configura o salario-base
    public void setSalarioBase(double salario)
    {
        salarioBase = (salario < 0.0) ? 0.0 : salario; //não negativo
    }//fim do método setSalarioBase

    //retorna o salario-base
    public double getSalarioBase()
    {
        return getSalarioBase();
    }//fim do metodo getSalarioBase

    //calcula os vencimentos; sobrescreve o método lucro em ComissaoFuncionario
    @Override
    public double lucros()
    {
        return getSalarioBase() + super.lucros();
    }//fim do metodo lucros

    //retorna a reprsentação String do objeto ComissaoFuncionario
    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "base assalariada", super.toString(),
                "salario base", getSalarioBase());
    }//fim do método toString
}//fim da classe BasePlusComissaoEmpregado2