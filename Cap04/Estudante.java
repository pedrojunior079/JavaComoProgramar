//Figura 4.4:Estudante.java
//classe Estudante que armazena o nome e a média de um aluno.

public class Estudante
{
    private String nome;
    private double media;

    //construtor inicializa variaveis de instancia
    public Estudante(String nome, double media)
    {
        this.nome = nome;

        //valida que a média é > 0.0 e <= 100.0; caso contrario,
        //armazena o valor padrão da média da variavel de instancia (0.0)
        if(media > 0.0)
           if(media <= 100.0)
              this.media = media;
    }

    //define o nome de Estudante
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    //recupera o nome de Estudante
    public String getNome()
    {
        return nome;
    }

    //define a média de Estudante
    public void setMedia(double estudanteMedia)
    {
        //valida que a média é > 0.0 e <= 100.0; caso contrario,
        //armazena o valor atual da média da variavel de instancia
        if(media > 0.0)
           if(media <= 100.0)
              this.media = media; //atribui a variavel de instancia 
    }

    //recupera a média de Estudante
    public double getMedia()
    {
        return media;
    }

    //determina e retorna a letra da nota de Estudante
    public String getLetraNota()
    {
        String letraNota = ""; //inicializa como uma string vazia

        if(media >= 90.0)
           letraNota = "A";
        else if(media >= 80.0)
           letraNota = "B";
        else if(media >= 70.0)
           letraNota = "C";
        else if(media >= 60.0)        
           letraNota = "D";
        else 
           letraNota = "F";

        return letraNota;   
    }
}//finaliza a classe Estudante