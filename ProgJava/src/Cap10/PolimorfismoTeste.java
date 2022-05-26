package Cap10;

//Figura 10.1: PolimorfismoTeste.java -->tradução do ingles PolymorphismTest.java
//Atribiuto referencias de superclasse ew subclasse a
//varioaveis de sperclasse e de subclasse

public class PolimorfismoTeste
{
    public static void main(String[] args)
    {
        //atribui uma referencia de superclasse a variavel de superclasse
        ComissaoEmpregado comissaoEmpregado = new ComissaoEmpregado("Sue", "Jones", "222-22-2222", 10000, .06);

        //atribui uma referencia de subclasse a variavel de subclasse
        BasePlusComissaoEmpregados basePlusComissaoEmpregados = new BasePlusComissaoEmpregados(
                "Bob", "Lews", "333-33-3333", 50000, .04, 300);

        //invoca toString no objeto de superClasse utilizando a variavel da suṕerClasse
        System.out.printf("%s %s:\n\n%s\n\n",
                "Chame os Funcionários da Comissão para a String com referência de superclasse ",
                "ao objeto da superclasse", comissaoEmpregado.toString());

        //invoca toString no objeto de superClasse utilizando a variavel da suṕerClasse
        System.out.printf("%s %s:\n\n%s\n\n",
                "Chame os Funcionários da Comissão BasePlus para a String com a subclasse ",
                "referência a objeto de subclasse", BasePlusComissaoEmpregado.toString());

        //invoca toString no objeto de superClasse utilizando a variavel da suṕerClasse
        ComissaoEmpregado ComissaoEmpregado2 = basePlusComissaoEmpregados;
        System.out.printf("%s %s:\n\n%s\n\n",
                "Chame os Funcionários da Comissão BasePlus para a String com a subclasse ",
                "referência a objeto de subclasse", BasePlusComissaoEmpregado2.toString());
    }//fim de main
}//fim de classe PolimorfismoTeste