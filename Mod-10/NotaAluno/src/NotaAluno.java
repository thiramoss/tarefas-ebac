

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.println("CÁLCULO DE MÉDIA DO ALUNO");

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = input.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = input.nextFloat();
        System.out.println("Digite a quarta nota:");
        nota4 = input.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.printf("A média do aluno(a) é: %.1f! Ele(a) está aprovado(a)", media);
        } else if (media >= 5) {
            System.out.printf("A média do aluno(a) é: %.1f! Ele(a) está de reperação", media);
        } else {
            System.out.println("O aluno(a) está reprovado(a)");
        }
    }
}

