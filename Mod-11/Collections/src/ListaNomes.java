import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args){
        List<String> listaNomes = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String nomes;
        String[] nomesFormatados;


        System.out.println("ORDENAÇÃO DE NOMES");

        //Capturo os nomes com Scanner, atribuindo-os a variável nomes

        System.out.println("Digite nomes separados por vírgula: ");
        nomes = input.nextLine();

        //faço o split na variável nomes, atribuindo o resultado ao array nomesFormatados

        nomesFormatados = nomes.split(",");

         //Uso o laço for, fazendo a iteração sobre o array nomesFormatados, e adiciono a listaNomes
        for (int count = 0; count < nomesFormatados.length ; count++){
            listaNomes.add(nomesFormatados[count]);
        };

        //Faço a ordenação usando sort
        listaNomes.sort(null);

        System.out.println("ORDENADAS: " + listaNomes);

    }
}
