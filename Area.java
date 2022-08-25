import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double A = scanner.nextDouble();
        Double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pi = 3.14159;
        Double TRIANGULO = (A * C/2);
        Double CIRCULO = (pi * Math.pow(C, 2));
        Double TRAPEZIO = ((A + B) * C/2);
        Double QUADRADO = Math.pow(B, 2);
        Double RETANGULO = (A * B);
        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n",CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n",TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
    }
}
