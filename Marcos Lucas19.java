import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int NumOrig = teclado.nextInt();

        int N = NumOrig;
        int inv = 0;


        while (N > 0) {
            int dig = N % 10;
            inv = inv * 10 + dig;
            N = N / 10;
        }


        if (NumOrig == inv) {
            System.out.println(NumOrig + " é um palíndromo.");
        } else {
            System.out.println(NumOrig + " não é um palíndromo.");
        }
    }
}