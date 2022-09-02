import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class SortSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        List<Integer> list2 = Arrays.asList(numero3, numero2, numero1);
        list2.sort(Integer::compareTo);

        for (Integer number: list2) {
            System.out.println(number);
        }
        System.out.println();
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
    }
}
