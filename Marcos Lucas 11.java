//11. Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D
//submetida a uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via
//teclado. Utilize a fórmula:
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("D = ");
        double D = teclado.nextDouble();
        System.out.println("Q = ");
        double Q = teclado.nextDouble();
        double n;
        double pi = 3.14;

        if (D > 100){
            n = 2;
            double si = ((4*Q)/(pi*Math.pow(D,2)))*n;
            System.out.println("S = "+si);
        } else if (D < 50) {
            n = 6;
            double si = ((4*Q)/(pi*Math.pow(D,2)))*n;
            System.out.println("S = "+si);
        } else {
            n =4;
            double si = ((4*Q)/(pi*Math.pow(D,2)))*n;
            System.out.println("S = "+si);
        }


        teclado.close();
    }
}
