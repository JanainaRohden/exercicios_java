import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora = scanner.nextInt();
        int km = scanner.nextInt();
        Double distancia = ((double) km) * hora;
        double consumo = distancia / 12;
        System.out.printf("%.3f%n" , consumo);
    }
}
