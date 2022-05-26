package Cap09;

//Figura 9.5:ComissaoFuncionarioTeste.java --> tradução do ingles ComissionEmployeeTest.java
//Programa de teste da classe ComissaoFuncionario.
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

public class ComissaoFuncionarioTeste
{
    public static void main(String[] args)
    {
        //instancia o objeto ComissaoFuncionario
        ComissaoFuncionario funcionario = new ComissaoFuncionario(
                "Sue", "Jones", "222-22-2222", 10000, .06);

        //obtém os dados de empregado comissionado
        System.out.println("Informações de funcionários obtidas por métodos get: \n");
        System.out.printf("%s %s\n", "Primeiro nome é", funcionario.getPrimeiroNome());
        System.out.printf("%s %s\n", "Sobre nome é", funcionario.getSobreNome());
        System.out.printf("%s %s\n", "Número do Seguro Social é", funcionario.getNumeroDoSeguroSocial());
        System.out.printf("%s %.2f\n", "Vendas Brutas é", funcionario.getVendasBrutas());
        System.out.printf("%s %.2f\n", "Taxa de Comissão é", funcionario.getTaxaComissao());

        funcionario.setVendasBrutas(500); //configura vendas brutas
        funcionario.setTaxaComissao(.1); //configura a taxa de comissao

        System.out.printf("\n%s:\n\n%s\n",
                "Informações atualizadas sobre funcionários obtidas por toString", funcionario);
    }//fim de main
}//fim da clase ComissaoFuncionarioTeste