import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int N = teclado.nextInt();
        double cal = 0;
        double cal2 = 0;
        for (int i =1; i<=N; i++){
            cal = cal+i;


        }
        cal2 = cal/N;
        System.out.println("Soma: "+cal+ " media: "+cal2);
    }
}
