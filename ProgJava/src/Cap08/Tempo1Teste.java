package Cap08;

//Figura 8.2: Tempo1Teste.java --traducao do ingles Time1Test.java
//objeto Tempo1 utilizando em um aplicativo

public class Tempo1Teste
{
    public static void main(String[] args)
    {
       //cria e inicializa um objeto Tempo1
       Tempo1 tempo = new Tempo1(); //invoce o construtor Tempo1

       //gera saida de representações de strings da hora
       System.out.print("O tempo universal inicial é: ");
       System.out.println(tempo.toUniversalString());
       System.out.print("A hora padrão inicial é: ");
       System.out.println(tempo.toString());
       System.out.println(); //gera saida de uma linha em branco

       //altera a hora e gera saída da hora atualizada
       tempo.setTempo(13, 27, 6);
       System.out.print("A hora universal após setTempo é: ");
       System.out.println(tempo.toUniversalString());
       System.out.print("A hora padrão após setTempo é: ");
       System.out.println(tempo.toString());
       System.out.println(); //gera saida de uma lista em branco

       //configura a hora com valores inválidos; gera saída da hora atualizada
       tempo.setTempo(99, 99, 99);
       System.out.println("Depois de tentar configurações inválidas:");
       System.out.print("Tempo Universal: ");
       System.out.println(tempo.toUniversalString());
       System.out.print("Tempo Padrão: ");
       System.out.println(tempo.toString());
    }//fim de main
}//fim da classe Tempo1Teste