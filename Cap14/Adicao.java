// Figura 14.2: Adicao.java ---> tradução do ingles Addition.java
// Programa de adição que utiliza JOptionPane para entrada e saida
import javax.swing.JOptionPane; // programa utiliza JOptionPane

public class Adicao
{
    public static void main(string[] args)
    {
        // obtém a entrada de usuário a partir dos dialogos de entrda JOptionPane
        String primeiroNumero = JOptionPane.showInputDialog("Entre com primeiro inteiro");
        String segundoNumero = JOptionPane.showInputDialog("Entre com segundo inteiro");

        // converte String em valores int para utilização em um calculo
        int numero1 = Integer.parserInt(primeiroNumero);
        int numero2 = Integer.parserInt(segundoNumero);

        int soma = numero1 + numero2; // soma os números

        // exibe o resultado em um dialogo de mensagem JOptionPane
        JOptionPane.showMessageDialog(null, "A Soma é " +soma,
                "Soma de dois Inteiros", JOptionPane.PLAIN_MESSAGE);
    } //fim do método main
} //fim da classe Adicao
