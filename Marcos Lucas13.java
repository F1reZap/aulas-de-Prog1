import java.util.Scanner;

public class lista4 {
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        if (isPrimo(numero)) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
//    public static void main(String[] args) {
//        int num = 0, o=2, imp=1;
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("numero: ");
//        num = teclado.nextInt();
//        double verif1=0;
//        boolean primo = false;
//        while (o<=num){
//            verif1 =num%o;
//            if (verif1==0){
//                primo = false;
//            } else {
//                primo = true;
//            }
//            o++;
//        }
//        if (num == 2){
//            System.out.println(num+". é primo");
//        } else if (verif1 != 0) {
//            System.out.println(num+". é primo");
//        } else {
//            System.out.println(num+". não é primo");
//        }
//
//
//        teclado.close();
//    }
}
