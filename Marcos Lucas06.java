import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args){
        int fibinic=1, fibant=0, fibprox, n;

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Quantos numeros de fibonacci: ");
        n = teclado.nextInt();
        int Fibonacci[] = new int[n];

        for (int i=0; i<n; i++){
            fibprox = fibinic+fibant;
            fibant = fibinic;
            fibinic = fibprox;

            Fibonacci[i] = fibprox;
        }
        System.out.println(Arrays.toString(Fibonacci));
    }
}