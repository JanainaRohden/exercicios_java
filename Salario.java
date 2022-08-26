import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int func = scanner.nextInt();
        System.out.println("NUMBER = " + func);
        int hora = scanner.nextInt();
        Double valorhora  = scanner.nextDouble();
        Double SALARY = (hora * valorhora);
        System.out.printf("SALARY = U$ %.2f%n" , SALARY);

    }
}
