import java.util.Locale;
import java.util.Scanner;

public class Exercicio0102Java {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double area, p, raio;
        p = 3.14159;

        System.out.println("Digite o valor do seu raio:");
        raio = input.nextDouble();

        area = p * Math.pow(raio, 2);

        System.out.printf("O valor da Area é: %.4f%n", area);

    }
}
