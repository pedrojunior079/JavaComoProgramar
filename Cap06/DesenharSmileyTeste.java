//Figura 6.17: DesenharSmileyTeste.java --> tradução do ingles DrawSmileyTeste.java
//Aplicativo de teste que exibe um rosto sorridente.
import javax.swing.JFrame;

public class DesenharSmileyTeste 
{
    public static void main(String[] args)
    {
        DesenharSmiley panel = new DesenharSmiley();
        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(panel);
        aplicacao.setSize(230, 250);
        aplicacao.setVisible(true);
    }//fim de main
}//fim da classe DesenharSmiley
