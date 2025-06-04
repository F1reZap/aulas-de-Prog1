//19. Implemente m programa que receba um número positivo, calcule e mostre:
// O número digitado elevado ao quadrado;
// O número digitado elevado ao cubo;
// A raiz quadrada do número;
// A raiz cúbica do número.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double Nr, e2, e3, r2, r3 ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu salario minimo: ");
        Nr = teclado.nextDouble();
        //contas malditas
        e2 = Math.pow(Nr,2);
        e3 = Math.pow(Nr,3);
        r2 = Math.sqrt(Nr);
        r3 = Math.cbrt(Nr);


        System.out.format("elevado a 2:  %.2f. ", e2);
        System.out.format(" elevado a 3:  %.2f. ", e3);
        System.out.format("raiz quadrada:  %.2f. ", r2);
        System.out.format("raiz cubica:  %.2f. ", r3);
        teclado.close();
    }
}
