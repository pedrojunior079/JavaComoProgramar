//versão classica do codigo GradeBook da 8a edição do livro Java Como Programar
//Figura 4.9: NotaLivro.java
//Classe NotaLivro que resolve o programa da média da classe
//utilizando repetição controlada por sentinela.
import java.util.Scanner; //programa utiliza a classe Scanner

public class NotaLivro 
{
   private String nomeCurso; //nome do curso que essa NotaLivro representa
   
   //construtor inicializa nomeCurso
   public NotaLivro(String nome)
   {
       nomeCurso = nome; //inicializa nomeCurso
   }//fim do construtor

   //método para configurar o nome do curso
   public void setNomeCurso(String nome)
   {
       nomeCurso = nome; //armazena o nome do curso
   }//fim do método setNomeCurso

   //método para recuperar o nome do curso
   public String getNomeCurso()
   {
       return nomeCurso;
   }//fim do método getNomeCurso

   //exibe uma mensagem de boas-vindas para o usuário NotaLivro
   public void telaMensagem()
   {
       //getNomeCurso obtém o nome do curso
       System.out.printf("Bem vindo ao NotaLivro\n%s!\n\n", getNomeCurso());
   }//fim do método telaMensagem
   
   //determina a média de um número arbitrário de notas 
   public void determinaClasseMedia()
   {
       //cria Scanner para obter entrada da janela de comando
       Scanner input = new Scanner(System.in);
       
       int total; //soma das notas
       int notaContador; //número de notas inseridas
       int nota; //valor da nota
       double media; //numero com pontos de fração decimal para a média

       //fase de inicialização
       total = 0; //inicializa o total
       notaContador = 0; //inicializa o contador de loops

       //fase de processamento
       //solicita entrada e le a nota do usuário
       System.out.print("Entre com a nota ou -1 para sair: ");
       nota = input.nextInt();
       
       //faz um loop até ler o valor de sentinela inserido pelo usuário
       while(nota != -1)
       {
           total = total + nota; //adiciona nota a total
           notaContador = notaContador + 1; //incrementa contador
       }//fim do while

       //fase do término
       //se o usuário inseriu pelo menos uma nota...
       if(notaContador != 0)
       {
           //calcula a media de todas as notas inseridas 
           media = (double) total / notaContador;

           //exibe o total e a média (com 2 digitos de precisão)
           System.out.printf("\nTotal de %d notas inseridas foi %d\n", notaContador, total);
           System.out.printf("Classe media foi  %.2f\n", media);
       }//fim do if
       else //nenhuma nota foi inserida, então gera mensagem apropriada
          System.out.println("Nenhuma nota foi inserida");
    }//fim do método determinaClasseMedia
}//fim da classe NotaLivro
