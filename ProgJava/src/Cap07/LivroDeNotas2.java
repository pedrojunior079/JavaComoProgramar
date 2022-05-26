package Cap07;

//Figura 7.18: LivroDeNotas2.java --> traducao do ingles GradeBook.java
//classe LivroDeNotas2 com mum array bidimensional para armazenar notas

public class LivroDeNotas2
{
    private String nomeCurso; //nome do curso que essa NotaLivro representa
    private int[][] notas; //array bidimensional de notas de aluno

    //construtor de dosi argumentos inicializa nomeCurso e o array de notas
    public LivroDeNotas2(String nome, int[][] notasArray)
    {
        nomeCurso = nome; //inicializa nomeCurso
        notas = notasArray; //nives de armazenamento
    }//fim do construtor NotaLivro de dois arguemntos

    //método para configurar o nome do curso
    public void setNomeCurso(String nome)
    {
        nomeCurso = nome; //armazena o nome do curso
    }//fim do método setNomeCurso

    //método patra recuperar o nome do curso
    public String getNomeCurso()
    {
        return nomeCurso;
    }//fim do método getNomeCurso

    //exibe a mensagem de boas-vindas para o usario NotaLivro
    public void TelaMensagem()
    {
        //getNomeCurso obtém o nome3 do curso
        System.out.printf("Bem vindo ao livro de notas para\n%s!\n\n", getNomeCurso());
    }//fim do método telaMensagem

    //realiza várias de array de notas
    public void GrausDeProcesso()
    {
        //gera saida de array de notas
        NotasDeSaida();

        //chama métodos getMinimo e getMaximo
        System.out.printf("\n%s %d\n%s %d\n\n",
                        "A média da nota mais baixa é ", getMinimo(),
                        "A média de nota mais alta é ",getMaximo());

        //gera saida de grafico de distribuição de notas de todas as notas em todos os testes
        GraficosBarrasDeSaida();
    }//fim do metodo GrausDeProcesso

    //localiza nota minima
    public int getMinimo()
    {
        int notaBaixa =  notas[0][0]; //assume que notas[0] é a menor nota
        //faz um loop pelas linhas do array de notas
        for(int[] estudanteNotas : notas)
        {
            //faz um loop pelas colunas da linha atual
            for(int nota: estudanteNotas)
            {
                //se nota for mais baixa que notaBaixa, essa é atribuida aa notaBaixa
                if(nota < notaBaixa)
                    notaBaixa = nota; //nova nota mais baixa
            }//fim do for interno
        }//fim do for externo

        return notaBaixa; //retorna nota mais baixa
    }//fim do método getMinimo

    //localiza nota máxima
    public int getMaximo()
    {
        int notaAlta = notas[0][0]; //assume que notas[0] é a maior nota
        //faz um loop pelo array de notas
        for(int[] estudanteNota : notas)
        {
            //faz um loop pelas colunas da linha atual
            for(int nota: estudanteNota)
            {
                //se a nota for maior que notalAlta, atribui essa nota a notaAlta
                if(nota > notaAlta)
                    notaAlta = nota; //nova nota mais alta
            }//fim do for iinterno
        }//fim de for externo

        return notaAlta; //retorna a nota mais alta
    }//fim do método getMaximo

    //determina a média para o teste
    public double getMedia(int[] setDeNotas)
    {
        int total = 0;//inicializa o total

        //soma notas de um aluno
        for(int nota : setDeNotas)
            total += nota;

        //retorna média de notas
        return (double) total/setDeNotas.length;
    }//fim do metodo getMedia

    //gera saida de grafico de barrad exibindo distribuição de notas
    public void GraficosBarrasDeSaida()
    {
        System.out.println("Distribuição de notas:");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequencia = new int[11];

        //para cada nota em LivroDeNotas2, incrementar a frequencia certa
        for(int[] estudanteNotas : notas)
        {
            for(int nota : estudanteNotas)
                ++frequencia[nota / 10];
        }//fim do for externo

        //para cada frequencia de nota, imprime barra no grafico
        for(int contador = 0; contador < frequencia.length; contador++)
        {
            //imprime rótulo de barra("00-09: ", ..., "90-99: ", "100: ")
            if(contador == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        contador * 10, contador * 10 + 9);

            //imprime a barra de asteriscos
            for(int asteriscos = 0; asteriscos < frequencia[contador]; asteriscos++)
                System.out.print("*");

            System.out.println();//inicia uma nova linha de saida
        }//fim do for externo
    }//fim do método GraficoBarrasDeSaida

    //gera a saida de conteudo do array de notas
    public void NotasDeSaida()
    {
        System.out.println("As notas são:\n");
        System.out.print("            ");//alinha os titulos da coluna

        //cria um titulo de coluna para cada um dos testes
        for(int teste = 0; teste < notas[0].length; teste++)
            System.out.printf("Teste %d ", teste + 1);

        System.out.println("Media"); //titulo da coluna de media do aluno

        //cria linhas/colunas de texto que representam notas do array
        for(int estudante = 0; estudante < notas.length; estudante++)
        {
            System.out.printf("Estudante %2d", estudante + 1);

            for(int teste :  notas[estudante]) //gera saida de notas do aluno
                System.out.printf("%8d", teste);

            //chama método getMedia para calcular a média do aluno
            //passa linha de notas como argumentpo para getMedia
            double media = getMedia(notas[estudante]);
            System.out.printf("%9.2f\n", media);
        }//fim do for externo
    }//fim do método NotasDeSaida
}//fim da classe LivroDeNotas2
