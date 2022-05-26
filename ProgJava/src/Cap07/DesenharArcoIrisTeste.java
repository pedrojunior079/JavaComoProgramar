package Cap07;

//Figura 7.26: DesenharArcoIrisTeste.java
//Aplicativo de teste para exibir um arco-iris.
import javax.swing.JFrame;

public class DesenharArcoIrisTeste
{
    public static void main(String[] args)
    {
       DesenharArcoIris panel = new DesenharArcoIris();
       JFrame aplicacao = new JFrame();
       aplicacao.add(panel);
       aplicacao.setSize(400, 250);
       aplicacao.setVisible(true);
    }//fim de main
}//fim da classe DesenharArcoIrisTeste
