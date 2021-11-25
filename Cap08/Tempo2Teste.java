//Figura 8.6: Tempo2Teste.java --tradução do ingles Time2Test.java
//construtores sobrecarregados utilizando para inicializar objetos Tempo2

public class Tempo2Teste
{
    public static void main(String[] args)
    {
        //cria e inicializa um objeto Tempo1
        Tempo2 t1 = new Tempo2(); //00:00:00
        Tempo2 t2 = new Tempo2(2); //02:00:00
        Tempo2 t3 = new Tempo2(21, 34); //21:34:00
        Tempo2 t4 = new Tempo2(12, 25, 42); //12:25:42
        Tempo2 t5 = new Tempo2(27, 74, 99); //00:00:00
        Tempo2 t6 = new Tempo2(t4); //12:25:42

        System.out.println("Construído com:");
        System.out.println("t1 todos os argumentos padrão");
        System.out.printf("   %s\n", t1.toUniversalString());
        System.out.printf("   %s\n", t1.toString());

        System.out.println("t2: hora especificada; minuto e segundo padrão");
        System.out.printf("   %s\n", t2.toUniversalString());
        System.out.printf("   %s\n", t2.toString());

        System.out.println("t3: hora e minuto especificada; segundo padrão");
        System.out.printf("   %s\n", t3.toUniversalString());
        System.out.printf("   %s\n", t3.toString());

        System.out.println("t4: hora, minuto e segundo espeficicada");
        System.out.printf("   %s\n", t4.toUniversalString());
        System.out.printf("   %s\n", t4.toString());

        System.out.println("t5: todos os valores inválidos especificados");
        System.out.printf("   %s\n", t5.toUniversalString());
        System.out.printf("   %s\n", t5.toString());

        System.out.println("t6: Tempo2 objeto t4 espeficificado");
        System.out.printf("   %s\n", t5.toUniversalString());
        System.out.printf("   %s\n", t5.toString());
    }//fim de main
}//fim da classe Tempo2Teste