import java.util.Scanner;

public class Exercicio0202Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele e impar ou par: ");
        int num1 = input.nextInt();
        num1 = num1 % 2;

        if (num1 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }

    }
}
