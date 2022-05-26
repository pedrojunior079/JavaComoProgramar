package Cap08;

//Figura 8.23: TesteDesenhar.java
//Criando um JFrame para exibir um DesenharPainel
import javax.swing.JFrame;

public class TesteDesenhar
{
    public static void main(String[] args)
    {
       DesenharPainel painel = new DesenharPainel();
       JFrame aplicacao = new JFrame();
       aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       aplicacao.add(painel);
       aplicacao.setSize(300, 300);
       aplicacao.setVisible(true);
    }//fim de main
}//fim da classe TesteDesenhar