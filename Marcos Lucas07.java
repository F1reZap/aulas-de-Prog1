import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double H = 0;
        int N = teclado.nextInt();
        for (int i = 1; i<=N; i++){
            H = H + 1.0/i;
        }
        System.out.println("H = "+H);
    }
}
