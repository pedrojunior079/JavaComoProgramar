//Figura 5.9: LivroNotasEscolares.java --> tradução do ingles GradeBook.java
//A classe livroNotasEscolares utiliza a instrução switch para contar as letras das notas escolares.
import java.util.Scanner;


public class LivroNotasEscolares 
{
   private String nomeCurso; //nome do curso que esse LivroNotasEscolares representa
   //variaveis de instancia int são inicializadas em 0 por padrão
   private int total; //soma das notas
   private int notaContador; //numero de notas inseridas
   private int aContador; //contagem de notas A
   private int bContador; //contagem de notas B
   private int cContador; //contagem de notas C
   private int dContador; //contagem de notas D
   private int fContador; //contagem de notas F

   //construtor inicializa nomeCurso
   public LivroNotasEscolares(String nome)
   {
       nomeCurso = nome; //inicializa nomecurso
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

   //exibe uma mensagem de boas vindas para o usario LivroNotasEscolares
   public void telaMensagem()
   {
       //getNomeCurso obtem o nome do curso
       System.out.printf("Bem vindo ao livro notas escolares\n%s!\n\n", getNomeCurso());
   }//fim do método telaMensagem

   //insere número arbitrario de notas do usuário
   public void inputNotas()
   {
       Scanner input = new Scanner(System.in);
       int nota; //nota inserida pelo usuario

       System.out.printf( "%s\n%s\n  %s\n   %s\n",
       "Insira as notas inteiras no intervalo de 0-100.",
       "Digite o indicador de fim de vida para encerrar a entrada:",
       "No UNIX / LINUX / MAC OS X segure as teclas <Ctrl> d e pressione enter",
       "No windows segure a tecla <Ctrl> z e ṕressione enter");

       //faz loop até usuário inserir o indicador de fim do arquivo
       while(input.hasNext())
       {
           nota = input.nextInt(); //le a nota
           total += nota; //adiciona nota a total
           ++notaContador; //incrementa o número de notas

           //chama método para incrementar o contador adequado
           IncrementarNotaLetraContador(nota);
       }//fim do while
   }//fim do método inputNotas

   //adiciona i ao contador adequado da nota especificado
   private void IncrementarNotaLetraContador(int nota)
   {
       //determina a nota que foi inserida
       switch(nota / 10)
       {
           case 9:    //a nota estava entre 90
           case 10:  // e 100, inclusivo
              ++aContador; //incrementa aContador
              break; //sai do switch
              
           case 8:   //nota estava entre 80 e 89
              ++bContador; //incrementa bContador
              break; //sai do switch
              
           case 7: //nota estava entra 70 e 79
              ++cContador; //incrementa cContador
              break; //sai do switch
              
           case 6: //nota estava entre 60 e 69
              ++dContador; //incrementa dContador
              break; //sai do switch
              
           default: //a nota era monor que 60
              ++fContador; //incrementa fContador
              break; //opciona; saira do switch de qualquer jeito   
       }//fim do switch
   }//fim do método IncrementarNotaLetraContador

   //exibe um relatório baseado nas notas inseridas pelo usuário
   public void telaNotaRelatorio()
   {
       System.out.println("\nNota Relatorio:");

       //se usuário inseriu pelo menos uma nota...
       if(notaContador != 0)
       {
           //calcula a média de todas as notas inseridas
           double media = (double) total/notaContador;

           //gera a saida de resumo de resultados
           System.out.printf("O total das %d notas inseridas é %d\n", notaContador, total);
           System.out.printf("Classe média é %.2f\n", media);
           System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
           "Número de alunos que receberam cada nota:",
           "A: ", aContador, //exibe número de notas A
           "B: ", bContador, //exibe número de notas B 
           "C: ", cContador, //exibe número de notas C
           "D: ", dContador, //exibe número de notas D
           "F: ", fContador); //exibe número de notas F
       }//fim do if
       else
          System.out.println("Nenhuma nota foi inserida");
   }//fim do método telaNotaRelatorio
}//fim da classe LivroNotasEscolares
