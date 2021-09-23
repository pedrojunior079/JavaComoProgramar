//Figura 5.10: LivroNotasEscolaresTeste.java --> tradução do ingles GradeBookTest.java
//Cria o objeto LivroNotasEscolares, insere notas e exibe relatorio de notas.


public class LivroNotasEscolaresTeste
{
   public static void main(String[] args) 
   {
      //cria o objeto meuLivroNotasEcolares classe LivroNotasEscolares e
      //passa o nome do cursor para o construtor
      LivroNotasEscolares meuLivroNotasEscolares = new LivroNotasEscolares(
          "Java Como Programar");
          
      meuLivroNotasEscolares.telaMensagem(); //exibe a mensagem bemvindo
      meuLivroNotasEscolares.inputNotas(); //le notas fornecidas pelo usuario
      meuLivroNotasEscolares.telaNotaRelatorio(); //exibe relatorio baseado em notas    
   }   
}
