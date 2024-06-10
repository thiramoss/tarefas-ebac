import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaGeneros {
    public static void main(String[] args){
        List<String> listaMulheres = new ArrayList<String>();
        List<String> listaHomens = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String nomesGeneros;
        String[] nomesFormatados;
        String[] n_homens;
        String[] n_mulheres;


        System.out.println("ORDENAÇÃO DE GÊNEROS");

        /**
         * 1-Começo solicitando que o usuário digite o nome e o gênero do indivíduo.
         * 2-Guardo as informações na variável nomesGeneros.
         */
        System.out.println("Digite nomes e gêneros, separados por vírgula: (Nome - M/F)");
        nomesGeneros = input.nextLine();

        /**
         * Aqui formato a variável nomesGeneros com o método de string split,atribuindo ao array nomesFormatados.
         */
        nomesFormatados = nomesGeneros.split(",");

        /**
         * Utilizando o laço de repetição for, faço a iteração no array nomesFormatados.
         * Com a condicional if, faço a ánalise em cada índice do array.
         * Uso toString() para passar o array para String e conseguir utilizar o método de string endsWith
         * Com endsWith, verifico se o conteúdo termina com M ou F.
         * Se termina com M ou F, faço o split, separando o nome, da letra que indica o gênero, atribuindo-os ao
         * array n_homens ou array n_mulheres.
         * Já que o objetivo é apenas separar homens e mulheres, criei 2 ArrayList, listaHomens e listaMulheres, e atribui
         * para cada um deles, o resultado condizente com a condicional, capturando apenas o índice 0 do array
         * n_homens ou n_mulheres, que é onde está o nome do indivíduo, já que não preciso mais da letra que indica
         * o gênero, que ficaria no índice 1 do array.
         */
        for (int count = 0; count < nomesFormatados.length ; count++){
            if (nomesFormatados[count].toString().endsWith("M")){
                n_homens = nomesFormatados[count].split("-");
                listaHomens.add(n_homens[0]);

            } else {
                n_mulheres = nomesFormatados[count].split("-");
                listaMulheres.add(n_mulheres[0]);

            }
        };

        /**
         * Utilizando sort, ordenei as duas listas em ordem alfabética
         */
        listaHomens.sort(null);
        listaMulheres.sort(null);
        System.out.println(listaHomens);
        System.out.println(listaMulheres);

    }
}
