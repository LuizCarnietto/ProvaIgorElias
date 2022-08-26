import java.util.Scanner;

public class ProvaAtividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aum = 0.015, sal = 1000, soma = 1000;
        int ano = 1995;

        do {
            soma = soma + (sal * aum);
            aum = aum + aum;
            ano++;
        }while (ano < 2022);
        System.out.println("O valor do salário no final de tudo isso será de: " +soma);
    }
}
