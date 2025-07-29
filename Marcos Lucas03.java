import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args){
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int PrenA, PrenB;
        for (int i = 0; i<10; i++){
            PrenA = random.nextInt(10);
            PrenB = random.nextInt(10);
            vet1[i]= PrenA;
            vet2[i]= PrenB;
            if (vet1[i]==vet2[i]){
                vet3[i]=1;
            } else {
                vet3[i]=0;
            }
        }
        System.out.print("Vetor = [");
        for (int i =0; i<10;i++){
            System.out.print(vet3[i]+" ");
        }
        System.out.print("]");
    }
}