package Cap04;

//Figura 4.8: ClasseMedia.java
//Resolvendo o problema da média da classe usando repetição controlada por contador
import java.util.Scanner; //programa utiliza a classe Scanner

public class ClasseMedia 
{
   public static void main(String[] args)
   {
      //cria um Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in);
      
      //fase de inicialização
      int total = 0; //inicializa a soma das notas inseridas pelo usuario
      int notaContador = 1; //iniicializa numero da nota a ser inserido pelo usuario

      //fase de processamento utiliza a soma das notas inseridas pelo usuario
      while(notaContador <= 10) //faz o loop 10 vezes
      {
         System.out.print("Entre nota: "); //prompt
         int nota = input.nextInt(); //insere a proxima nota
         total = total + nota; //adiciona nota a total
         notaContador = notaContador + 1; //incrementa o contador por + 1
      }

      //fase de término
      int media = total / 10; //divisão de inteiros produz um resultado inteiro

      //exibe o total e a média das notas
      System.out.printf("total de todas as 10 notas foi  %d%n", total);
      System.out.printf("Classe Media foi %d%n", media);
   }    
}//fim da classe ClasseMedia
