import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        final int DIAS_NO_ANO = 365;
        final int DIAS_NO_MES = 30;
        int DIA = 30;
        int anos = N / DIAS_NO_ANO;
        int diasDescontados = (anos * DIAS_NO_ANO);
        int meses = (N - diasDescontados) / DIAS_NO_MES;
        int dias = (N - diasDescontados) % DIAS_NO_MES;


        System.out.println(anos+" ano(s)");
        System.out.println(meses +" mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
