//Figura 8.15: Incremento.java --> tradução do ingles Increment.java
//Variavel de instancia final em uma classe.

public class Incremento
{
    private int total = 0; //total de todos os incrementos
    private final int INCREMENT; //variavel constante(não inicializada)

    //construtor inicializa variavel de instancia final INCREMENT
    public Incremento(int incrementoValor)
    {
        INCREMENT = incrementoValor; //inicializa variavel constante (uma vez)
    }//fim do construtor Incremento

    //adiciona INCREMENT ao total
    public void addIncrementoTotal()
    {
        total += INCREMENT;
    }//fim do método addIncrementoTotal

    //retorna representação de String dos dados de um objeto Incremento
    public String toString()
    {
        return String.format("total = %d", total);
    }//fim di método toString
}//fim da classe Incremento