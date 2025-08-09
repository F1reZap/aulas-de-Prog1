import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quantidade de Sequencias: ");
        int Nseq = teclado.nextInt();

        int [] Vet1 = new int[Nseq];
        boolean peak = false;

        for (int i = 0; i< Vet1.length; i++){
            Vet1[i]= random.nextInt(0  , 100);
        }
        System.out.println(Arrays.toString(Vet1));
        for (int j = 1; j < Vet1.length-1 ; j++){
            if (Vet1[j -1] > Vet1[j] && Vet1[j +1] < Vet1[j]) {
                peak = true;
                break;
            }
        }

        if (peak){
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        System.out.println(Arrays.toString(Vet1));
    }
}

//lembrar de excluir o Else de verificação.