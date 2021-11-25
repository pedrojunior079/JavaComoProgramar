//Figura 8.3: AcessoMembroTeste.java --> tradução do ingles MemberAccessTest.java
//Membros privados da classe Tempo1 não são acessiveis.

public class AcessoMembroTeste
{
    public static void main(String[] args)
    {
       Tempo1 tempo = Tempo1(); //cria e inicializa o objeto Tempo1

       tempo.hora = 7; //erro: hora tem aceso privado em Tempo1
       tempo.minuto = 15; //erro: minuto tem acesso privado em Tempo1
       tempo.segundo = 30; //erro: segundo te acesso privado em Tempo1
    }//fim de amin
}//fim da classe AcessoMembroTeste