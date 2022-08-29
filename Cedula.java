


import java.util.Scanner;
public class Cedula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int notaDeCem = 100;
        int notaDe50 = 50;
        int notaDe20 = 20;
        int notaDe10 = 10;
        int notaDe5 = 5;
        int notaDe2 = 2;
        int notaDe1 = 1;
        int numeroNotasDeCem = N / notaDeCem;
        int valorAcumulado = numeroNotasDeCem * notaDeCem;
        int numeroNotasDe50 = (N - valorAcumulado) / notaDe50;
        valorAcumulado += (numeroNotasDe50 * notaDe50);
        int numeroNotasDe20 = (N - valorAcumulado) / notaDe20;
        valorAcumulado += (numeroNotasDe20 * notaDe20);
        int numeroNotasDe10 = (N - valorAcumulado) / notaDe10;
        valorAcumulado += (numeroNotasDe10 * notaDe10);
        int numeroNotasDe5 = (N - valorAcumulado) / notaDe5;
        valorAcumulado += (numeroNotasDe5 * notaDe5);
        int numeroNotasDe2 = (N - valorAcumulado) / notaDe2;
        valorAcumulado += (numeroNotasDe2 * notaDe2);
        int numeroNotasDe1 = (N - valorAcumulado) / notaDe1;
        valorAcumulado += (numeroNotasDe1 * notaDe1);

        System.out.println(N);
        System.out.println(numeroNotasDeCem +" nota(s) de R$ 100,00");
        System.out.println(numeroNotasDe50 +" nota(s) de R$ 50,00");
        System.out.println(numeroNotasDe20 + " nota(s) de R$ 20,00");
        System.out.println( numeroNotasDe10 + " nota(s) de R$ 10,00");
        System.out.println(numeroNotasDe5 + " nota(s) de R$ 5,00");
        System.out.println(numeroNotasDe2 + " nota(s) de R$ 2,00");
        System.out.println(numeroNotasDe1 + " nota(s) de R$ 1,00");

    }
}
