import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int ano = 2015;
        double popA = 500000;
        double popB = 700000;

        while (popA <= popB) {
            popA = popA + (popA * 0.03);
            popB = popB + (popB * 0.02);
            ano++;
        }
        System.out.println("A população do país A ultrapassará a do país B em " + ano + ".");
        System.out.println("População A: " + (int) popA);
        System.out.println("População B: " + (int) popB);
    }
}