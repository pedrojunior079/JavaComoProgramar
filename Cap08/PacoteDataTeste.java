//Figura 8.20: PacoteDataTeste.java
//Membros de acesso de pacote de uma classe permanecem
//qacessiveis a outras classes no mesmo pacote

public class PacoteDataTeste
{
    public static void main(String[] args)
    {
        PacoteData pacoteData = new PacoteData();

        //gera saida da representação String de pacoteData
        System.out.printf("Após a instanciação:\n%s\n", pacoteData);

        //muda os dados de acesso de pacote no objeto pacoteData
        pacoteData.numero = 77;
        pacoteData.string = "Adeus";

        //gera saída da representação String de pacoteData
        System.out.printf("\nApós alterar os valores:\n%s\n", pacoteData);
    }//fim de main
}//fim da classe PacoteDataTeste

class PacoteData
{
    int numero; //variavel de instancia de acesso de pacote
    String string; //variavel de instancia de de acesso de pacote

    //construtor
    public PacoteData()
    {
        numero = 0;
        string = "Ola";
    }//fim do contrutor PacoteData

    //retorna a representação String do objeto PacoteData
    public String toString()
    {
        return String.format("numero: %d; string: %s", numero, string);
    }//fim do metodp toString
}//fim da classe PacoteData

