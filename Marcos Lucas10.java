import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args) {
        Random random = new Random();
        int Vet1[] = new int[10];
        int Vet2[] = new int[10];
        int Vet3[] = new int[10];
        int a, b;
        for (int i=0; i<10; i++){
            a = random.nextInt();
            Vet1[i] = a;
            b = random.nextInt();
            Vet2[i] = b;
        }
        for (int i = 0; i < 10; i++) {
            Vet3[2 * i] = Vet1[i];
            Vet3[2 * i + 1] = Vet2[i];
        }
        for (int i = 0; i < Vet3.length; i++) {
            System.out.println("Vet3[" + i + "] = " + Vet3[i]);
        }
    }
}