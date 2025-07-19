import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite um valor de altura ");
        int alt = teclado.nextInt();

        for (int i = 1; i <= alt; i++) {
            for (int a = 0; a < alt - i; a++) {
                System.out.print(" ");
            }
            for (int a = 0; a < (2 * i - 1); a++) {
                System.out.print("#");
            }
            System.out.println();
        }
        teclado.close();
    }
}
