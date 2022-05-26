package Cap08;

//Figura 8.13: Funcionario2Teste.java --> traducao do ingles EmployeeTest.java
//Demonstração do membro static.

public class Funcionario2Teste
{
    public static void main(String[] args)
    {
        //mostra que a contagem é 0 antes de criar Funcionarios
        System.out.printf("Funcionários antes da instanciação: %d\n",
                Funcionario2.getContador());

        //cria dois Funcionarios; a contagem deve ser 2
        Funcionario2 e1 = new Funcionario2("Susan", "Baker");
        Funcionario2 e2 = new Funcionario2("Bob", "Blue");

        //mostra que a contagem é 2 e depois de criar dois Funcionario
        System.out.println("\nFuncionarios depois da instanciação: ");
        System.out.printf("Via e1.getContador(): %d\n", e1.getContador());
        System.out.printf("Via e2.getContador(): %d\n", e2.getContador());
        System.out.printf("Via Funcionario.getContador(): %d\n", Funcionario2.getContador());

        //obtém nomes de Funcionarios
        System.out.printf("\nFuncionario 1: %s %s\nFuncionario 2: %s %s\n",
                e1.getPrimeiroNome(), e1.getUltimoNome(),
                e2.getPrimeiroNome(), e2.getUltimoNome());

        //nesse exemplo, ha somemnte uma referencia a cada Funcionario
        //portanto as duas instruções seguintes indicam que
        //esses objetos são elegiveis para a coleta de lixo
        e1 = null;
        e2 = null;
    }//fim de main
}//fim da classe FincionarioTeste