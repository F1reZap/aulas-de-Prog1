import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args) {
        int n;
        int par[] = new int[100], impneg[] = new int[100], cero[] = new int[100];
        int idxPar = 0, idxImpNeg = 0, idxCero = 0;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        for (int i=0; i<100; i++){
            n = random.nextInt(-100, 100);
            if (n == 0) {
                cero[idxCero++] = n;
            } else if (n > 0 && n % 2 == 0) {
                par[idxPar++] = n;
            } else if (n < 0 || n % 2 != 0) {
                impneg[idxImpNeg++] = n;
            }
        }
        System.out.println("Pares: " + Arrays.toString(Arrays.copyOf(par, idxPar)));
        System.out.println("Impares/Negativos: " + Arrays.toString(Arrays.copyOf(impneg, idxImpNeg)));
    }
}