//9.Refaça o exercício referente à equação do segundo grau do roteiro anterior considerando todas as
//condições possíveis, conforme fluxograma abaixo
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de a, b e c: ");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        if (a == 0){
            System.out.println("Não é uma equação de 2º grau");
            if (b != 0){
                double r = -c/b;
                System.out.println("r = " +r);
            } else if (b == 0) {
                System.out.println("Não é uma equação de 1º grau");
            } else {
                System.out.println("Como? pt2");
            }
        } else if (a != 0) {
            double d = (b*b)-(4*a*c);
            if (d < 0){
                System.out.println("Não há raízes reais");
            } else if (d >= 0) {
                double r1, r2;
                r1 = (-b - Math.sqrt(d))/(2*a);
                r2 = (-b + Math.sqrt(d))/(2*a);
                System.out.println("r1:" +r1+ ". r2: " +r2);
            } else {
                System.out.println("Como????? pt3");
            }
        } else {
            System.out.println("Como? pt1");
        }

        teclado.close();
    }
}
