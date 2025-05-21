//5. Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
//sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
//sobre o valor acumulado (salário base + gratificação).
import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        float a, b, b1, b2, c, c1, c2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        a = teclado.nextFloat();
        // contas malditas
        b = a/100;
        b1 = b*10;
        b2 = a+b1;
        c = b2/100;
        c1 = c*5;
        c2 = b2-c1;

        System.out.println("o salário a receber é: "+c2);
    }
}
