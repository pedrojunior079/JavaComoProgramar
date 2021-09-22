//Figura 4.19: DesenharPainelTeste.java
//Criando JFrame para exibir um DrawPanel
import javax.swing.JFrame;

public class DesenharPainelTeste
{
	public static void main(String[] args)
	{
		//cria um ṕainel que contem nosso desenho
		
		//cria um painel que contém nosso desenho
		DesenharPainel painel = new DesenharPainel();
			
		//cria um novo quadro para armazenar o painel
		JFrame aplicacao = new JFrame();
			
		//configura o frame para ser encerrado quando ele é fechado
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);//adiciona o painel ao frame
		aplicacao.setVisible(true);//torna o frame visivel
	}
}//fim da classe DesenharPainelTeste