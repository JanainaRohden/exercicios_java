import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double notaA = scanner.nextDouble();
        Double notaB = scanner.nextDouble();
        Double notaC = scanner.nextDouble();
        Double MEDIA = (((2 * notaA) + (3 * notaB) + (5 * notaC))/10);
        System.out.printf("MEDIA = %.1f%n" , MEDIA);
    }
}
