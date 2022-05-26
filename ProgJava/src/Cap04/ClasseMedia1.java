package Cap04;

//Figura 4.10: ClasseMedia1.java
//Resolvendo o problema da média da classe usando repeti��o controlada por sentinela
import java.util.Scanner; //programa utiliza a classe Scanner

public class ClasseMedia1 
{
   public static void main(String[] args)
   {
      //cria um Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in);
      
      //fase de inicialização
      int total = 0; //inicializa a soma das notas inseridas pelo usuario
      int notaContador = 0; //iniicializa numero de notas a ser inseridas até agora

      //fase de processamento 
      System.out.print("Entre nota ou - 1 para sair: "); 
      int nota = input.nextInt(); 
         
      //faz um loop até ler o valor de sentinela inserido pelo usuario
      while(nota != -1)
      {
         total = total + nota; //adiciona nota a total
         notaContador = notaContador + 1; //incrementa o contador por + 1
            
         //solicita entrada e le a proxima nota fornecida pelo usuario
         System.out.print("Entre nota ou - 1 para sair: "); 
         nota = input.nextInt(); 
      }
      
      //fase de término
      //se usuário inseriu pelo menos uma nota...
      if(notaContador != 0)
      {
         double media = (double) total/notaContador;
         //exibe o total e a média das notas
         System.out.printf("total de todas as 10 notas foi  %d%n", notaContador, total);
         System.out.printf("Classe Media foi %.2f%n", media);
      }
      else
         System.out.println("Nenhuma nota foi inserida");
   }    
}//fim da classe ClasseMedia1
