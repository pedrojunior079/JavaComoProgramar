//Figura 4.18: DesenharPainel.java
//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenharPainel extends JPanel
{
    //desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g)
	{
		//chama paintComponent para assegurar que o painel é exibido coreretamente
		super.paintComponent(g);
		
		int width = getWidth(); //largura total
		int height = getHeight(); //altura total
		
		//desenha uma linha a partir do canto superior esquerdo até o inferiro direito
		g.drawLine(0, 0, width, height);
		
		//desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, height, width, 0);
	}
}//fim da classe DesenharPainel
