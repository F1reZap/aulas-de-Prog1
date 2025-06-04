//14. Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m², deve-se usar 18 W de
//potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
//mostre a área de mesmo (em m²) e a potência de iluminação necessária para iluminar corretamente o
//cômodo.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double La, Lb, c1, c2, c3, W;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor da base maior: ");
        La = teclado.nextDouble();
        System.out.println("digite o valor da base menor: ");
        Lb = teclado.nextDouble();
        W = 18;

        //contas malditas
        c2 = La*Lb;
        c3 = c2*W;

        System.out.println("A quantidade de watts necessária é: "+c3+ ", A Área é: "+c2+ "M².");
    }
}
