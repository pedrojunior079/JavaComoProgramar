//Figura 6.13: MetodoSobrecarga.java --> tradução do ingles MethodOverlord.java
//Declarações de métodos sobrecarregados

public class MetodoSobrecarga 
{
   //teste de método quadrado sobrecarregados
   public void testeMetodosSobrecarregados()
   {
        System.out.printf("Quadrado de inteiros 7 é %d\n", quadrado(7));
        System.out.printf("Quadrado de duplos 7.5 é %f\n", quadrado(7.5));
   }//fim do método testeMetodoSobrecarregados
   
   //métodos quadrados com argumentos int
   public int quadrado(int intValor)
   {
       System.out.printf("\nQuadrado chamado com argumento int: %d\n", intValor);
       return intValor * intValor;
   }//fim do método quadrado com argumentos int

   //método quadrado com aergumentos double
   public double quadrado(double doubleValor)
   {
       System.out.printf("\nQuadrado chamado com argumento double: %f\n", doubleValor);
       return doubleValor * doubleValor;
   }//fim do método quadrado com argumentos double
}//fim da classe MetodoSobrecarga
