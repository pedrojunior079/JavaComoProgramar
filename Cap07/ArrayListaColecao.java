//Figura 7.24: ArrayListaColecao.java
//Demonstração da coleção ArrayList genérica.
import java.util.ArrayList;

public class ArrayListaColecao
{
    public static void main(String[] args)
    {
        //cria um novo ArrayList de strings
        ArrayList<String> items = new ArrayList<String>();

        items.add("vermelho"); //acrescenta um item a lista
        items.add(0, "amarelo"); //insere o valor no indice 0

        //cabeçalho
        System.out.print("Exibir o conteúdo da lista com loop de controlador de contador:");

        //exibe as cores na lista
        for(int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        //exibe as cores utilizando foreach no metodo exibir
        exibir(items, "\nExibir o conteudo da lista com aprimorado para declaração:");

        items.add("verde"); //adiciona "verde" ao final da lista
        items.add("amarelo"); //adiciona "amarelo" ao final da lista
        exibir(items, "Lista com dois novos elementos:");

        items.remove("amarelo"); //remove o primeiro "amarelo"
        exibir(items, "Remove primeira instancia do amarelo:");

        items.remove(1); //remove o item do indice 1
        exibir(items, "Remove segundo elemnto da lista (verde):");

        //verifica se um valor esta em List
        System.out.printf("\"vermelho\" %s esta na lista\n", items.contains("vermelho") ? "": "não: ");

        //exibe o númerpo de elementos em List
        System.out.printf("Tamanho: %s\n", items.size());
    }//fim de main

    //exibe os elementos do ArrayList no console
    public static void exibir(ArrayList<String> items, String header)
    {
        System.out.print(header); //exibe o cabeçalho

        //exibe cada elemento nos items
        for(String item : items)
            System.out.printf(" %s", items);

        System.out.println(); //exibe o fim de linha
    }//fim do método exibir
}//fim da classe ArrayListaColecao
