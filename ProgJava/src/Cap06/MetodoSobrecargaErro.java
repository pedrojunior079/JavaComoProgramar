package Cap06;

//Figura 6.15: MetodoSobrecargaErro.java --> traducao do ingles MethodOverlordError.java
//Métodos sobrecarregados com assinaturas identicas

public class MetodoSobrecargaErro 
{
   //declaração do método quadrado com argumento int
   public int quadrado(int x)
   {
       return x * x;
   }

   //segundo declaração do método quadrado com argumento int resulta
   //em erros de compilação mesmo que os tipos de retorno sejam diferentes
   public double quadrado(int y)
   {
       
       return y * y;
   }
}//fim da classe MetodoSobrecargaErro
