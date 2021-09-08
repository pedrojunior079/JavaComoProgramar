//Figura 3.5: Conta2.java
//Classe Conta que contém uma variavel de instancia nome
//e métodos para configurar e obter seu valor

public class Conta2 
{
    private String nome; //variavel de instancia
    
    //o construtor inicializa nome com nomr do parametro
    public Conta2(String nome) //o nome do construtor é o nome da classe
    {
       this.nome = nome; 
    }

    //método para configurar o nome
    public void setNome(String nome)
    {
        this.nome = nome; //armazena o nome
    }

    //método para recuperar o nome do objeto
    public String getNome()
    {
        return nome; //retorna valor do nome para o chamador
    }
}//fim da classe Conta2
