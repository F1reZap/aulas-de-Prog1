//22. Implemente m programa que receba um número positivo, calcule e mostre:
// O número digitado elevado ao quadrado;
// O número digitado elevado ao cubo;
// A raiz quadrada do número;
// A raiz cúbica do número.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor A: ");
        int A = teclado.nextInt();
        System.out.println("Valor B: ");
        int B = teclado.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Após a Troca:");
        System.out.println("valor A: "+B+". Valor B: "+A);

        teclado.close();
    }
}
