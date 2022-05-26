package Cap04;

//versão classica do codigo GradeBookTest da 8a edição do livro Java Como Programar
//Figura 4.10: NotaLivro.java
//Cria o objeto da classe NotaLivro e invoca seu método determinaClasseMedia
public class NotaLivroTeste 
{
    public static void main(String[] args)
    {
        //cria o objeto minhaNotaLivro da classe NotaLivro e
        //passa o nome de cursor para o construtor
        NotaLivro minhaNotaLivro = new NotaLivro("Java Como Programar");
        minhaNotaLivro.telaMensagem(); //exibe a mensagem bem vindo
        minhaNotaLivro.determinaClasseMedia(); //calcula a mÃ©dia
    }//fim de main
}//fim da classe NotaLivroTeste
