//Figura 5.26: FormasTeste.java --> tradução da classe ShapesTest.java
//Aplicativo de teste que exibe a classe Formas
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormasTeste
{ 
    public static void main(String[] args)
    {
        //obtém a escolha do usuário
        String input = JOptionPane.showInputDialog(
            "Digite 1 para formas retangulares\n" +
            "Digite 2 para formas ovais");

        int escolha = Integer.parseInt(input); //converte a entrada em int
        
        //cria o painel com a entrada do usuario
        Formas painel = new Formas(escolha);
        JFrame aplicacao = new JFrame(); //cria um novo JFrame
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel); //adiciona o painel ao frame
        aplicacao.setSize(300, 300); //configura o tamanho desejado
        aplicacao.setVisible(true); //mostra o frame
    }//fim de main
}//fim da classe FormasTeste
