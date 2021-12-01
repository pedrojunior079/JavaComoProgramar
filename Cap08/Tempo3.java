//Figura8.18: Tempo3.java --tradução do ingles Time3.java
//Declaração de classe Tempo3 mantém a hora no formato de 24 horas
package com.deitel.jcp.cap08;

public class Tempo3
{
    private int hora; //0 - 23
    private int minuto; //0 -59
    private int segundo; //0 - 59

    //configura um novo valor de hora usando formato universal;
    //assegura que os dados permaneçam consistentes configurando valores invalidos como zero
    public void setTempo(int h, int m, int s)
    {
        hora = ((h >= 0 && h < 24) ? h : 0); //valida hora
        minuto = ((m >= 0 && m < 60) ? m : 0); //valida minutos
        segundo = ((s >= 0 && s < 60) ? s : 0); //valida segundos
    }//fim do método setTempo

    //converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }//fim do método do toUniversalString

    //converte em String no formato padrão hora (H:MM:SS AM ou PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                 minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }//fim do método ToString
}//fim da classe Tempo1

