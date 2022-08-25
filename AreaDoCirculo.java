import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double pi = 3.14159;
        Double raio = scanner.nextDouble();
        Double area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);
    }
}
