import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class TiposDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        List<Double> list2 = Arrays.asList(A, B, C);
        list2.sort(Double::compareTo);
        Collections.reverse(list2);
        A = list2.get(0);
        B = list2.get(1);
        C = list2.get(2);

        if (A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            double bAndC = pow(B, 2) + pow(C, 2);
            if (pow(A, 2) == bAndC) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (pow(A, 2) > bAndC) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (pow(A, 2) < bAndC) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C && A == C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (B == C && C != A) || (A == C && B != C)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
