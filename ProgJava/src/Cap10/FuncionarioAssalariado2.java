package Cap10;

//Figura 10.14: FuncionarioAssalariado2.java --> tradução do ingles SalariedEmployee.java
//Classe FuncionarioAssalariado2 estende Funcionario que implementa A_Pagar.
//corrigir codigo
public class FuncionarioAssalariado2 extends Funcionario2
{
    private double salarioSemanal;

    //construtor com quatro argumentos
    public FuncionarioAssalariado2(String primeiroNome, String sobreNome, String nss, double salario)
    {
        super(primeiroNome, sobreNome, nss); //passa para o construtor Empregado
        salarioSemanal(salario); //valida e armazena o salario
    }//fim do construtor EmpregadoAssalariado com quatro argumentos

    //configutra o salario
    public void setSalarioSemanal(double salario)
    {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }//fim do método getSalarioSemanal

    //retorna o salario
    public double getSalarioSemanal()
    {
        return salarioSemanal;
    }//fim do método getSalarioSemanal

    //calcula vencimentos; implementa o método A_Pagar da
    //interface que era abstrata na siperficie Funcionario
    @Override
    public double getValorPagamento()
    {
        return getSalarioSemanal();
    }//fim do método getValorPagamento

    //retorna a representação String do objeto EmpregadoAssalariado2
    @Override
    public String toString()
    {
         return String.format("Assalariado Empregado: $s\n%s: $%,.2f",
                 super.toString(), "salario semanal", getSalarioSemanal());
    }//fim do metodo toString
}//fim da classe FuncionarioAssalariado2