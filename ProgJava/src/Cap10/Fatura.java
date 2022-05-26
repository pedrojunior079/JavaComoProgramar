package Cap10;

//Figura 10.12: Fatura.java --> tradução do ingles Invoice.java
//Classe Fatura que implementa A_Pagar.

public class Fatura  implements A_Pagar
{
    private String partNumero;
    private String partDescricao;
    private int quantidade;
    private double precoPorItem;

    //construtor com quatro argumentos
    public Fatura(String part, String descricao, int contador, double preco)
    {
        partNumero = part;
        partDescricao = descricao;
        setQuantidade(contador); //valida e armazena a quantidade
        setPrecoPorItem(preco); //valida e armazena o preço por item
    }//fim do construtor Fatura de quatro argumentos

    //configura número de peças
    public void setPartNumero(String part)
    {
        partNumero = part; //deve validar
    }//fim do método setPartNumero

    //obtém o numero da peça
    public String getPartNumero()
    {
        return partNumero;
    }//fim do método getPartNumero

    //configura a descrição
    public void setPartDescricao(String descricao)
    {
        partDescricao = descricao; //deve validar
    }//fim do método setPartDescricao

    //obtém a descrição
    public String getPartDescricao()
    {
        return partDescricao;
    }//fim do método getPartDescricao

    //configura a quantidade

    public void setQuantidade(int contador)
    {
        quantidade = (contador < 0) ? 0 : contador;  //a quantidade não pode ser negativa
    }//fim do método setQuantidade

    //obtém a quantidade
    public int getQuantidade()
    {
        return quantidade;
    }//fim do método getQuantidade

    //configura preço por item
    public void setPrecoPorItem(double preco)
    {
        precoPorItem = (preco < 0.0) ? 0.0 : preco; //valida preço
    }//fim de método setPrecoPorItem

    //obtém preço por item
    public double getPrecoPorItem()
    {
        return precoPorItem;
    }//fim do método getPrecoPorItem

    //retorno da representação de String doi objeto Fatura
    @Override
    public String toString()
    {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "fatura", "part numero", getPartNumero(), getPartDescricao(),
                "quantidade", getQuantidade(), "preço por item",  getPrecoPorItem());
    }//fim do método toString

    @Override
    public double getValorPagamento()
    {
        return getQuantidade() * getPrecoPorItem();  //calcula custo total
    }//fim do método getValorPagamento
}//fim da classe Fatura