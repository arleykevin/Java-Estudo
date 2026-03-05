import java.util.Scanner;

public class Exercicio0101Java {
    public static void main(String[] args) {
        int a;
        int b;
        int soma;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = input.nextInt();
        c = a + b;
        System.out.println("A soma dos números: = " + c);
    }
}
