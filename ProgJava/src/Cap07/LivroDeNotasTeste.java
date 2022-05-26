package Cap07;

//Figura 7.15: LivroDeNotasTeste.java
//LivroDeNotasTeste cria um objeto LivroDeNotas utilizando um array de notas,
//então invoca o metodo GrausDeProcesso para analiasa-las.

public class LivroDeNotasTeste
{
    //metodo main inicia a execucao de programa
    public static void main(String[] args)
    {
        //array de notas de aluno
        int[] notasArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        LivroDeNotas meuLivroDeNotas = new LivroDeNotas(
                "Java Como Programar 8a Edição", notasArray);
        meuLivroDeNotas.TelaMensagem();
        meuLivroDeNotas.GrausDeProcesso();
    }//fim de main
}//fim da classe LivroDeNotasTeste
