//Figura 5.18: OperadoresLogicos.java
//Operadores lógicos

public class OperadoresLogicos 
{
    public static void main(String[] args)
    {
        //cria a tabela verdade para o operador && (E condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional AND (&&)", "falso && falso", (false && false),
        "falso && verdadeiro", (false && true),
        "verdadeiro && falso", (true && false),
        "verdadeiro && verdadeiro", (true && true));

        //cria a tabela verdade para o operador || (OU condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional OR (||)", "falso || falso", (false || false),
        "falso || verdadeiro", (false || true),
        "verdadeiro || falso", (true || false),
        "verdadeiro || verdadeiro", (true || true));

        //cria a tabela verdade para o operador & (E logico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Booleano logico AND (&)", "falso & falso", (false & false),
        "falso & verdadeiro", (false & true),
        "verdadeiro & falso", (true & false),
        "verdadeiro & verdadeiro", (true & true));

        //cria a tabela verdade para o operador | (OU inclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Booleano inclusivo logico OR (|)", 
        "falso | falso", (false | false),
        "falso | verdadeiro", (false | true),
        "verdadeiro | falso", (true | false),
        "verdadeiro | verdadeiro", (true | true));

        //cria a tabela verdade para o operador ^ (E condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Lócico booleano exckusivo OR (^)", 
        "falso ^ falso", (false ^ false),
        "falso ^ verdadeiro", (false ^ true),
        "verdadeiro ^ falso", (true ^ false),
        "verdadeiro ^ verdadeiro", (true ^ true));

        //cria a tabela-verdade para o operador ! (negação logica)
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Não Logico (!)",
            "!falso", (!false), "!verdadeiro", (!true));
    }//fim de main
}//fim da classe OperadoresLogicos
