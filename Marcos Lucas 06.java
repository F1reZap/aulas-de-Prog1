//6.Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior a R$700,00 e 10% aos
//funcionários com salário superior ou igual a R$700,00. Faça um algoritmo que calcule o reajuste e mostre
//o novo salário.
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu salário: ");
        double sal = teclado.nextDouble();

        if (sal < 700 && sal > 0){
            double salf;
            salf  = ((sal/100)*30)+sal;
            System.out.println("seu novo salário é: " +salf+" R$");
        } else if (sal >= 700) {
            double salf;
            salf = ((sal/100)*10)+sal;
            System.out.println("seu novo salário é: " +salf+" R$");
        } else {
            System.out.println("COMO?????????????????");
        }

        teclado.close();
    }
}
