//Figura8.5: Tempo2.java --tradução do ingles Time2.java
//Declaração de classe Tempo1 mantém a hora no formato de 24 horas

public class Tempo2
{
    private int hora; //0 - 23
    private int minuto; //0 -59
    private int segundo; //0 - 59

    //construtor sem argumento Time2: inicializa cada variavel de instancia
    //com zero; assegura que objetos Tempo2 iniciam em um estado consistente
    public Tempo2()
    {
        this(0, 0, 0) //invoca o construtor Tempo2 com tres argumentos
    }//fim do construtor sem argumento Tempo2

    //Construtor Tempo2: hora fornecido, minuto e segundo padronizados como 0
    public Tempo2(int h)
    {
        this(h, 0, 0); //invoca o construtor Tempo2 com tres argumemtos
    }//fim do construtor de um argumento Tempo2

    //Construtor Tempo2: hora e minuto fornecidos, segundo padronizados como 0
    public Tempo2(int h, int m)
    {
        this(h, m, 0); //invoca o construtor Tempo2 com tres argumentos
    }//fim do construtor dde dos argumentos Tempo2

    //Construtor Tempo2: hora, minuto e segundo fornecidos
    public Tempo2(int h, int m, int s)
    {
        setTempo(h, m, s); //invoca setTempo2 para validar a hora
    }//fim do construtor de tres argumentos Tempo2

    //Construtor Tempo2: outro objeto Tempo2 fornecido
    public Tempo2(Tempo2 tempo)
    {
        //invoca o construtor de tres argumentos Tempo2
        this(tempo.getHora(), tempo.getMinuto(), tempo.getSegundo());
    }//fim do construtor Tempo2 com um arguymento de objeto Tempo2

    //Métodos set
    //configura um novo valor de hora usando o formato universal;
    //assegura que os dados permaneçam consistentes configurando
    //valores invalidos como zero
    public void setTempo(int h, int m, int s)
    {
        setHora(h); //configura hora
        setMinuto(m); //configura minuto
        setSegundo(s); //configura segundo
    }//fim do método setTempo

    //valida e configura a hora
    public void setHora(int h)
    {
        hora((h >= 0 && m < 60) ? m : 0);
    }//fim do método setHora

    public void setMinuto(int m)
    {
        minuto = ((m >= 0 && m < 60) ? m : 0);
    }//fim do método setMinuto

    public void setSegundo(int s)
    {
        segundo = ((s >= 0 && s < 60) ? s : 0);
    }//fim de método setSegundo

    //Métodos get
    //obtém valor da hora
    public int getHora()
    {
        return hora;
    }//fim do método getHora

    //obtém valor dos minutos
    public int getMinuto()
    {
        return minuto;
    }//fim do método getMinuto

    //obtém valor dos segundos
    public int getSegundo()
    {
        return segundo;
    }//fim do método getSegundo

    //converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }//fim do método do toUniversalString

    //converte em String no formato padrão hora (H:MM:SS AM ou PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }//fim do método ToString
}//fim da classe Tempo1