import java.util.Locale;
import java.util.Scanner;

public class Exercicio0104Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        input.useLocale(Locale.US);

        int hora, funcionario;
        double valor, salario;
        System.out.print("Digite seu numero de Funcionário: ");
        funcionario = input.nextInt();
        System.out.print("Digite quantas horas trabalhadas: ");
        hora = input.nextInt();
        System.out.print("Digite qual valor de horas trabalhadas: R$");
        valor = input.nextDouble();

        salario = (double) (hora * valor);

        System.out.println("Número do Funcionário: " + funcionario);
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
}
