import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double X1 = scanner.nextDouble();
        Double Y1 = scanner.nextDouble();
        Double X2 = scanner.nextDouble();
        Double Y2 = scanner.nextDouble();
        Double distancia = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1),2));

        System.out.printf("%.4f%n", distancia);
    }
}

