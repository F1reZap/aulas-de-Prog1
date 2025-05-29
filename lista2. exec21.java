//21. Faça um programa que receba a medida do ângulo formado por uma escada apoiada e a altura da parede.
//Calcule e mostre a medida da escada para que a ponta da parede possa ser alcançada.

import java.util.Scanner;


public class lista2_21 {
    public static void main(String[] args){
        double Graus, H, pi, rad, sing, cal ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("medida do angulo: ");
        Graus = teclado.nextDouble();
        System.out.println("altura da parede: ");
        H = teclado.nextDouble();
        pi = 3.14;
        sing = Math.sin(Graus);
        //contas malditas
        rad = (pi*Graus)/180;
        cal = H/rad;

        System.out.format("O tamanho da escada é: %.2f", cal);
    }
}
