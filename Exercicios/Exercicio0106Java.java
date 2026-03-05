import java.lang.classfile.attribute.StackMapFrameInfo;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio0106Java {
    public static void main(String[] args) {
        double A, B, C, pi;
        double areaTrianguloRe, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        pi = 3.14159;
         
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        input.useLocale(Locale.US);

        System.out.println("Digite os valores: ");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();


        areaTrianguloRe = (A * C)/2;
        System.out.printf("A area do Triangulo é: %.3f%n", areaTrianguloRe);

        areaCirculo = pi * Math.pow(C, 2);
        System.out.printf("A area do Circulo é: %.3f%n ", areaCirculo);

        areaTrapezio = ((A + B) * C) / 2;
        System.out.printf("A area do Trapezio é: %.3f%n", areaTrapezio);

        areaQuadrado = Math.pow(B,2);
        System.out.printf("A area do Quadrado é: %.3f%n" , areaQuadrado);

        areaRetangulo = A * B;
        System.out.printf("A area do Retangulo é: %.3f%n", areaRetangulo);

    }
}
