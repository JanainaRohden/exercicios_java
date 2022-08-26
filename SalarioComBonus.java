import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String func = scanner.next();
        Double salary = scanner.nextDouble();
        Double totaldevendas = scanner.nextDouble();
        Double comissao = (totaldevendas * 0.15);
        Double valortotal = (salary +  comissao);
        System.out.printf("TOTAL = R$ %.2f%n" , valortotal);
    }
}
