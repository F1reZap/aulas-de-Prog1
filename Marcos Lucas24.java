import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Digite o valor de A (Dividendo): ");
        int A = teclado.nextInt();
        System.out.print("Digite o valor de B (Divisor): ");
        int B = teclado.nextInt();

        if (B <= 0) {
            System.out.println("Erro: O divisor deve ser maior que zero.");
            return;
        }
        int quo = 0;
        int rest = A;
        while (rest >= B) {
            rest = rest - B;
            quo++;
        }

        System.out.println("Quociente = " +quo+ "Resto = " +rest);
        teclado.close();
    }
}
