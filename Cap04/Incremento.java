//Figura 4.15: increment.java
//Operadores de pré-cremento e de pós- incremento.
public class Incremento 
{
    public static void main(String[] args)
    {
        //demonstra o operador de pós-incremento
        int c = 5;
        System.out.printf("c antes do posincremento: %d%n", c); //imprime 5
        System.out.printf("   posincremento c: %d%n", c++); //imprime 5
        System.out.printf(" c depois do posincremento: %d%n", c); //imprime 6

        System.out.println(); //pula uma linha

        //demonstra o operador de pré-incremento
        c = 5;
        System.out.printf(" c antes do preincremento: %d%n", c); //imprime 5
        System.out.printf("    preincremento: %d%n", ++c); //imprime 6
        System.out.printf("  c depois do preincremento: %d%n", c); //imprime 6
    }
}//fim da classe Incremento
