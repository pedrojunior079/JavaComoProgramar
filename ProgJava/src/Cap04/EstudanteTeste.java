package Cap04;

//Figura 4.5: EstudanteTeste.java
//Cria e testa objetos Estudante

public class EstudanteTeste 
{
   public static void main(String[] args)
   {
       Estudante conta1 = new Estudante("Carlos", 93.5);
       Estudante conta2 = new Estudante("Andre Luiz", 72.75);

       System.out.printf("%s's letra nota foi: %s%n",
            conta1.getNome(),conta1.getLetraNota());
       System.out.printf("%s's letra nota foi: %s%n",
            conta2.getNome(),conta2.getLetraNota());     
   }    
}//fim da classe EstudanteTeste
