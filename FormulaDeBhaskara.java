import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double delta, R1, R2;
        delta = (B * B) + (-4 * (A * C));

        if (delta >= 0 && A != 0){
            R1 =  ((-(B) + Math.sqrt(delta)) / (2 * A));
            R2 =  ((-(B) - Math.sqrt(delta)) / (2 * A));
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }else {
            System.out.println("Impossivel calcular");

        }
    }

}
