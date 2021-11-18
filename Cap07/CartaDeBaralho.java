//Figura 7.9: CartaDeBaralho.java --> tradução do ingles Card.java
//Classes CartaDeBaralho representa uma carta de baralho

public class CartaDeBaralho 
{
    private String face; //face da carta ("Ás", "Duque", ...)
    private String naipe; //naipe da carta ("Copas", "Diamantes", ....)
    
    //construtor de dois argumentos inicializa face e naipe da carta 
    public CartaDeBaralho(String cartaFace, String cartaNaipe)
    {
        face = cartaFace; //inicializa face da carta
        naipe = cartaNaipe; //inicializa naipe da carta
    }//fim do construtor carta de dois argumentos
    
    //retorna representação String de Carta
    public String toString()
    {
        return face + " do " + naipe;
    }//fim do método toString
}//fim da classe Card
