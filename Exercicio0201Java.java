import java.util.Scanner;

public class Exercicio0201Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele e negativo ou positivo: ");
        int num1 = input.nextInt();

        if (num1 < 0) {

            System.out.println("Negativo");
        } else {
            System.out.println("Não Negativo");
        }

     input.close();
    }
}
