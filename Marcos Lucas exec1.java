import java.util.Scanner;

public class exec1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um numero (0 para fechar o código); ");
            num = teclado.nextInt();

            if (num > 0){
                if (num % 2 ==0){
                    num = num*3;
                    System.out.println("num*3: "+num);
                } else {
                    num = num*2;
                    System.out.println("num*2: "+num);
                }
            } else if (num<0) {
                num = num*num;
                System.out.println("num^2: "+num);
            }
        } while (num != 0);
        teclado.close();

    }
}
