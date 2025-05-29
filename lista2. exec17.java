//17.  Faça um programa que receba de entrada um número real, encontre e mostre:
//a. A parte inteira desse número;
//b. A parte fracionária desse número.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("N° Real: ");
        double nr = teclado.nextDouble();
        //contas malditas
        int a1 = (int) nr;
        double b2 = nr - a1;
        System.out.println("Parte Inteira: " +a1);
        System.out.println("Parte Fracionária: " +b2);

        teclado.close();
    }
}
