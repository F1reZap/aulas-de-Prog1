//Faça um algoritmo que calcule a área e o perímetro de um retângulo recebendo de entrada os valores dos
//lados.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        double La, Lb, c1, c2, c3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor da base maior: ");
        La = teclado.nextDouble();
        System.out.println("digite o valor da base menor: ");
        Lb = teclado.nextDouble();

        //contas malditas
        c1 = 2*(La+Lb);
        c2 = La*Lb;

        System.out.println("O Perimetro é: "+c1+ ", A Área: "+c2+;
    }
}
