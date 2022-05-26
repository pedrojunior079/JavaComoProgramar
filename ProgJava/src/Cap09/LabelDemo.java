package Cap09;

//Figura 9.10: LabelDemo.hava
//Demonstra o uso de rotulos
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo
{
    public static void main(String[] args)
    {
       //cria um rótulo com texto simples
       JLabel norteLabel = new JLabel("Norte");

       //cria um icone de uma imagem para podermos colcoar em um JLabel
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        //cria um rótulo com um Icon em vez de texto
        JLabel centroLabel = new JLabel(labelIcon);

        //cria outro rótulo com um Icon
        JLabel sulLabel = new JLabel(labelIcon);

        //configura o ŕotulo para exibir texto (bem como um icone)
        sulLabel.setText("Sul");

        //cria um frame para armazenar os rótulos
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adicona os rótulos ao frame; o segundo arguemnto especifica
        //onde adiciona o rótulo no frame
        app.add(norteLabel, BorderLayout.NORTH);
        app.add(centroLabel, BorderLayout.CENTER);
        app.add(sulLabel, BorderLayout.SOUTH);

        app.setSize(300, 300); //configura o tamanho do frame
        app.setVisible(true); //mostra o frame
    }//fim de main
}//fim da classew LabelDemo