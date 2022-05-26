package Cap07;

//Figura 7.14: LivroDeNotas.java --> traducao do ingles GradeBook.java
//classe LivroDeNotas usando um array para armazenamento notas de teste

public class LivroDeNotas
{
    private String nomeCurso; //nome do curso que essa NotaLivro representa
    private int[] notas; //array de notas de aluno

    //construtor de dosi argumentos inicializa nomeCurso e o array de notas
    public LivroDeNotas(String nome, int[] notasArray)
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

        //chama método getMedia para calcular a nota da média
        System.out.printf("\nClasse media é %.2f\n", getMedia());

        //chama métodos getMinimo e getMaximo
        System.out.printf("A média da nota mais baixa é %d\nA nota mais alta é %d\n\n",
                getMinimo(), getMaximo());
        //chama graficos de barra de saida para imprimir grafico de distribuição de notas
        GraficosBarrasDeSaida();
    }//fim do metodo GrausDeProcesso

    //localiza nota minima
    public int getMinimo()
    {
        int notaBaixa =  notas[0]; //assume que notas[0] é a menor nota
        //faz um loop pelo array de notas
        for(int nota : notas)
        {
            //se nota for mais baixa que notaBaixa, essa é atribuida aa notaBaixa
            if(nota < notaBaixa)
               notaBaixa = nota; //nova nota mais baixa
        }//fim do for
        return notaBaixa; //retorna nota mais baixa
    }//fim do método getMinimo

    //localiza nota máxima
    public int getMaximo()
    {
        int notaAlta = notas[0]; //assume que notas[0] é a maior nota
        //faz um loop pelo array de notas
        for(int nota : notas)
        {
            //se a nota for maior que notalAlta, atribui essa nota a notaAlta
            if(nota > notaAlta)
               notaAlta = nota; //nova nota mais alta
        }//fim de for

        return notaAlta;
    }//fim do método getMaximo

    //determina a média para o teste
    public double getMedia()
    {
        int total = 0;//inicializa o total

        //soma notas de um aluno
        for(int nota : notas)
            total += nota;

        //retorna média de notas
        return (double) total/notas.length;
    }//fim do metodo getMedia

    //gera saida de grafico de barrad exibindo distribuição de notas
    public void GraficosBarrasDeSaida()
    {
        System.out.println("Distribuição de notas:");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequencia = new int[11];

        //para cada nota incrememntada a frequrncia apropriada
        for(int nota : notas)
            ++frequencia[nota / 10];

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

        //gera a saida da nora de cada aluno
        for(int estudante = 0; estudante < notas.length; estudante++)
            System.out.printf("Estudante %2d: %3d\n", estudante + 1, notas[estudante]);
    }//fim do método NotasDeSaida
}//fim da classe LivroDeNotas
