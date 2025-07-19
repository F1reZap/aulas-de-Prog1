import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite um valor ");
        int N = teclado.nextInt();

        for (int i = 1 ; i <= N ; i++ ){
            int tab= i * N;
            System.out.println(i + " X " + N + " = "+ tab );
        }
        teclado.close();
    }
}
