import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("CÁLCULO DE MÉDIA DE NOTAS");

        System.out.printf("Digite um número inteiro: ");
        num1 = input.nextInt();

        Integer numConvertido = new Integer(num1);

        System.out.printf("NÚMERO CONVERTIDO: \n%d", numConvertido);

    }
}