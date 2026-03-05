import java.util.Locale;
import java.util.Scanner;

public class Exercicio0207Java {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu numero para X: ");
        double x  = input.nextDouble();
        System.out.print("Digite seu numero para Y: ");
        double y = input.nextDouble();

        if(x > 0 && y > 0 ){
        System.out.println("Q1");
        } else if(x > 0 && y < 0 ){
            System.out.println("Q4");
        } else if(x < 0 && y < 0 ){
            System.out.println("Q3");
        } else if(x < 0 && y > 0 ){
            System.out.println("Q2");
        } else{
            System.out.println("Eixo");
        }
    input.close();
    }
}
