package Cap07;

//Figura 7.25: DesenharArcoIris.java --> tradução do ingles DrawRainbow.java
//Demonstra a utilização de cores em um array
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class DesenharArcoIris extends JPanel
{
    //define as cores indigo e violeta
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    //a utilização no arco-iris, indicando da parte mais interna
    //as duas entradas em branco resultam em um arco vazio no centro
    private Color[] colors = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
                              Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    //contrutor
    public DesenharArcoIris()
    {
        setBackground(Color.WHITE); //configura o fundo como branco
    }//fim do construtor DesenharArcoIris

    //desenhar um arco-iris utilizando arcos concentricos
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int raio = 20; //raio de um arco

        //desenha o arco-iris perto da parte central inferior
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        //desenha arcos preenchidos com o mais externo
        for(int contador = colors.length; contador > 0; contador--)
        {
            //configura a cor para o arco atual
            g.setColor(colors[contador - 1]);

            //preenche o arco de 0 a 180 graus
            g.fillArc(centerX - contador * raio,
                    centerY -contador * raio,
                        contador * raio * 2, contador * raio * 2, 0, 180);
        }//fim de for
    }//fim do método pointComponent
}//fim da classe DeseharArcoIrisDesenharArcoIris
