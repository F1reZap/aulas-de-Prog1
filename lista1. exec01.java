//1. Crie um algoritmo que calcule a soma e a média de 3 números informados pelo usuário.

import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        float a, b, c, d, e;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os numeros: ");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        //soma
        d = a+b+c;
        e = d/3;
        System.out.println("A soma é: "+d+". e a média é: "+e );
    }
}
