//11. João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de
//2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e
//mostre quanto restará de salário após o pagamento das duas contas.

import java.util.Scanner;

public class pericles {
    public static void main(String[] args) {
        float ca, cb, cc, a1, a2, a3, a4, t1, t2, t3, t4 ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        ca = teclado.nextFloat();
        System.out.println("Digite o valor da 1ª conta: ");
        cb = teclado.nextFloat();
        System.out.println("Digite o valor da 2ª conta: ");
        cc = teclado.nextFloat();
        // contas malditas
        a1 = cb/100;
        a2 = cc/100;
        a3 = a1*2;
        a4 = a2*2;
        t1 = cb+a3;
        t2 = cc+a4;
        t3 = ca-t1;
        t4 = t3-t2;

        System.out.println("o salário restante é: "+t4);
    }
}
