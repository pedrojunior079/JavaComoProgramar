package Cap05;

//Figura 5.6: Juros.java --> traducao da classe em ingles Interest.java
//Caculo de juros compostos com for.
public class Juros 
{
    public static void main(String[] args)
    {
        double quantia; //quantia em deposito ao fim de cada ano
        double principal = 1000.0; //quantidade incial antes dos juros
        double taxa = 0.05; //taxa de juros

        //exibe cabeçalho
        System.out.printf("%s%20s \n", "Ano", "Valor em deposito");

        //calcula quantidade de deposito para cada um dos dez anos
        for(int ano = 1; ano <= 10; ano++)
        {
            //calcula nova quantidade durante ano especifico
            quantia = principal * Math.pow(1.0 + taxa, ano);

            //exibe o ano e a quantidade
            System.out.printf("%4d%,20.2f\n", ano, quantia);
        }//for final
    }//fim de main
}//fim da classe juros
