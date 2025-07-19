import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Digite o valor de X (em graus): ");
        double grau = teclado.nextDouble();


        double x = grau * Math.PI / 180.0;

        double Sin = 0.0;
        int sinal = 1;
        int expo = 1;

        for (int i = 0; i < 15; i++) {

            long fator = 1;
            for (int j = 2; j <= expo; j++) {
                fator *= j;
            }

            double ter = sinal * Math.pow(x, expo) / fator;
            Sin += ter;

            sinal *= -1;
            expo += 2;
        }

        System.out.printf("O seno aproximado de %.2f graus é: %.10f\n", grau, Sin);
        teclado.close();
    }
}
