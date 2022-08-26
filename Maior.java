import java.util.Scanner;

import static java.lang.Math.abs;

public class Maior {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int formula = (a+b+abs(a-b))/2;
        if (formula > c){
            System.out.println(formula + " eh o maior");
        }
        else {
            System.out.println(c + " eh o maior");
        }



    }
}
