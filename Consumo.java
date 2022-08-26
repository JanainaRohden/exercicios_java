import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        Double Y = scanner.nextDouble();
        Double RESOLUCAO = X/Y;
        System.out.printf("%.3f km/l%n", RESOLUCAO);


    }
}

