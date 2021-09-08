//Figura 3.8: Conta3.java
//Classe Conta com uma variavel de instancia saldo do tipo double e um construtor
//e método deposito que executa a validação

public class Conta3 
{
    private String nome; //variavel de instancia
    private double saldo; //variavel de instancia
    
    //Construtor de Conta que recebe dois parametros
    public Conta3(String nome, double saldo) 
    {
       this.nome = nome; //atribui nome a variavel de instancia nome

       //valida que o saldo é maior que 0.0; se não for,
       //a variavel de instancia saldo mantem seu valor inicial padrão de 0.0
       if(saldo > 0.0) //se o saldo for válido
         this.saldo = saldo; //atribui a variavel de instancia saldo
    }

    //método que deposita (adiciona) apenasd uma quantia válida no saldo
    public void deposito(double valorDeposito)
    {
        if(valorDeposito > 0.0) //se valorDeposito for valido
           saldo = saldo + valorDeposito; //adiciona ao saldo
    }

    //método retorna o saldo da conta
    public double getSaldo()
    {
        return saldo;
    }

    //método que define o nome
    public void setNome(String nome)
    {
        this.nome = nome; 
    }

    //método para recuperar o nome do objeto
    public String getNome()
    {
        return nome; //retorna valor do nome para o chamador
    }//fim do método getNome
}//fim da classe Conta2
