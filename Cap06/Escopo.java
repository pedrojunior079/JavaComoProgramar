//Figura 6.11: Escopo.java ---> tradução da classe Scope.java
//A classe Escopo demonstra os escopos de campo e de variavel local

public class Escopo 
{
    //campo acessível para todos os métodos dessa classe
    private int x = 1;

    //método begin cria e inicializa a variável local x
    //e chama os métodos userLocalVariable e useField
    public void iniciar()
    {
        int x = 5; //variavel local x do método sombreia o campo x

        System.out.printf("local x do método iniciar é %d\n", x);

        useLocalVariavel(); //useLocalVariable tem uma variavel local x
        use_O_Campo(); //useField utiliza o campo x da classe Escopo
        useLocalVariavel(); //useLocalVariable reinicializa a variavel local x
        use_O_Campo(); //campo x da classe Escopo retém seu valor

        System.out.printf("\nlocal x do método iniciar é %d\n", x);
    }//fim do método iniciar

    //cria e inicializa a variavel local x durante cada chamada
    public void useLocalVariavel()
    {
        int x = 25; //inicializa toda vez que useLocalVariavel e chamado

        System.out.printf("\nlocal x ao entrar no método useLocalVariavel é %d\n", x);
        ++x; //modifica a variavel local x desse método
        System.out.printf("local x antes de sair do método é %d\n", x);
    }//fim do método useLocalVariavel

    //modifica o campo x da classe Escopo durante cada chamada
    public void use_O_Campo()
    {
        System.out.printf("O campo x ao entrar no método use_O_Campo é %d\n", x);
        x *= 10; //modifica o campo da classe Escopo
        System.out.printf("O campo x antes ao entrar no método use_O_Campo é %d\n", x);
    }//fim do método use_O_Campo
}//fim da classe Escopo
