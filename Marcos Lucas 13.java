import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        int mumero = 0, veri1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digete um numero: ");
        mumero = teclado.nextInt();
        veri1=mumero%2;
        if (mumero!=2){
            if (veri1==0){
                System.out.println("Não é primo");
                System.out.println(veri1);
            } else {
                System.out.println(mumero+" é Primo");
            }
        } else {
            System.out.println("2 é primo");
        }

        teclado.close();
    }
}