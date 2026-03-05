import java.util.Scanner;

public class Exercicio0203Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para saber se eles sao multiplos: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if( num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São Multiplo");
        } else {
            System.out.println("NÃO Multiplo");
        }
    input.close();
    }
}
