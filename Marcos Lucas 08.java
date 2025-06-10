//08.crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de X: ");
        double x = teclado.nextDouble();

        if (x <= 1){
            System.out.println("F(x) = 1");
        } else if (x > 1 && x<=2) {
            System.out.println("F(x) = 2");
        } else if (x>2 && x<=3) {
            System.out.println("F(x) = X²");
        } else if (x>3) {
            System.out.println("F(x) = X³");
        } else{
            System.out.println("Guatafaqui amigo usted está reloco");
        }

        teclado.close();
    }
}