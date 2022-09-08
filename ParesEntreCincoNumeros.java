import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conta = 0;
        for (int i = 0; i < 5; i++){
            if (scanner.nextInt() % 2 == 0){
                conta++;

            }
        }
        System.out.println(conta + " valores pares");
    }
}
