//18. Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
//algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma
//residência, calcule e mostre:
//a. O valor pago por quilowatt;
//b. O valor a ser pago pelo consumo nessa residência;
//c. O valor a ser pago considerando um desconto de 15%.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double qwh, salmin, qwc, valp, vald, A ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu salario minimo: ");
        salmin = teclado.nextDouble();
        System.out.println("quantos quilowatts vc consumiu: ");
        qwc = teclado.nextDouble();
        //contas malditas
        qwh = (salmin/100)*20;
        valp = qwc*qwh;
        A = (valp/100)*15;
        vald = valp - A;

        System.out.format("o quilowatt hora vale:  %.2f R$.", qwh);
        System.out.format(" A residencia pagou:  %.2f R$.", valp);
        System.out.println(" Com o desconto de 15% ficaria: "+vald+ "R$.");
        teclado.close();
    }
}
