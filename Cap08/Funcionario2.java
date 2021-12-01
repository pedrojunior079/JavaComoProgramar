//Figura 8.12: Funcionario2.java --> tradução do ingles Employee.java
//Variavel estatica utilizando para manter uma contagem do número

public class Funcionario2
{
    private String primeiroNome;
    private String ultimoNome;
    private static int contador = 0; //o número de Funcionarios criados

    //construção para inicializar nome, data de nascimento e
    //data de contratação
    public Funcionario2(String primeiro, String ultimo)
    {
       primeiroNome = primeiro;
       ultimoNome = ultimo;

       ++contador; //incrementa contagem estatica de empregados
        System.out.printf("Funcionario construtor: %s %s contador = %d\n",
                primeiroNome, ultimoNome, contador);
    }//fim do construtor Funcionario

    //obtém o primeiro nome
    public String getPrimeiroNome()
    {
        return primeiroNome;
    }//fim do método getPrimeiroNome

    //obtém o ultimoNome
    public String getUltimoNome()
    {
        return ultimoNome;
    }//fim do método getUltimoNome

    //método estatico para obter valor de contagem estatica
    public static int getContador()
    {
        return contador;
    }//fim do método getContador
}//fim da classe Funcionario2