import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args){
        int vetOriginal[] = new int[10];
        int vetInvertido[] = new int[10];
        int j = 9;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        for (int i =0; i<10; i++){
            System.out.println("Digite o numero para a casa "+i);
            vetOriginal[i] = teclado.nextInt();
            vetInvertido[j] = vetOriginal[i];
            j--;
        }
        System.out.println(Arrays.toString(vetOriginal));
        System.out.println(Arrays.toString(vetInvertido));
    }
}