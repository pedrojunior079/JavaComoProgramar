//Figura 8.11: EnumTeste.java
//testando o tipo enum Livro
import java.util.EnumSet;

public class EnumTeste
{
    public static void main(String[] args)
    {
        System.out.println("Todos os livros:\n");

        //imprime todos os livros em enum Livro
        for(Livro livro : Livro.values())
            System.out.printf("%-10s%-45s%s\n", livro,
                    livro.getTitulo(), livro.getCopyrightAno());

        System.out.println("\nExibir um intervalo de constantes enum:\n");

        //imprime os pirmeiros quadro livros
        for(Livro livro : EnumSet.range(Livro.PHPOO, Livro.APP))
            System.out.printf("%-10s%-45s%s\n", livro,
                    livro.getTitulo(), livro.getCopyrightAno());
    }//fim de main
}//fim da classe EnumTeste