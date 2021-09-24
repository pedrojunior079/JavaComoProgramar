//Figura 5.28: Formas.java --> tradução ingles de Shapes.java
//Demonstra o desenho de diferentes formas. 
import java.awt.Graphics;
import javax.swing.JPanel;


public class Formas extends JPanel
{
    private int escolha; //escolha do usuário de qual forma desenhar

    //construtor configura a esolha do usupario
    public Formas(int escolhaUsuario)
    {
        escolha = escolhaUsuario;
    }//fim do construtor Formas

    //desenha uma cascata de formas que iniciam do canto superior esquerdo
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       for(int i = 0; i < 10; i++)
       {
           //seleciona a forma com base na escolha do usuário
           switch(escolha)
           {
               case 1: //desenha retangulos
                  g.drawRect(10 + i * 10, 10 + i * 10,
                       50 + i * 10, 50 + i * 10);
                  break;
               case 2: //desenha elipse
                  g.drawOval(10 + i * 10, 10 + i * 10,
                       50 + i * 10, 50 + i * 10);
                  break;             
           }//fim do switch
       }//fim do for
    }//fim do método paintComponent
}//fim da classe Formas
