import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        if (salary <= 400){
            double reajuste = salary * (0.15);
            System.out.printf("Novo salario: %.2f%n",(salary + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if (salary > 400 && salary <= 800) {
            double reajuste = salary * (0.12);
            System.out.printf("Novo salario: %.2f%n",(salary + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 12 %");


        }
        else if (salary > 800 && salary <= 1200) {
            double reajuste = salary * (0.10);
            System.out.printf("Novo salario: %.2f%n",(salary + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 10 %");

        }
        else if (salary > 1200 && salary <= 2000) {
            double reajuste = salary * (0.07);
            System.out.printf("Novo salario: %.2f%n",(salary + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if (salary > 2000) {
            double reajuste = salary * (0.04);
            System.out.printf("Novo salario: %.2f%n",(salary + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}
