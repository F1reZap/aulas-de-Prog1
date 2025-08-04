import java.util.Arrays;

public class lista5 {
    public static void main(String[] args) {
        //Normal:
//        int[] primos = new int[10];
//        int count = 0;
//        int num = 101;
//
//        while (count < 10) {
//            boolean ehPrimo = true;
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    ehPrimo = false;
//                    break;
//                }
//            }
//            if (ehPrimo) {
//                primos[count] = num;
//                count++;
//            }
//            num++;
//        }
//        System.out.println("Os 10 primeiros primos a partir de 100: " + Arrays.toString(primos));
        //Crivo do caba lá:
        int limite = 200; 
        boolean[] ehPrimo = new boolean[limite + 1];
        Arrays.fill(ehPrimo, true);
        ehPrimo[0] = false;
        ehPrimo[1] = false;
        for (int i = 2; i * i <= limite; i++) {
            if (ehPrimo[i]) {
                for (int j = i * i; j <= limite; j += i) {
                    ehPrimo[j] = false;
                }
            }
        }
        int[] primos = new int[10];
        int count = 0;
        for (int i = 101; i <= limite && count < 10; i++) {
            if (ehPrimo[i]) {
                primos[count] = i;
                count++;
            }
        }
        System.out.println("Os 10 primeiros primos a partir de 100 (Crivo): " + Arrays.toString(primos));
    }
}