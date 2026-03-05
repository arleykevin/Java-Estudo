import javax.lang.model.util.ElementScanner6;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio0206Java {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Digite seu um numero : ");
        double numero = input.nextDouble();

        if (numero >= 0 && numero <= 25) {
            System.out.printf("Intervalo [0,25]");
        } else if (numero >= 25 && numero <= 50) {
            System.out.printf("Intervalo [25,50]");
        } else if (numero >= 50 && numero <= 75) {
            System.out.printf("Intervalo [50,75]");
        } else if (numero >= 75 && numero <= 100) {
            System.out.printf("Intervalo [75,100]");
        } else {
            System.out.printf("Fora do Intervalo");
        }
    input.close();
    }
}
