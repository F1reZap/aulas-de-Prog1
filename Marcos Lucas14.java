import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args) {
        double vet[] = new double[4];
        double prench=0;
        double media=0, mediaFinal=0, Dp=0;

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        for (int i=0; i<4; i++){
            prench = random.nextDouble(350, 450);
            vet[i]=prench;
            media+=vet[i];
        } System.out.println(Arrays.toString(vet));
        mediaFinal=media/4;
        for (int i =0; i<vet.length; i++){
            Dp += Math.pow(vet[i]-media, 2);
        }
        Dp = Math.sqrt(Dp/(vet.length-1));
        System.out.println("Desvio padrão da linha: "+Dp);
        if ((mediaFinal-Dp)>=385 && (mediaFinal-Dp)<=395){
            System.out.println("Produção OK");
        } else {
            System.out.println("Revisar Produção");
        }
    }
}