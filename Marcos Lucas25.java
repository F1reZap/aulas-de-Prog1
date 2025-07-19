import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num = 2;
        int find = 0;
        System.out.println("Os 5 primeiros números perfeitos são:");

        while (find < 5) {
            int SD = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    SD += i;
                }
            }
            if (SD == num) {
                System.out.println(num);
                find++;
            }
            num++;
        }
        teclado.close();
    }
}
