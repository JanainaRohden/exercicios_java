import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int minuto = 60;
        int hora = 60;
        int respostaSegundos = N % minuto;
        int minutos = N / 60;
        int respostaHoras = minutos / hora;
        minutos -= respostaHoras * 60;
        System.out.println(respostaHoras + ":" + minutos + ":" + respostaSegundos);

    }
}
