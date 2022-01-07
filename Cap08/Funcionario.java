//Figura 8.8: Funcionario2.java --> tradução do ingles Employee.java
//Classe Funcionario com referencia a outros objetos

public class Funcionario
{
    private String primeiroNome;
    private String ultimoNome;
    private Data dataNascimento;
    private Data dataAdmissao;

    //construção para inicializar nome, data de nascimento e
    //data de contratação
    public Funcionario(String primeiro, String ultimo, Data dataDeNascimento, Data dataDeAdmissao)
    {
       primeiroNome = primeiro;
       ultimoNome = ultimo;
       dataNascimento = dataDeNascimento;
       dataAdmissao = dataDeAdmissao;
    }//fim do contrutor Funcionario

    //converte Funcionario em formato de String
    public String toString()
    {
        return String.format("%s, %s  Admissão: %s data de nascimento: %s",
                ultimoNome, primeiroNome, dataAdmissao, dataNascimento);
    }//fim do método toString
}//fim da classe Funcionario