package Cap14;

//Figura 14.6: LabelFrame.java
//Demonstrando a classe JLabel.

import javax.swing.JFrame;

public class LabelTest {

	public static void main(String[] args) {
		
		LabelFrame labelFrame = new LabelFrame(); // cria LabelFrame
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(260, 180); // configura o tamanho do frame
        labelFrame.setVisible(true); // exibe o frame
    } // fim de main 
} // fim da classe LabelTest
