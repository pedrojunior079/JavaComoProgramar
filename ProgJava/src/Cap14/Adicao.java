package Cap14;

import javax.swing.JOptionPane;

//Figura 14.2: Adicao.java ---> tradu��o do ingles Addition.java
//Programa de adi��o que utiliza JOptionPane para entrada e saida

public class Adicao 
{
	public static void main(String[] args)
    {
        // obt�m a entrada de usu�rio a partir dos dialogos de entrda JOptionPane
        String primeiroNumero = JOptionPane.showInputDialog("Entre com primeiro inteiro");
        String segundoNumero = JOptionPane.showInputDialog("Entre com segundo inteiro");

        // converte String em valores int para utiliza��o em um calculo
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int soma = numero1 + numero2; // soma os n�meros

        // exibe o resultado em um dialogo de mensagem JOptionPane
        JOptionPane.showMessageDialog(null, "A Soma foi " +soma,
                "Soma de dois Inteiros", JOptionPane.PLAIN_MESSAGE);
    } //fim do m�todo main
} // fim da classe Adicao
