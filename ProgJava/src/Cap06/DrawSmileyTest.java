package Cap06;

import java.awt.Component;

//Figura 6.17: DrawSmileyTeste.java
//Aplicativo de teste que exibe um rosto sorridente.
import javax.swing.JFrame;

public class DrawSmileyTest
{
    public static void main(String[] args)
    {
        DrawSmiley panel = new DrawSmiley();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230, 250);
        app.setVisible(true);
    }//fim de main
}//fim da classe DesenharSmiley
