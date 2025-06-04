//24. possivel solução

import java.util.Scanner;


public class lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();



        //contas malditas
        double del = B * B - 4 * A * C;

        if (A == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else if (del > 0) {
            double X1 = (-B + Math.sqrt(del)) / (2 * A);
            double X2 = (-B - Math.sqrt(del)) / (2 * A);
            System.out.println("Duas raízes reais: X1= "+X1+". X2= "+X2);
        } else if (del == 0) {
            double X = -B / (2 * A);
            System.out.println("Uma raiz real X= "+X);
        } else {
            double PR = -B / (2 * A);
            double PI = Math.sqrt(-del) / (2 * A);
            System.out.println("Duas raízes complexas: X1= "+PR+" + "+PI+"i. X2= "+PR+ " - "+PI+"i");
        }
        scanner.close();
    }
}
