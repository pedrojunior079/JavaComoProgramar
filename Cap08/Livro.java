//Figura 8.10: Livro.java --> tradução do ingles Book.java
//Declarando um tipo enum com um construtor e campos de
//instancia explicitos e métodos de acesso para esse campos

public enum Livro
{
    //declara constantes do tipo enum
    PHPOO("PHP - Do Basico A Orientação A Objetos", "2008"),
    JCP("Java Como Programar", "2010"),
    CPPCP("C++ Como Programar", "2006"),
    APP("Android Para Programadores", "2015");

    //campos de instáncia
    private final String titulo; //titulo de livro
    private final String copyrightAno; //ano dos direitos autorais

    //construtor enum
    Livro(String livroTitulo, String ano)
    {
        titulo = livroTitulo;
        copyrightAno = ano;
    }//fim do construtor enum Livro

    //método de acesso para titulo de campo
    public String getTitulo()
    {
        return titulo;
    }//fim do método getTitulo

    //método de acesso para o campo copyrightAno

    public String getCopyrightAno()
    {
        return copyrightAno;
    }//fim do método getCopyrightAno
}//fim do enum Livro

