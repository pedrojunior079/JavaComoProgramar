package Cap14;

import java.awt.FlowLayout;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

// Figura 14.9: TextFieldFrame.java
// Demonstrando a classe JTextField.

public class TextFieldFrame 
{
   private JTextField textField1; // campo de texto com tamanho configurado
   private JTextField textField2; // campo de texto construido com texto
   private JTextField textField3; // campo de texto construido com texto e tamanho
   private JPasswordField passwordField; // campo de senha com texto
   
   // construtor TextFieldFrame adicona JtexFields a JFrame
   public TextFieldFrame()
   {
	   super("Testando JTextField e JPassword");
	   setLayout( new FlowLayout()); // configura o layout de frame
	   
	   // constroi textfield com 10 colunas
	   textField1 = new JTexField(10);
	   add(textField1); //adiciona textField1 ao JFrame
	   
	   // constroi campo de texto com texto padrao
	   textField2 = new JTexField("Entre com texto aqui");
	   add(textField2); //adiciona textField2 ao JFrame
	   
	   // constroi textfield com 10 colunas
	   textField3 = new JTexField("");
	   add(textField3); //adiciona textField1 ao JFrame
   }
}
