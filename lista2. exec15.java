//15.Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
//como constante de valor 3.1416

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double A, Pi, R;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o Raio da Circunferencia: ");
        R = teclado.nextDouble();
        Pi = 3.1416;
        //contas malditas
        A = (R*R)*Pi;
        System.out.format("A área da circunferencia é: %.2f", A);
    }
}
