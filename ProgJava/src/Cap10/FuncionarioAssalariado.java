package Cap10;

//Figura 10.5: FuncionarioAssalariado.java --> traducao do ingles SalariedEmployee.java
//A classe concreta EmpregadoAssalariado estende a classe Empregado abstract.

public class FuncionarioAssalariado extends Funcionarios
{
    private double salarioSemanal;

    //construtor com quatro argumentos
    public FuncionarioAssalariado(String primeiroNome, String sobreNome, String nss, double salario)
    {
        super(primeiroNome, sobreNome, nss); //passa para o construtor Empregado
        salarioSemanal(salario); //valida e armazena o salario
    }//fim do construtor EmpregadoAssalariado com quatro argumentos

    //configutra o salario
    public void setSalarioSemanal(double salario)
    {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }//fim do metodo getSalarioSemanal

    //retorna o salario
    public double getSalarioSemanal()
    {
        return salarioSemanal;
    }//fim do metodo getSalarioSemanal

    //calclula os rendimentos; sobrescreve o método lucros em Empregados
    @Override
    public double lucros()
    {
          return getSalarioSemanal();
    }//fim do método getSalarioSemanal

    //retorna a representaãpo String do objeto EmpregadoAssalariado
    @Override
    public String toString()
    {
         return String.format("Assalariado Empregado: $s\n%s: $%,.2f",
                 super.toString(), "salario semanal", getSalarioSemanal());
    }//fim do metodo toString
}//fim da classe FuncionarioAssalariado