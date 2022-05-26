package Cap10;

//Figura 10.9 SistemaDeFolhaDePagamentoTeste.java --> tradução do ingles PayrollSystemTest.java
//Programa de teste de hierarquia Funcionarios.
//corrigir codigo

public class SistemaDeFolhaDePagamentoTeste
{
    public static void main(String[] args)
    {
         //cria objetos de sbuclasse
        FuncionarioAssalariado  funcionarioAssalariado = new FuncionarioAssalariado("Joao", "Paulo", "111-11-1111", 800.00);
        FuncionarioHorario  funcionarioHorario = new FuncionarioHorario("Ana", "Carolina", "222-22-2222", 16.75, 40);
        ComissaoFuncionario comissaoFuncionario = new ComissaoFuncionario("Maria", "Aparecida", "333-33-3333", 100000, .06);
        BasePlusComissaoFuncionario basePlusComissaoFuncionario = new BasePlusComissaoFuncionario("Andre", "Luiz", "444-44-4444");

        System.out.println("Funcionarios processados individualmente:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", funcionarioAssalariado, "ganhou", FuncionarioAssalariado.lucros());
        System.out.printf("%s\n%s: $%,.2f\n\n", funcionarioHorario, "ganhou", FuncionarioHorario.lucros());
        System.out.printf("%s\n%s: $%,.2f\n\n", comissaoFuncionario, "ganhou", ComissaoFuncionario.lucros());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusComissaoFuncionario, "ganhou", BasePlusComissaoFuuncionario.lucro());

        //cria um array Funcionario de quadro elementos
        Funcionario[] funcionarios = new Funcionario[4];

        //inicializa o array com Funcionarios
        funcionarios[0] = funcionarioAssalariado;
        funcionarios[1] = funcionarioHorario;
        funcionarios[2] = comissaoFuncionario;
        funcionarios[3] = basePlusComissaoFuncionario;

        System.out.println("Funcionários processados polimorficamente:\n");

        //processa genericamente cada elemento no Funcionarios
        for(Funcionario funcionarioAtual : funcionarios)
        {
            System.out.println(funcionarioAtual); //invoca toString
            //determina se elemento é uma BasePlusComissaoFuncionario
            if(funcionarioAtual instanceof BasePlusComissaoFuncionario)
            {
                //downcast da referencia de Funcionario para
                //referencia a BasePlusComissaoFuncionario
                BasePusComissaoFuncionario funcionario = (BasePluscomissaoFuncionario) funcionarioAtual;

                funcionario.setSalarioBase(1.10 * funcionario.getSalarioBase());

                System.out.printf("Novo salario base com 100% de aumento é: $%,.2f\n",
                        funcionario.getSalarioBase());
            }//fim do if

            System.out.printf("lucros $,.2f\n\n", funcionarioAtual.lucros());
        }//for final

        //obtém o nome do tipo de cada objeto no array funcionarios
        for(int j = 0; j < funcionarios.length; j++)
            System.out.printf("Funcionario %d é a %s\n", j, funcionarios[j].getClass().getNome());
    }//fim de main
}//fim da classe SistemaDeFolhaDePagamentoTeste

