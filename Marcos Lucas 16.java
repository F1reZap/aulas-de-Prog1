//16. Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
//imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
//ou ano % 400 == 0))
import java.util.Scanner;

public class lista3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um ano: ");
        double ano = teclado.nextDouble();
        double anobi = ano%4;
        if (anobi == 0){
            System.out.println("Ano bisexto");
        } else {
            System.out.println("Ano Normal");
        }

        teclado.close();
    }
}
