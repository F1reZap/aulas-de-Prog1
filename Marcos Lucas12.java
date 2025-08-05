import java.util.Arrays;
import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Vet[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número na posição " + i + ":");
            Vet[i] = teclado.nextInt();
        }
        System.out.println("Vetor original: " + Arrays.toString(Vet));

        boolean trocou;
        for (int pass = 0; pass < Vet.length - 1; pass++) {
            trocou = false;
            for (int i = 0; i < Vet.length - 1 - pass; i++) {
                if (Vet[i] > Vet[i + 1]) {
                    int temp = Vet[i];
                    Vet[i] = Vet[i + 1];
                    Vet[i + 1] = temp;
                    trocou = true;
//                    System.out.println(Arrays.toString(Vet));
                }
            }
            if (!trocou) break;
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(Vet));
    }
}