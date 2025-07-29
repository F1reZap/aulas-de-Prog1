import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args){
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int adec, adec2;
        for (int i = 0; i<10; i++){
            adec = random.nextInt(100);
            adec2 = random.nextInt(100);
            vet1[i]=adec;
            vet2[i]=adec2;
            vet3[i]= vet1[i]+vet2[i];
            System.out.println("vetor1: "+vet1[i]+". posição: "+i);
            System.out.println("vetor2: "+vet2[i]+". posição: "+i);
            System.out.println("vetor3(vetor1+vetor2): "+vet3[i]+". posição: "+i);
        }

    }
}