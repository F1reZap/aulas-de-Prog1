import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        int num = 0, o=2, imp=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero: ");
        num = teclado.nextInt();
        double verif1=0;
        boolean primo = false;
        while (o<=num){
            verif1 =num%o;
            if (verif1==0){
                primo = false;
            } else {
                primo = true;
            }
            o++;
        }
        if (num == 2){
            System.out.println(num+". é primo");
        } else if (verif1 != 0) {
            System.out.println(num+". é primo");
        } else {
            System.out.println(num+". não é primo");
        }


        teclado.close();
    }
}
