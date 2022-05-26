package Cap10;

//Figura 10.4: Funcionarios.java
//SuperClasse abstrata Empregado.


public abstract class Funcionarios
{
    private String primeiroNome;
    private String sobreNome;
    private String numeroDoSeguroSocial;

    //construtor de cinco argumentos
    public Funcionarios(String primeiro, String sobrenome, String nss)
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
    }//fim do método getSobreNome

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
        return String.format("%s %s\nnumero do seguro social: %s ",
                getPrimeiroNome(), getSobreNome(), getNumeroDoSeguroSocial());
    }//fim do método toString

    //método abstract sobrescrito por subclasses concretas
    public abstract double lucros(); //nenhuma implementacao aqui
}//fim da classe abstract Empregados