import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 61){
            System.out.println("Brasilia");
        }
        else if (number == 71) {
            System.out.println("Salvador");
        }
        else if (number == 11) {
            System.out.println("Sao Paulo");
        }
        else if (number == 21) {
            System.out.println("Rio de Janeiro");
        }
        else if (number == 32) {
            System.out.println("Juiz de Fora");
        }
        else if (number == 19) {
            System.out.println("Campinas");
        }
        else if (number == 27) {
            System.out.println("Vitoria");
        }
        else if (number == 31) {
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
