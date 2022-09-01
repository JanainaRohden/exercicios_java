import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CODIGO = scanner.nextInt();
        int QUANTIDADE = scanner.nextInt();
        final int CACHORRO_QUENTE = 1;
        final int X_SALADA = 2;
        final int X_BACON = 3;
        final int TORRADA = 4;
        final int REFRIGERANTE = 5;
        if (CODIGO==CACHORRO_QUENTE){
           double TOTAL = 4.00 * QUANTIDADE;
            System.out.printf("Total: R$ %.2f%n", TOTAL);
        } else if (CODIGO==X_SALADA) {
            double TOTAL = 4.50 * QUANTIDADE;
            System.out.printf("Total: R$ %.2f%n", TOTAL);
        } else if (CODIGO==X_BACON) {
            double TOTAL = 5.00 * QUANTIDADE;
            System.out.printf("Total: R$ %.2f%n", TOTAL);
        } else if (CODIGO==TORRADA) {
            double TOTAL = 2.00 * QUANTIDADE;
            System.out.printf("Total: R$ %.2f%n", TOTAL);
        } else if (CODIGO == REFRIGERANTE) {
            double TOTAL = 1.50 * QUANTIDADE;
            System.out.printf("Total: R$ %.2f%n", TOTAL);
        }


    }
}
