package Cap03;

//Figura 3.13:NomeDialogo.java
//Obtendo a entrada de usuário a partir de um dialogo
import javax.swing.JOptionPane;

public class NomeDialogo
{
   public static void main(String[] args)
   {
     //pede para o usuario inserir seu nome
     String nome = JOptionPane.showInputDialog("Qual seu nome?");
     
     //cria a mensagem
     String mensagem = String.format("Bemvindo, %s, a programacao java!", nome);
     
     //exibe a mensagem para cumprimentar o usuario pelo nome
     JOptionPane.showMessageDialog(null, mensagem);   
   }//fim de main
}//fim da classe Dialogo 