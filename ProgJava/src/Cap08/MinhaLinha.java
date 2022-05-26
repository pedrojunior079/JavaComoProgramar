package Cap08;

//Figura 8.21: MinhaLinha.java -->traducao do ingles MyLine.java
//Declaração da classe MinhaLinha
import java.awt.Color;
import java.awt.Graphics;

public class MinhaLinha
{
    private int x1; //coordena x da 1a. extremidade.
    private int y1; //coordena y da 1a. extremidade.
    private int x2; //coordena x da 2a. extremidade.
    private int y2; //coordena y da 2a. extremidade.
    private Color minhaCor; //cor dessa forma

    //construtor com valores de entrada
    public MinhaLinha(int x1, int y1, int x2, int y2, Color color)
    {
        this.x1 = x1; //configura a coordenada x da 1a. extremidade
        this.y1 = y1; //configura a coordenada y da 1a. extremidade
        this.x2 = x2; //configura a coordenada x da 2a. extremidade
        this.y2 = y2; //configura a coordenada y da 2a. extremidade
        minhaCor = color; //configura a cor
    }//fim do construtor MinhaLinha

    //Desenha a linha na cor especificada
    public void desenhar(Graphics g)
    {
        g.setColor(minhaCor);
        g.drawLine(x1, y1, x2, y2);
    }//fim do metodo draw
}//fim da classe MinhaLinha
