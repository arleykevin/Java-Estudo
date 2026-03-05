import java.util.Scanner;

public class Exercicio0103Java {
    public static void main(String[] args) {

        int A, B, C, D, diferenca;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Primeiro numero: ");
        A = input.nextInt();
        System.out.println("Digite o Segundo numero: ");
        B = input.nextInt();
        System.out.println("Digite o Terceiro numero: ");
        C = input.nextInt();
        System.out.println("Digite o Quarto numero: ");
        D = input.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("Diferença = " + diferenca);



    }
}
