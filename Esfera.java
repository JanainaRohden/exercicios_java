import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double pi = 3.14159;
        Double fracao = 4/3.0;
        Double RAIO = scanner.nextDouble();
        Double volume = ((4/3.0) * pi * (Math.pow(RAIO, 3)));
        System.out.printf("VOLUME = %.3f%n" , volume);
    }
}
