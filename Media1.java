import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double notaA = scanner.nextDouble();
        Double notaB = scanner.nextDouble();
        Double MEDIA = (((3.5 * notaA) + (7.5 * notaB))/11);
        System.out.printf("MEDIA = %.5f%n" , MEDIA);
    }
}
