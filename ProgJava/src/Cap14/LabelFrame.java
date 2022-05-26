package Cap14;

//Figura 14.6: LabelFrame.java
//Demonstrando a classe JLabel.

import java.awt.FlowLayout; // especificada como os componentes são organizados
import javax.swing.JFrame;
import javax.swing.JLabel; // fornece receursos basicos de janela
import javax.swing.SwingConstants; // constantes comuns utilizando com Swing
import javax.swing.Icon; //interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens


public class LabelFrame extends JFrame
{
	/**
	 * Refazer este programa devido aos erros que esta dando na classe LabelFrame
	 * e LabelTest
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1; // JLabel apenas com texto
    private JLabel label2; // JLabel construido com texto e icone
    private JLabel label3; // JLabel com texto e icone adicionados

    // construtor LabelFrame adicona JLabels a JFrame
    public LabelFrame()
    {
        super("Testes JLabel");
        setLayout(new FlowLayout()); // configuração o layout de frame

        //Construtor JLabel com string.
        label1 = new JLabel("Label com texto");
        label1.setToolTipText("Isso e label1");
        add(label1); // adiciona o label1 ao JFrame

        // Icon e argumentos de alinhamentos
        Icon computer = new ImageIcon(getClass().getResource("computer.png"));
        label2 = new JLabel("Label com texto e icone", computer, SwingConstants.LEFT);
        label2.setToolTipText("Isso e label2");
        add(label2); // adiciona label2 ao JFrame

        label3 = new JLabel(); // construtor JLabel sem argumentos
        label3.setText("Label icone com texto e botao");
        label3.setIcon(computer); // adicona o icone ao JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Isso e label3");
        add(label3); // adiciona label3 ap JFrame
    } // fim do construtor LabelFrame
} //fim da classe LabelFrame
