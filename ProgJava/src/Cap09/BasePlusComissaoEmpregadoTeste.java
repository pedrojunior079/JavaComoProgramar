package Cap09;

//Figura 9.7:BasePlusComissaoEmpregadoTeste.java --> tradução do ingles BasePlusComissionEmployeeTest.java
//Programa de teste da classe BasePlusComissaoEmpregado.
/*
 ./ComissaoFuncionario.java:92: error: '{' expected
    public class toString()
                         ^
./ComissaoFuncionario.java:94: error: illegal start of type
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
        ^
./ComissaoFuncionario.java:94: error: <identifier> expected
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                            ^
./ComissaoFuncionario.java:94: error: illegal start of type
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                             ^
./ComissaoFuncionario.java:94: error: cannot find symbol
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                     ^
  symbol:   class format
  location: class String
./ComissaoFuncionario.java:91: error: annotation type not applicable to this kind of declaration
    @Override //indica que este método sobrescreve um método de superclasse
    ^
6 errors
 */

public class BasePlusComissaoEmpregadoTeste
{
    public static void main(String[] args)
    {
        //instancia o objeto ComissaoFuncionario
        BasePlusComissaoEmpregado empregado = new BasePlusComissaoEmpregado(
                "Bob", "Lews", "333-33-3333", 50000, .04, 300);

        //obtém os dados de empregado comissionado
        System.out.println("Informações de funcionários obtidas por métodos get: \n");
        System.out.printf("%s %s\n", "Primeiro nome é", empregado.getPrimeiroNome());
        System.out.printf("%s %s\n", "Sobre nome é", empregado.getSobreNome());
        System.out.printf("%s %s\n", "Número do Seguro Social é", empregado.getNumeroDoSeguroSocial());
        System.out.printf("%s %.2f\n", "Vendas Brutas é", empregado.getVendasBrutas());
        System.out.printf("%s %.2f\n", "Taxa de Comissão é", empregado.getTaxaComissao());
        System.out.printf("%s %.2f\n", "Salario Base é", empregado.getSalarioBase());

        empregado.setSalarioBase(1000); //confogira o slario-base

        System.out.printf("\n%s:\n\n%s\n",
                "Informações atualizadas sobre funcionários obtidas por toString", empregado.toString());
    }//fim de main
}//fim da clase BasePlusComissaoEmṕregadoTeste