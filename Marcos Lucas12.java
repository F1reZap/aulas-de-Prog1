import java.util.Arrays;
import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Vet[] = new int[10];
        boolean ordenado = true;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número na posição " + i + ":");
            Vet[i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(Vet));

        for (int i = 0; i < Vet.length - 1; i++) {
            if (Vet[i] > Vet[i + 1]) {
                ordenado = false;
                break;
            }
        }
        if (ordenado) {
            System.out.println("O vetor está ordenado crescentemente.");
        } else {
            System.out.println("O vetor NÃO está ordenado crescentemente.");
        }
    }
}
