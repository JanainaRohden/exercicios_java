

import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double N = scanner.nextDouble();
        int notaDeCem = 100;
        int notaDe50 = 50;
        int notaDe20 = 20;
        int notaDe10 = 10;
        int notaDe5 = 5;
        int notaDe2 = 2;
        int MoedaDe1 = 1;
        int MoedaDe50 = 50;
        int MoedaDe25 = 25;
        int MoedaDe10 = 10;
        int MoedaDe5 = 5;
        int MoedaDe01 = 1;

        //Em uma equação matematica entre variaveis de tipos diferentes,
        // o resultado assume o maior tipo da equação
        // ex.: Double x = Double y * int z
        // CASTING (processo de forçar o java a interpretar
        // um tipo primitivo de forma diferente
        int numeroNotasDeCem = N.intValue() / notaDeCem;
        int valorAcumulado = numeroNotasDeCem * notaDeCem;
        int numeroNotasDe50 = (N.intValue() - valorAcumulado) / notaDe50;
        valorAcumulado += (numeroNotasDe50 * notaDe50);
        int numeroNotasDe20 = (N.intValue() - valorAcumulado) / notaDe20;
        valorAcumulado += (numeroNotasDe20 * notaDe20);
        int numeroNotasDe10 = (N.intValue() - valorAcumulado) / notaDe10;
        valorAcumulado += (numeroNotasDe10 * notaDe10);
        int numeroNotasDe5 = (N.intValue() - valorAcumulado) / notaDe5;
        valorAcumulado += (numeroNotasDe5 * notaDe5);
        int numeroNotasDe2 = (N.intValue() - valorAcumulado) / notaDe2;
        valorAcumulado += (numeroNotasDe2 * notaDe2);
        int numeroMoedasDe1 = (N.intValue() - valorAcumulado) / MoedaDe1;
        valorAcumulado += (numeroMoedasDe1 * MoedaDe1);

        int centavos = (int) ((N - valorAcumulado) * 100);
        int numeroMoedasDe50 = centavos / MoedaDe50;
        valorAcumulado = (numeroMoedasDe50 * MoedaDe50);
        int numeroMoedasDe25 = (centavos - valorAcumulado) / MoedaDe25;
        valorAcumulado += (numeroMoedasDe25 * MoedaDe25);
        int numeroMoedasDe10 = (centavos - valorAcumulado) / MoedaDe10;
        valorAcumulado += (numeroMoedasDe10 * MoedaDe10);
        int numeroMoedasDe5 = (centavos - valorAcumulado) / MoedaDe5;
        valorAcumulado += (numeroMoedasDe5 * MoedaDe5);
        int numeroMoedasDe01 = (centavos - valorAcumulado) / MoedaDe01;
        valorAcumulado += (numeroMoedasDe01 * MoedaDe01);

        System.out.println("NOTAS:");
        System.out.println(numeroNotasDeCem + " nota(s) de R$ 100.00");
        System.out.println(numeroNotasDe50 + " nota(s) de R$ 50.00");
        System.out.println(numeroNotasDe20 + " nota(s) de R$ 20.00");
        System.out.println( numeroNotasDe10 + " nota(s) de R$ 10.00");
        System.out.println(numeroNotasDe5 + " nota(s) de R$ 5.00");
        System.out.println(numeroNotasDe2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(numeroMoedasDe1 + " moeda(s) de R$ 1.00");
        System.out.println(numeroMoedasDe50 + " moeda(s) de R$ 0.50");
        System.out.println(numeroMoedasDe25 + " moeda(s) de R$ 0.25");
        System.out.println(numeroMoedasDe10 + " moeda(s) de R$ 0.10");
        System.out.println(numeroMoedasDe5 + " moeda(s) de R$ 0.05");
        System.out.println(numeroMoedasDe01 + " moeda(s) de R$ 0.01");




    }
}
