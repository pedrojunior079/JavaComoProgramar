package Cap08;

//Figura 8.9: FuncionarioTeste.java --> traducao do ingles EmployeeTest.java
//Demonstracao de composicao

public class FuncionarioTeste
{
    public static void main(String[] args)
    {
       Data nascimento = new Data(7, 24, 1949);
       Data admissao = new Data(3, 12, 1988);
       Funcionario funcionario = new Funcionario("Bob", "Blue", nascimento, admissao);
       System.out.println(funcionario);
    }//fim de main
}//fim da classe FincionarioTeste