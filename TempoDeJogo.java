

import java.util.Scanner;


public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start == 0 && end == 0){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (start > 0 && start <= 12) {
            int i = end - start;
            System.out.println("O JOGO DUROU "+ i +" HORA(S)");
        }
        else if (start > 12 && start < 24) {
            int j = (24 - start) + end;
            System.out.println("O JOGO DUROU "+ j +" HORA(S)");
        }

    }
}
