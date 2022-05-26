package Cap10;

//Figura 10.13: Funcionario2.java
//SuperClasse abstrata Funcionario implementa A_Pagar.
//corrigir codigo

public abstract class Funcionario2 implements A_Pagar
{
    private String primeiroNome;
    private String sobreNome;
    private String numeroDoSeguroSocial;

    //construtor de cinco argumentos
    public Funcionario2(String primeiro, String sobrenome, String nss)
    {
        //chamada implica para o construtor Object ocorrer aqui
        primeiroNome = primeiro;
        sobreNome = sobrenome;
        numeroDoSeguroSocial = nss;
    }//fim do construtor ComissaoFuncionario de cinco argumentos

    //onfogura o nome
    public void setPrimeiroNome(String primeiro)
    {
        primeiroNome = primeiro; //deve validar
    }//fim do método setPrimeiroNome

    //retorna o primeiro nome
    public String getPrimeiroNome()
    {
        return primeiroNome;
    }//fim do método getPrimeiroNome

    //configura o sobrenome
    public void setSobreNome(String sobrenome)
    {
        sobreNome = sobrenome; //deve validar
    }//fim do método setSobreNome

    //retorna o sobreNome
    public String getSobreNome()
    {
        return sobreNome;
    }//fim do metodo getSobreNome

    //configura o CIC
    public void setNumeroDoSeguroSocial(String nss)
    {
       numeroDoSeguroSocial = nss;
    }//fim do método getNumeroDoSeguroSocial

    //retorna o CIC
    public String getNumeroDoSeguroSocial()
    {
        return numeroDoSeguroSocial;
    }//fim do método getNumeroSeguroSocial


    //retorna a reprsentação String do objeto ComissaoFuncionario
    @Override //indica que este método sobrescreve um método de superclasse
    public String toString()
    {
        return String.format("%s %s\n numero do seguro social: %s ",
                getPrimeiroNome(), getSobreNome(), getNumeroDoSeguroSocial());
    }//fim do método toString

    //Nota: não implementamos o metodo A_Pagar
    //classe eve ser declarada abstrada para evitar um erro
    //de compilacao.
}//fim da classe abstract Funcionario2