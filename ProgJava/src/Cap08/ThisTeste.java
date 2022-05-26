package Cap08;

//Figura 8.4: ThisTeste.java
//this utilizando implicita e explicitamente para referencia a
//membros de um objeto

public class ThisTeste
{
    public static void main(String[] args)
    {
       TempoSimples tempo = new TempoSimples(15, 30, 19);
        System.out.println(tempo.buildString());
    }//fim de main
}//fim da classe ThisTeste

//classe TempoSimples demonstra a referencia "this"
class TempoSimples
{
    private int hora; //0-23
    private int minuto; //0-59
    private int segundo; //0-59

    //se o construtor utilizar nomes de parametros identicos a
    //nomes de variaveis de instancia a referencia "this" será
    //exibir paar distinguir entre nomes
    public TempoSimples(int hora, int minuto, int segundo)
    {
        this.hora = hora; //configura a hora do objeto "this"
        this.minuto = minuto; //configura os minutos do objeto "this"
        this.segundo = segundo; //configura os segundos do objeto "this"
    }//fim do construtor TempoSimples

    //usa "this" explicito e implicito para chamar toUniversalString
    public String buildString()
    {
        return String.format("%24s: %s\n%24s: %s",
                "this.toUniversalString()",this.toUniversalString(),
                "toUniversalString()",toUniversalString());
    }//fim do método buildString

    //converte em string no formato de hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        //"this" não é requerido aqui para acessar variaveis de instancia,
        //porque o método não tem variaveis locais com os mesmo
        //nomes das variaveis de instancia
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }//fim do método toUniversalString
}//fim da classe TempoSimples