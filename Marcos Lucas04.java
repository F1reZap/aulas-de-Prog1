import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        num = 0;
        while (num != -999){
            System.out.println("digite um valor: ");
            num = teclado.nextInt();
            if (num!=-999){
                int calc = num*3;
                System.out.println("N * 3 = "+calc);
            } else {
                System.out.println("Encerrado!");
            }
        }

    }
}
