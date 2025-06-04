//Implemente um algoritmo que receba o número de lados de um polígono convexo regular, calcule e mostre
//o número de diagonais desse polígono. Sabe-se que ND = N*(N – 3)/2, em que N representa o número de
//lados do polígono.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        double n, R;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero de lados do poligono: ");
        n = teclado.nextDouble();
        //contas malditas
        R = n*(n-3)/2;

        System.out.println("O numero de diagonais desse poligono é: "+R);
    }
}
