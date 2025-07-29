import java.util.Scanner;
import java.util.Random;


public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int vet1[] = new int[10], valor, pos, rand;

        boolean achou = false;
        for (int i=0; i<vet1.length; i++){
            rand = random.nextInt(10);
            vet1[i]= rand;
        }
        System.out.println("Digite o Valor a ser pesquisado");
        valor = teclado.nextInt();
        for (int i =0; i<=vet1.length; i++){
            if (valor==vet1[i]){
                achou = true;
                pos = i;
            }

            if (achou=true){
                System.out.println(valor+ ". encontrado em "+i);
                return;

            } else {
                System.out.println(valor+ ". não encontrado");
            }
        }
    }
}