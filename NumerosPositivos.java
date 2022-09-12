import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conta = 0;

        for (int i = 0; i < 6; i++){
            if (scanner.nextDouble() > 0){
                conta++;
            }
        }
        System.out.println(conta + " valores positivos");
    }
}
