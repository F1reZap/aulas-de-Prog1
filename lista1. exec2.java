//2. Ler um número inteiro e imprimir o seu sucessor e seu antecessor.

import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        float a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os numeros: ");
        a = teclado.nextFloat();
        //garotos de programa express
        b = a-1;
        c = a+1;

        System.out.println("o numero: "+a+ ". tem como antecessor o numero: "+b+ ". e como sucessor o numero: "+c);
    }
}