import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        double imposto = 0;
        if (salary <= 2000) {
            System.out.println("Isento");
        } else {
            imposto += calculaImpostoOito(salary);
            imposto += calculaImpostoDezoito(salary);
            imposto += calculaImpostoVinteOito(salary);


            System.out.printf("R$ %.2f%n", imposto);
        }
    }

    private static Double calculaImpostoOito(Float valor) {
        if ((valor - 2000) > 1000) {
            return 1000 * 0.08;
        }
        return (valor - 2000) * 0.08;
    }
    private static Double calculaImpostoDezoito(Float valor){
        if ((valor - 3000) > 1500){
         return 1500 * 0.18;
        }
        return (valor - 3000) * 0.18;
    }
    private static Double calculaImpostoVinteOito(Float valor){
        if (valor > 4500){
            return (valor - 4500) * 0.28;
        }
        return 0.0;
    }
}