import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoA = scanner.nextInt();
        int quantidadeA = scanner.nextInt();
        Double valorA = scanner.nextDouble();
        int codigoB = scanner.nextInt();
        int quantidadeB = scanner.nextInt();
        Double valorB = scanner.nextDouble();
        Double total = ((quantidadeA *  valorA)+(quantidadeB * valorB));
        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , total);
    }
}
