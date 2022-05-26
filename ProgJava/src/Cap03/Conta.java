package Cap03;

//Figura 3.1: Conta.java
//Classe Conta que contém uma variavel de instancia nome
//e métodos para configurar e obter seu valor

public class Conta 
{
    private String nome; //variavel de instancia 

    //método para definir o nome no objeto
    public void setNome(String nome)
    {
        this.nome = nome; //armazena o nome
    }

    //método para recuperar o nome do objeto
    public String getNome()
    {
        return nome; //retorna valor do nome para o chamador
    }
}//fim da classe Conta
