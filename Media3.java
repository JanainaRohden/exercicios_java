import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float N1 = scanner.nextFloat();
        float N2 = scanner.nextFloat();
        float N3 = scanner.nextFloat();
        float N4 = scanner.nextFloat();

        float MEDIA = (((2 * N1) + (3 * N2) + (4 * N3) + (1 * N4))/10);

        System.out.printf("Media: %.1f%n", MEDIA);

        if (MEDIA >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (MEDIA < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if ( 5.0 <= MEDIA && MEDIA <= 6.9) {
            System.out.println("Aluno em exame.");
            float N5 = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", N5);
            float MEDIA1 = (MEDIA + N5)/2;
            if (MEDIA1 >= 5.0){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", MEDIA1);
        }
    }
}

