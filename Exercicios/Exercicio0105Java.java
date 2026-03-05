import java.util.Locale;
import java.util.Scanner;

public class Exercicio0105Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        input.useLocale(Locale.US);

        double peca1 , peca2;
        int cod1 , cod2 , num1,  num2 ;
        double  valor1, valor2, ValorFinal;

        System.out.println("Digite o Codigo, o Número de peças, e o Valor da Peça 01: ");
        cod1 = input.nextInt();
        num1 = input.nextInt();
        valor1 = input.nextDouble();

        System.out.println("Digite o Codigo, o Número de peças, e o Valor da Peça 02: ");
        cod2 = input.nextInt();
        num2 = input.nextInt();
        valor2 = input.nextDouble();

        peca1 = (double) num1 * valor1;
        peca2 = (double) num2 * valor2;

        ValorFinal = peca1 + peca2;

        System.out.printf("Valor a Pagar: R$ %.2f%n", ValorFinal);


    }
}
