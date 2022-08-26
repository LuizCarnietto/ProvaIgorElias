import java.util.Scanner;

public class ProvaAtividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg = 0, min = 0, horas = 0;

        System.out.println("Qual a massa inicial do objeto radioativo?");
        float massaInicio = sc.nextFloat();
        float massaFinal = 0;

        float massa = massaInicio;

        while (massa > 0.5){
            massa /= 2;
            seg += 50;
            min++;
        }

        while (seg >= 60){
            seg -= 60;
            min++;
        }

        while (min >= 60){
            min -= 60;
            horas++;
        }
        System.out.println("Massa inicial: "+massaInicio);
        System.out.println("Massa final: "+massaFinal);
        System.out.println("Horas: "+horas+" Minutos: "+min+" Segundos: "+seg);

    }
}
