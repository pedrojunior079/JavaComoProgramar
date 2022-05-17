//Figura 8.22: DesenharPainel.java
//Programa que ytiliza a classe MinhaLinha
//para desenhar linhas aleatorias
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DesenharPainel extends JPanel
{
    private Random numerosRandomicos = new Random();
    private MinhaLinha[] linhas; //array de linhas

    //contrutor, cria um painel com formas aleatorias
    public DesenharPainel()
    {
        setBackground(Color.WHITE);

        linhas = new MinhaLinha[5 + numerosRandomicos.nextInt(5)];

        //cria linhas
        for(int contador = 0; contador < linhas.length; contador++)
        {
            //gera coordenadas aleatórias
            int x1 = numerosRandomicos.nextInt(300);
            int y1 = numerosRandomicos.nextInt(300);
            int x2 = numerosRandomicos.nextInt(300);
            int y2 = numerosRandomicos.nextInt(300);

            //gera uma cor aleatória
            Color color = new Color(numerosRandomicos.nextInt(256),
                    numerosRandomicos.nextInt(256), numerosRandomicos.nextInt(256));

            //adiciona a linha a lista de linhas
            linhas[contador] = new MinhaLinha(x1, y1, x2, y2, color);
        }//for final
    }//fim do construtor DesenharPainel

    //para cada array da forma, desenha as formas individuais
    public void ComponentePintura(Graphics g)
    {
        super.paintComponent(g);

        //desenha as linhas
        for(MinhaLinha linha : linhas)
            linha.desenhar(g);
    }//fim do método paintComponent
}//fim da classe DesenharPainel