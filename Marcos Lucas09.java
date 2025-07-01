import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double calc = 0;
        double calc2 = 0;
        double N = 0;
        int i = 1;
        while(N!=-1){
            System.out.println("digite um numero: ");
            N = teclado.nextDouble();
            if (N!=-1){
                calc = N + calc;
                i = i+1;
                calc2 = calc/i;
                System.out.println("Soma: "+calc+ " média: "+calc2);
            } else {
                System.out.println("Encerrado!");
            }
        }

    }
}
