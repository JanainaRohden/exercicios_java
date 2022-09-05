import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double perimetro = (A + B + C);
        double area = ((A + B) * C)/2;
        if (A>=B+C || B>=C+A || C>=A+B) {
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }else {
            perimetro = (A + B + C);
            System.out.printf("Perimetro = %.1f%n", perimetro);


        }

    }
}
