import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        int fi1 =1, fi2 =1, fiprox=0, n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("n: ");
        n = teclado.nextInt();
        System.out.println("1.");

        for (int i=1; i<n; i++){
            fiprox = fi1 + fi2;
            fi1=fi2;
            fi2=fiprox;
            System.out.println(fiprox+".");
        }

        teclado.close();
    }
}