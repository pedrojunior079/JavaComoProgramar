package Cap07;

//Figura 7.9: Card.java
//Classes CartaDeBaralho representa uma carta de baralho

public class Card 
{
    private String face; //face da carta ("Ã�s", "Duque", ...)
    private String naipe; //naipe da carta ("Copas", "Diamantes", ....)
    
    //construtor de dois argumentos inicializa face e naipe da carta 
    public Card(String cartaFace, String cartaNaipe)
    {
        face = cartaFace; //inicializa face da carta
        naipe = cartaNaipe; //inicializa naipe da carta
    }//fim do construtor carta de dois argumentos
    
    //retorna representaÃ§Ã£o String de Carta
    public String toString()
    {
        return face + " do " + naipe;
    }//fim do mÃ©todo toString
}//fim da classe Card
