//Figura 7.19: LivroDeNotas2Teste.java --> tradução do ingles GradeBookTest.java
//LivroDeNotas2Teste cria o objeto LivroDeNotas2 usando um array bidimensional
//das notas, emntão invoca o método GrausDeProcesso para analiza-las.

public class LivroDeNotas2Teste
{
    //método main inicia a execução de programa
    public static void main(String[] args)
    {
       //array bidimensional de notas de aluno
       int[][] notasArray = {{87, 96, 70},
                             {68, 87, 90},
                             {94, 100, 90},
                             {100, 81, 82},
                             {83, 65, 85},
                             {78, 87, 65},
                             {85, 75, 83},
                             {91, 94, 100},
                             {76, 72, 84},
                             {87, 93, 73}};

       LivroDeNotas2 meuLivroDeNotas2 = new LivroDeNotas2(
               "Java como Programar", notasArray);
       meuLivroDeNotas2.TelaMensagem();
       meuLivroDeNotas2.GrausDeProcesso();
    }//fim de main
}//fim da classe LivroDeNotas2Teste
